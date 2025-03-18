
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
		<p style="text-align: center;"><img src="images/login.png" alt="login"></p>
		<form action="jsp_score_result.jsp" method="post">
    <div class="mb-3 mt-3">
        <label for="kor" class="form-label">KOR: </label> 
        <input type="text" class="form-control" id="kor" name="kor">
    </div>
    <div class="mb-3 mt-3">
        <label for="eng" class="form-label">ENG: </label> 
        <input type="text" class="form-control" id="eng" name="eng">
    </div>
      <div class="mb-3 mt-3">
        <label for="math" class="form-label">MATH: </label> 
        <input type="text" class="form-control" id="math" name="math">
    </div>
    <button type="submit" class="btn btn-danger" title="pro">성적처리프로그램입니다.</button>
</form>
		
	</div>
</body>
</html>