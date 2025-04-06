<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>spring 유용한기능</title>

<!-- Latest compiled and minified CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<div class="contaiber card">
		<h3 class="carad-header bg-success text-white">USERS</h3>
		<!-- for( UserDto u : list ){} -->
		<c:forEach var="u" items="${list}" varStatus="status">
			<div class="alert alert-warning my-3">
				<a href="detail.user?no=${u.no}"> <!-- 링크걸기 -->
			NO : ${u.no} ◎ NAME : ${u.name }  ◎ AGE : ${u.age }
				</a>
				<a href="delete.user?no=${u.no}" class="btn btn-danger">삭제</a>
			</div>	
		</c:forEach>
	</div>
	
	<!-- insert -->
	<div class="container card">
		<form method="post" action="insert.user" id="userInsert">
			<fieldset>
				<legend>유저입력폼</legend>
				<div class="form-group">
					<label for="name4">이름</label> <input type="text" name="name"
						id="name4" class="form-control" />
				</div>
				<div class="form-group">
					<label for="age4">나이</label> <input type="number" name="age"
						id="age4" class="form-control" />
				</div>
				<div class="form-group">
					<input type="submit" value="전송" class="btn  btn-danger" />
				</div>
			</fieldset>
		</form>
	</div>
	
	<!-- 업데이트 -->
		<div class="container card">
		<form method="post" action="update.user" id="userUpdate">
			<fieldset>
				<legend>유저 수정폼</legend>
				<div class="form-group">
					<label for="name4">번호</label> 
					<input type="number" name="no" id="no_u" class="form-control" />
				</div>
				<div class="form-group">
					<label for="age5">이름</label> 
					<input type="text" name="name" id="name_u" class="form-control" />
				</div>
					<div class="form-group">
					<label for="age4">나이</label> 
					<input type="number" name="age" id="age_u" class="form-control" />
				</div>
				<div class="form-group">
					<input type="submit" value="수정" class="btn  btn-danger" />
				</div>
			</fieldset>
		</form>
	</div>
	
	<script>
window.onload = function () {
    document.getElementById("userInsert").onsubmit = function () {
        const name = document.getElementById("name4").value.trim();
        const age = document.getElementById("age4").value.trim();

        if (name === "") {
            alert("이름을 입ㄹ");
            document.getElementById("name4").focus();
            return false;
        }
 
        if (age === "") {
            alert("나이를 입력");
            document.getElementById("age4").focus();
            return false;
        }

        return true;
    };
};
</script>
</body>
</html>






















