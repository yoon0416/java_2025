package com.company.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.company.dto.BoardDto;
import com.company.service.BoardService;

@Controller
@RequestMapping("/board")
public class BasicController {

    @Autowired
    BoardService service;

    // 전체 리스트 가져오기
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("list", service.selectAll());
        return "board/list";
    }

    // 글쓰기 폼
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create() {
        return "board/write";
    }

 // 글쓰기 기능
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create_post(BoardDto dto, HttpServletRequest request, RedirectAttributes rttr) {
        
        if (dto != null) {
            // 1. IP 가져오기
            String ip = request.getRemoteAddr();
            if ("0:0:0:0:0:0:0:1".equals(ip) || "::1".equals(ip)) {
                ip = "127.0.0.1"; // IPv6 -> IPv4 변환
            }
            dto.setBip(ip); // IP 세팅
            
            // 2. 글쓰기(insert) 실행
            String result = "fail";
            if (service.insert(dto) > 0) {
                result = "success";
            }
            
            // 3. 결과 flashAttribute로 저장
            rttr.addFlashAttribute("result", result);
        }
        
        // 4. list로 리다이렉트
        return "redirect:/board/list";
    }

    // view 페이지에 redirect한 결과를 넘겨줄 수 있는 방법
    // board/list.jsp 파일에서 result 한 결과를 알림창 1번만 처리
    // refresh(새로고침) result가 유지안됨
    /////////////////////////////////

    // 상세 보기
    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public String detail(Model model, int bno) {
        model.addAttribute("dto", service.detail(bno));
        return "board/detail";
    }

    // 글 수정 폼
    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String edit(Model model, int bno) {
        model.addAttribute("dto", service.updateFrom(bno));
        return "board/edit";
    }

    // 글 수정 기능
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String edit_post(BoardDto dto) {
        if (dto != null) {
            service.update(dto);
        }
        return "redirect:/board/detail?bno=" + dto.getBno();
    }

    // 글 삭제 폼
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete() {
        return "board/delete";
    }

    // 글 삭제 기능
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete_post(BoardDto dto) {
        if (dto != null) {
            service.delete(dto);
        } 
        return "redirect:/board/list";
    }
}
