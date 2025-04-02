
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body>
	<div class="container card my-5">
		<h3 class="card-header">radio - 단일선택</h3>
		<%
		// 주소?username = sally&option=dog&option1=cat
		//1 넘겨주는 데이터 확인
		String username1 = request.getParameter("username");
		String optradio1 = request.getParameter("optradio");
		%>
		<table class="table table-striped">
			<caption>radio 데이터 확인</caption>
			<tbody>
				<tr><th scope="row">USER</th><td><%=username1 %></td></tr>
				<tr><th scope="row">radio</th><td><%=optradio1 %></td></tr>
			</tbody>
		</table>
	</div>
</body>
</html>