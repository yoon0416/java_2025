package com.company.boot003.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.company.boot003.dto.Board;
import com.company.boot003.service.BoardSerivce;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardController {
	//ver-1 @Autowired BoardSerivce service;
	
	private final BoardSerivce service;
	
	
	@GetMapping("/board/list")
	public String list(Model model){
		model.addAttribute("list", service.findAll()); //##전체리스트 뽑고
		return "board/list"; //board폴더 안에 / list파일
	} //http://localhost:8080/board/list
    	
	@GetMapping("/board/detail/{id}")
	public String detail(@PathVariable Long id, Model model){
		model.addAttribute("dto", service.find(id)); //##조회수 올리고 / 상세보기 기능
		return "board/detail"; 
	} //http://localhost:8080/board/detail/1
	
	
	@GetMapping("/board/insert")
	public String insert_get(Model model) {
	    model.addAttribute("dto", new Board()); // 폼 렌더링을 위해 비어있는 객체 추가
	    return "board/insert"; 
	} 
	// http://localhost:8080/board/insert // 글쓰기 폼

	@PostMapping("/board/insert")
	public String insert_post(Board board,@RequestParam Long member_id) {
	    service.insert(board,member_id);  // ## 글쓰기 기능
	    return "redirect:/board/list"; 
	} 
	// http://localhost:8080/board/insert // 글쓰기 기능 - 갱신된 리스트

	
	
	@GetMapping("/board/update/{id}")
	public String update_get(@PathVariable Long id, Model model){ 
		model.addAttribute("dto", service.update_view(id)); //## 수정할 글 가져오기
		return "board/update";
		} 
	//http://localhost:8080/board/update/1 //글수정폼
	
	@PostMapping("/board/update")
	public String update_post(Board board,RedirectAttributes rttr ){
		String msg="fail";
		if(service.update(board) > 0) {
			msg="글수정성공!";
		}
		rttr.addFlashAttribute("msg", msg);
		return "redirect:/board/detail/"+board.getId();
	} 
	
	
	@GetMapping("/board/delete/{id}")
	public String delete_get(@PathVariable Long id, Model model) {
	    model.addAttribute("id", id); // 폼에 넘길 id를 모델에 담아줘야 한다
	    return "board/delete";
	}

	
	@PostMapping("/board/delete")
	public String delete_post(Board board, RedirectAttributes rttr){
		String msg="fail";
		if(service.delete(board) > 0) {
			msg="글삭제성공!";
		}
		rttr.addFlashAttribute("msg", msg);
		return "redirect:/board/list";
	} //http://localhost:8080/board/delete //글 삭제기능
	
	
	
	
	
	
	
	
	
	
}//end controller
/*Restful api
기존게시판     : localhost:8080/board/detail?bno=10 쿼리스트링
Restful api : localhost:8080/board/detail/bno/10 쿼리스트링
	1) resultful - http url을 기반으로 자원에 접근해서 서비스를 제공하는 애플리케이션
	2) api     - 
	3) method ( GET : 검색 / POST : 생성 / PATCH(부분업데이트), PUT(전체업데이트)  / DELETE : 삭제 )
	4) DATA - json, xml

*/