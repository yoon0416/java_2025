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
		<h3 class="card-header">MY SEARCH</h3>
		<pre>
			1. action   : jsp007_result.jsp
			2. method   : get
			3. 입력보관이름 : para
		</pre>
		<!-- action, method, name -->
		<!-- action="처리", method=데이터넘기는방법, name=데이터보관이름 -->
	  <p class="alert alert-warning">
         https://www.google.com/search?q=APPLE<br/>
         1.처리컨테이너 : https://www.google.com/search <br/>
         2.처리방식      : get <br/>
         3.보관용기      : query <br/>
      </p>
		<form action="https://www.google.com/search" method="get">
			<div class="mb-3 mt-3">
				<label for="query" class="form-label">Email:</label> 
				<input type="text" class="form-control" id="query"
					placeholder="구글 물어봐" name="query">
			</div>
			<button type="submit" class="btn btn-danger" >Submit</button>
		</form>
	</div>
</body>
</html>
