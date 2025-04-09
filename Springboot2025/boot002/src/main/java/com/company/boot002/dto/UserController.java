package com.company.boot002.dto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	@RequestMapping("/ex1") //맨 마지막 /ex1로 url
	@ResponseBody
	public String test1() {
		return "springboot";
	}
	
	@RequestMapping("/ex2") // 위에설명
	public String test2(Model model) {
		model.addAttribute("t1", "ex2 출력"); //html에 연결!
		return "test1"; //html이름
	}
	
	@RequestMapping("/ex3")
	public String basic3() {
		return "ex2";
	}
	
}
