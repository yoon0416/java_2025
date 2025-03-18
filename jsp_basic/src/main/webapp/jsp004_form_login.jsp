
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
		<form action="from_login_result.jsp" method="get">
    <div class="mb-3 mt-3">
        <label for="email" class="form-label">EMAIL</label> 
        <input type="text" class="form-control" id="email" name="email">
    </div>
    <div class="mb-3 mt-3">
        <label for="pw" class="form-label">PASSWORD</label> 
        <input type="password" class="form-control" id="pw" name="pw">
    </div>
    <div class="mb-3 mt-3">
        <label for="remember" class="form-label">REMEMBER</label>
        <input type="checkbox" class="form-check-input" id="remember" name="remember" value="on"/>
        
        <input type="hidden" name="remember" value="off"/>
    </div>
    <button type="submit" class="btn btn-danger" title="Login하러가기">로그인</button>
</form>
		
	</div>
</body>
</html>