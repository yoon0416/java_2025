<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container card my-5 p-4">
        <h3 class="card-header text-center">회원가입</h3>
        <form action="register_process.jsp" method="post">
            <div class="mb-3">
                <label for="userId" class="form-label">아이디</label>
                <input type="text" class="form-control" id="userId" name="userId" required>
            </div>
            <div class="mb-3">
                <label for="password" class="form-label">비밀번호</label>
                <input type="password" class="form-control" id="password" name="password" required>
            </div>
            <div class="mb-3">
                <label for="balance" class="form-label">잔액</label>
                <input type="number" class="form-control" id="balance" name="balance" min="0" required>
            </div>
            <button type="submit" class="btn btn-danger w-100">가입하기</button>
        </form>
    </div>
</body>
</html>
