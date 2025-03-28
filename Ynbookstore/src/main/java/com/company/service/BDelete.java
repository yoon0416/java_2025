package com.company.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.BoardDao;
import com.company.domain.BoardVO;

public class BDelete implements BoardService {

	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1 언어세팅
		 request.setCharacterEncoding("UTF-8");  
	     response.setContentType("text/html; charset=UTF-8");
	     
	     //2
		 int bno = Integer.parseInt(request.getParameter("bno"));
		 
		 //3
	 	BoardDao dao = new BoardDao();
		
		
		//4
		request.setAttribute("result", String.valueOf(dao.delete(bno)) );
		 
		 //http://localhost:8080/Ynbookstore/delete.do?bno=10

	}

}
