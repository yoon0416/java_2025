
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
		<h3 class="card-header">checkbox - 다중선택</h3>
		<%
		// 주소?username = sally&option=dog&option1=cat
		//1 넘겨주는 데이터 확인
		String username = request.getParameter("username");
		String[] options1 = request.getParameterValues("option1");
		%>
		<table class="table table-striped">
			<caption>checkbox 데이터 확인</caption>
			<tbody>
				<tr><th scope="row">USER</th><td><%=username %></td></tr>
				<tr><th scope="row">CHECK</th><td><%=Arrays.toString(options1) %></td></tr>
			</tbody>
		</table>
	</div>
</body>
</html>