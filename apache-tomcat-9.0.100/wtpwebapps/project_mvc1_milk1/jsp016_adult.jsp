
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
		<h3 class="card-header">ㅎㅇ</h3>
		<p class="alert alert-success"><%=request.getParameter("userage") %>살! 고객님을 위한 추천입니다</p>
		<p><a href="javascript:history.go(-1)" class="btn btn-success" >BACK</a></p>
	</div>
</body>
</html>