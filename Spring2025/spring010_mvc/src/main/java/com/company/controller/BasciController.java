package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasciController {
	
	@RequestMapping("/")
	public String basic() { return "home"; }
	
	@RequestMapping("/basic1.do")
	public String list( Model model) { //ó����� Model ��ü�� ���
		//1. ó���ϰ�
		model.addAttribute("result", "sally"); //1. ó���ϰ�
		//return "basic1.jsp"; //2. ���
		return "basic1";
	}
	
}
