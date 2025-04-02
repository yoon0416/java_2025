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
		<h3 class="card-header">REQUEST-요청</h3>
		<!-- action, method, name -->
		<!-- action="처리", method=데이터넘기는방법, name=데이터보관이름 -->
	  <p class="alert alert-warning">
         https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=apple  <br/>
         1. 처리컨테이너 :  https://search.naver.com/search.naver  <br/>
         2. 처리방식    :  get
         3. 보관용기    :  query 
      </p>
		<form action="https://search.naver.com/search.naver" method="get">
			<div class="mb-3 mt-3">
				<label for="query" class="form-label">Email:</label> 
				<input type="text" class="form-control" id="query"
					placeholder="네이버에게 물어봐" name="query">
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>