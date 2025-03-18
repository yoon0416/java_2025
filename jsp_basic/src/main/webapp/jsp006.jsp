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
	<div class="container card my-5">
		<h3 class="card-header">[JPS 기본요소]001. 주석</h3>
		<div class="alert alert-warning">코드설명글</div>
		<!-- html 주석 -->
		<%-- jsp 주석 --%>
		<% //java 주석 %>

		<h3 class="card-header">[JSP 기본요소]002. 페이지지시자</h3>
		<%@page import="java.util.ArrayList"%>
		
		<h3 class="card-header">[JSP 기본요소]003. 스트립트립</h3>
		<div class="alert alert-warning">자바코드 - 컨트롤+스페이스바</div>
		<% 
			ArrayList<String> list = new ArrayList<>(); 
			list.add("one"); list.add("two"); list.add("three");
		%>
		
		<h3 class="card-header">[JSP 기본요소]004. 표현식</h3>
		<%=list %>
		
		<h3 class="card-header">[JSP 기본요소]005. 선언</h3>
		<%! int global=0; public String company(){return "(주)TheJoA";} %>
		<%
			int local=0; %>
		<%= ++global %>
		<%= ++local %>
		<p>copyright &copy;<%=company() %> all rights reserve.</p>
	</div>
	
</body>
</html>