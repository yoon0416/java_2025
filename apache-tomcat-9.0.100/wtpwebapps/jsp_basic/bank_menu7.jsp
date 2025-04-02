
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
    <div class="container card my-5 p-4 text-center">
        <h3 class="card-header">Bank</h3>
        <div class="d-flex justify-content-center gap-2 mt-3">
        <form action="bank_userinfo.jsp" method="post">
            <button type="submit" class="btn btn-danger" title="pro">회원가입</button>
            </form>
             <form action="jsp_score_result.jsp" method="post">
            <button type="submit" class="btn btn-danger" title="pro">계좌조회</button>
            </form>
             <form action="jsp_score_result.jsp" method="post">
            <button type="submit" class="btn btn-danger" title="pro">입금</button>
            </form>
             <form action="jsp_score_result.jsp" method="post">
            <button type="submit" class="btn btn-danger" title="pro">출금</button>
            </form>
             <form action="jsp_score_result.jsp" method="post">
            <button type="submit" class="btn btn-danger" title="pro">회원탈퇴</button>
            </form>
        </div>
    </div>
</body>
</html>