package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasciController {
	
	@RequestMapping("/")
	public String basic() { return "home"; }
	
	@RequestMapping("/basic1.do")
	public String list( Model model) { //처리결과 Model 객체에 담기
		//1. 처리하고
		model.addAttribute("result", "sally"); //1. 처리하고
		//return "basic1.jsp"; //2. 경로
		return "basic1";
	}
	
}
