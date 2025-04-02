
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	// jsp022_logout.jsp
	// 1. session 초기화코드
	// 2. login.jsp 페이지로 넘기기 (10초뒤에)
	session.invalidate();
	// out.println("<script>alert('로그아웃합니다.'); location.href='jsp022_login.jsp';</script>"); //동작안함
	 response.sendRedirect("jsp022_login.jsp"); //알림창 띄우기 힘듦
	
	//ver-3 새로고침
	out.println("<meta http-equiv= 'refresh' content='2; url=jsp002_login.jsp' />");
	 
	 
	 
	 
	 // >>>> sendRedirect/dispatcher의 차이점
	// request.getRequestDispatcher("jsp022_my.jsp").forward
	 
%>