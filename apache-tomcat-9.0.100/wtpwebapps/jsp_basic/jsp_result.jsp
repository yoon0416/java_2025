
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
		<h3 class="card-header">MY 검색어</h3>
		<%
			String search = request.getParameter("para");
		%>
		<p>검색어 : <%=search %></p>
		<p><a href="javascript:history.go(-1)" class="btn btn-danger">BACK</a></p>
	</div>
</body>
</html>