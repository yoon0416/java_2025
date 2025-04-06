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

    // ��ü ����Ʈ ��������
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("list", service.selectAll());
        return "board/list";
    }

    // �۾��� ��
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create() {
        return "board/write";
    }

 // �۾��� ���
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create_post(BoardDto dto, HttpServletRequest request, RedirectAttributes rttr) {
        
        if (dto != null) {
            // 1. IP ��������
            String ip = request.getRemoteAddr();
            if ("0:0:0:0:0:0:0:1".equals(ip) || "::1".equals(ip)) {
                ip = "127.0.0.1"; // IPv6 -> IPv4 ��ȯ
            }
            dto.setBip(ip); // IP ����
            
            // 2. �۾���(insert) ����
            String result = "fail";
            if (service.insert(dto) > 0) {
                result = "success";
            }
            
            // 3. ��� flashAttribute�� ����
            rttr.addFlashAttribute("result", result);
        }
        
        // 4. list�� �����̷�Ʈ
        return "redirect:/board/list";
    }

    // view �������� redirect�� ����� �Ѱ��� �� �ִ� ���
    // board/list.jsp ���Ͽ��� result �� ����� �˸�â 1���� ó��
    // refresh(���ΰ�ħ) result�� �����ȵ�
    /////////////////////////////////

    // �� ����
    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public String detail(Model model, int bno) {
        model.addAttribute("dto", service.detail(bno));
        return "board/detail";
    }

    // �� ���� ��
    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String edit(Model model, int bno) {
        model.addAttribute("dto", service.updateFrom(bno));
        return "board/edit";
    }

    // �� ���� ���
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String edit_post(BoardDto dto) {
        if (dto != null) {
            service.update(dto);
        }
        return "redirect:/board/detail?bno=" + dto.getBno();
    }

    // �� ���� ��
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete() {
        return "board/delete";
    }

    // �� ���� ���
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete_post(BoardDto dto) {
        if (dto != null) {
            service.delete(dto);
        } 
        return "redirect:/board/list";
    }
}
