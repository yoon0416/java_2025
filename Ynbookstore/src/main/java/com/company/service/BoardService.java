package com.company.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BoardService {
	public void exec(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException;
}
