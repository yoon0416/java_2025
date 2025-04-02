<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>    
<%  response.setStatus(200); %>  
  
<!DOCTYPE html>
<html  lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<script>
window.onload=function(){ //브라우저가.로딩되면 = 처리해주세요{ }
	let result = document.querySelector(".result");
	result.style.textAlign = "center";
	//console.log(result);
	window.setTimeout( ()=>{ 
		//console.log("...3초뒤에실행");  
		location.href='jsp019_error.jsp';
	} ,  10000 ); //1000이 1초
};
</script>

</head>
<body><!-- jsp019_error_500.jsp -->
	<div class="container card  bg-info my-5">
		<h3 class="card-header bg-info  text-white"> ERROR 500 </h3>
		<p  class="text-center bg-white  p-3">
			<%=exception.getMessage() %>
		</p> 
		<h4>error</h4>
		<a href="no">없는페이지</a>
		<%=null %>
	</div>
</body>
</html> 








