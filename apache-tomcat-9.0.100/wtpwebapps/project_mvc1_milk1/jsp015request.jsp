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
	<div class="container card bg-dark my-5">
		<h3 class="card-header text-white">내장객체</h3>
		<pre style="color: white">
		1. jsp페이지가 웹컨테이너에 의해 서블릿으로 변환될 때
		2. 고정된 이름의 객체 컨테이너로 자동으로 구현
		3. request(요청), response(응답), session(정보저장), out(출력)
		</pre>
	</div>
	<div class="container card bg-dark my-5">
		<h3 class="card-header bg-dark text-white">request(요청)</h3>
		<pre style="color: white">
		1. action = "처리컴포넌트"
		2. method = "처리방식"
		3. name ="사용자가 입력한 값 보관이름"
		</pre>
		<form action="jsp015_checkbox.jsp" method="get"
			onsubmit="return checkbox()">
			<div class="mb-3 mt-3" style="color: white">
				<label for="username" class="form-label">name</label> <input
					type="text" class="form-control" id="username"
					placeholder="이름 입력하세요" name="username">
			</div>
			<!-- user name -->
			<div class="form-check" style="color: white">
				<input class="form-check-input" type="checkbox" id="check1"
					name="option1" value="dog"> <label class="form-check-label"
					for="check1">Dog</label>
			</div>
			<div class="form-check" style="color: white">
				<input class="form-check-input" type="checkbox" id="check2"
					name="option1" value="cat"> <label class="form-check-label"
					for="check2">Cat</label>
			</div>
			<div class="form-check" style="color: white">
				<input class="form-check-input" type="checkbox" id="check3"
					name="option1" value="pig"> <label class="form-check-label"
					for="check3">Pig</label>
			</div>
			<div class="my-3">
				<button type="submit" class="btn btn-primary">전송</button>
			</div>
			<!-- 내장객체 안내 -->
		</form>
		<script>
			function checkbox(){
				let username = document.getElementById("username");
				let checkboxs = document.querySelectorAll(".form-check-input:checked");
				
				// 각 체크박스 상태 출력
				checkboxs.forEach(function(checkbox) {
					console.log(checkbox);  // 체크박스 객체를 출력
					console.log(checkbox.length);  // 체크 여부를 출력
				});
				
				if(username.value == ""){
					alert("빈칸입니다."); username.focus(); return false;
				}
				if(checkboxs.length == 0){
					alert("체크박스를 한개 이상은 체크하셔야합니다.");
					return false;
				}
				
			}
		</script>
	</div>
	<!-- end checkbox -->

	<div class="container card my-5">
		<h3 class="container card my-5">request(요청) -radio</h3>
		
		<form action="jsp015_radio.jsp" method="get"
			onsubmit="return check2()">
			<div class="mb-3 mt-3" style="color: white">
				<label for="username1" class="form-label">name</label> <input
					type="text" class="form-control" id="username1"
					placeholder="사용자 이름 입력하세요" name="username">
			</div>
			<!-- user name -->
			<!-- radio -->
			<!-- radio -->
			<div class="form-check">
				<input type="radio" class="form-check-input1" id="radio1" style="margin-right:10px"
						name="optradio" value="yes" >yes
					<label class="form-check-label" for="radio1"></label>
			</div>
			<div class="form-check">
				<input type="radio" class="form-check-input1" id="radio2" style="margin-right:10px"
						name="optradio" value="no">no
					<label class="form-check-label" for="radio2"></label>
			</div>
			<div class="form-check">
				<input type="radio" class="form-check-input1" style="margin-right:10px" disabled>사용못함-disabled 
				<label class="form-check-label"></label>
			</div>

			<!-- radio -->
			<!-- radio -->

			<div class="my-3">
				<button type="submit" class="btn btn-primary">전송</button>
			</div>
		</form>
		<script>
				function check2() {
			    	let username1 = document.getElementById("username1");
		   		 	let radio1 = document.querySelectorAll(".form-check-input1:checked");

		   			 for (let r of radio1) {
		       		 console.log(r);  
		   		 	}
		
				    if (username1.value == "") {
				        alert("빈칸입니다.");
				        username1.focus();
				        return false;
				    }
				    if (radio1.length == 0) {
				        alert("라디오 버튼을 한 개 이상 체크하셔야 합니다.");
				        return false;
				    }
		}
		</script>
	</div>
	<!-- end radio -->
	<div class="container card my-5">
		<h3 class="container card my-5">request(요청) - select</h3>
	
		<form action="jsp015_select.jsp" method="get"
			onsubmit="return check3()">
			<div class="mb-3 mt-3" style="color: white">
				<label for="username3" class="form-label">name</label> <input
					type="text" class="form-control" id="username3"
					placeholder="사용자 이름 입력하세요" name="username">
			</div>
			<!-- user name -->
			<!-- select -->
			<!-- select -->
			<label for="color">color 선택</label>
			<select class="form-select" id="color" name="color">
				<option value=""></option>
				<option value="bg-danger">RED</option>
				<option value="bg-success">GREEN</option>
				<option value="bg-primary">BLUE</option>
				<option value="bg-dark">BLACK</option>
			</select>
			<!-- select -->
			<!-- select -->

			<div class="my-3">
				<button type="submit" class="btn btn-primary">전송</button>
			</div>
		</form>
		<script>
		function check3() {
		    let username3 = document.getElementById("username3");
		    let color = document.getElementById("color");
		    if (username3.value == "") {
		        alert("빈칸입니다.");
		        username3.focus();
		        return false;
		    }
		  
		    if (color.value === "") {
		        alert("선택하세요.");
		        color.focus();
		        return false;
		    }
		    

		  
		}
		</script>
	</div>


</body>
</html>
