package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.dto.UserDto;
import com.company.service.UserService;

@Controller
public class UserController {
	@Autowired UserService service;
	
//	@RequestMapping( value= "/list.user", method=RequestMethod.GET)
//	@GetMapping("/list.user")
	@RequestMapping( "/list.user" )
	public String list(Model model) {
		model.addAttribute("list", service.selectAll());//ó���ϰ�
		return "users/list"; //ȭ��
	}
	
	// detail.user - get  ��� �ش��ȣ�� ����� ����      users/select.jsp ����	@RequestMapping( "/detail.user")
	public String detail(Model model, int no) {	
		//System.out.println(no);
		model.addAttribute("dto", service.selectOne(no));
		return "users/select"; 
	} //http://localhost:8080/spring012_useful/detail.user?no=1
	
	
	
	// insert.user - Post ��� �۾��� ���              list.user
	@RequestMapping(value = "/insert.user", method=RequestMethod.POST)
	public String insert(UserDto dto) { //UserDto �ȿ� �Ӽ��� name, age 
		if(dto != null) {service.insert(dto);}
		return "redirect:/list.user";
	}
	
	
	// update.user - Post ��� �ۼ��� ���              list.user
	@RequestMapping(value = "/update.user", method=RequestMethod.POST)
	public String update(UserDto dto) { //UserDto �ȿ� �Ӽ��� name, age 
		if(dto != null) {service.update(dto);}
		return "redirect:/list.user";
	}
	
	
	// delete.user - get  ��� �ۻ��� ���              list.user
	@RequestMapping(value = "/delete.user", method=RequestMethod.GET)
	public String delete(int no) {
	    service.delete(no);
	    return "redirect:/list.user";
	} //http://localhost:8080/spring012_useful/delete.user?no=1
}





















