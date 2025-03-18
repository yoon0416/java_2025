<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="alert alert-warning" style=font-size:1.5em>
		<h3 class="card-header">로그인 result</h3>
		<%
			String em = request.getParameter("email");
			String pw = request.getParameter("pw");
			String re = request.getParameter("remember"); 
		%>
			<p>EMAIL : <%= (em == null || em.isEmpty()) ? "입력안함" : em %></p>
			<p>PASS : <%= (pw == null || em.isEmpty()) ? "입력안함" : pw %></p>
			<p>remember : <%= re != null ? re : "off" %></p> 
		<p><a href="jsp004_form_login.jsp" class="btn btn-danger">BACK</a></p>
	</div>
</body>
</html>
