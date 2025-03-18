
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
		<h3 class="card-header">JDBC</h3>
		<pre>
		1.
		</pre>
	
	<%
	try {
		//1) 드라이버호출 com.회사명.프로젝트명.jdbc.Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
	
		//2) jdbc 연동
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic","root","1234");
		if(conn != null) {out.println("db연동 성공!");}
			conn.close();
		}catch(Exception e){e.printStackTrace();}
		//mysql -uroot -p 비번
	
	%>
	</div>
</body>
</html>