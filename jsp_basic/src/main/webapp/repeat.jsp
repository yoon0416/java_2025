
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
		<h3 class="card-header">Google search</h3>
		<form action="https://www.google.com/search" method="get">
		<div class="my-3">
			<label for="query" class="form-Label">검색어</label>
			<input type="text" class="form-control" id="query" name="q"/>
			<button type="submit" class="btn btn-danger" >Submit</button>
		</div>
		</form>
	</div>
</body>
</html>