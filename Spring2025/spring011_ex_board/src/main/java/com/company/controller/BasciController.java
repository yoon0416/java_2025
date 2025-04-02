package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board")
public class BasciController {

	
	@RequestMapping(value = "/list", method=RequestMethod.GET)
	public String list() { return "board/list"; }
	//http://localhost:8080/spring011_ex_board/board/list.do
	
	@RequestMapping(value = "/create", method=RequestMethod.GET)
	public String create() { return "board/write"; }
	
	@RequestMapping(value = "/create", method=RequestMethod.POST)
	public String create_post() { return "board/write"; }
	
	@RequestMapping(value = "/detail", method=RequestMethod.GET)
	public String detail() { return "board/detail"; }
	
	@RequestMapping(value = "/edit", method=RequestMethod.GET)
	public String edit() { return "board/edit"; }
	
	@RequestMapping(value = "/edit", method=RequestMethod.POST)
	public String edit_post() { return "board/edit"; }
	
	@RequestMapping(value = "/delete", method=RequestMethod.GET)
	public String delete() { return "board/delete"; }
	
	@RequestMapping(value = "/delete", method=RequestMethod.POST)
	public String delete_post() { return "board/delete"; }
	
	
	
	
	
	/*
	@RequestMapping(value = "/board/list", method=RequestMethod.GET)
	public String list() { return "board/list"; }
	//http://localhost:8080/spring011_ex_board/board/list.do
	
	@RequestMapping(value = "/board/create", method=RequestMethod.GET)
	public String create() { return "board/write"; }
	
	@RequestMapping(value = "/board/create", method=RequestMethod.POST)
	public String create_post() { return "board/write"; }
	
	@RequestMapping(value = "/board/detail", method=RequestMethod.GET)
	public String detail() { return "board/detail"; }
	
	@RequestMapping(value = "/board/edit", method=RequestMethod.GET)
	public String edit() { return "board/edit"; }
	
	@RequestMapping(value = "/board/edit", method=RequestMethod.POST)
	public String edit_post() { return "board/edit"; }
	
	@RequestMapping(value = "/board/delete", method=RequestMethod.GET)
	public String delete() { return "board/delete"; }
	
	@RequestMapping(value = "/board/delete", method=RequestMethod.POST)
	public String delete_post() { return "board/delete"; }
	
	*/
	
	
	/*
	@RequestMapping("/board/write.do")
	public String write(Model model) {
		//1. 처리하고
	//	model.addAttribute("write", "write"); //1. 처리하고
		//return "basic1.jsp"; //2. 경로
		return "board/write";
	}
	
	@RequestMapping("/board/detail.do")
	public String detail(Model model) {
		//1. 처리하고
	//	model.addAttribute("detail", "detail"); //1. 처리하고
		//return "basic1.jsp"; //2. 경로
		return "board/detail";
	}
	
	@RequestMapping("/board/edit.do")
	public String edit(Model model) {
		//1. 처리하고
	//	model.addAttribute("edit", "edit"); //1. 처리하고
		//return "basic1.jsp"; //2. 경로
		return "board/edit";
	}
	
	@RequestMapping("/board/delete.do")
	public String delete(Model model) {
		//1. 처리하고
	//	model.addAttribute("delete", "delete"); //1. 처리하고
		//return "basic1.jsp"; //2. 경로
		return "board/delete";
	}
	
	*/
}
