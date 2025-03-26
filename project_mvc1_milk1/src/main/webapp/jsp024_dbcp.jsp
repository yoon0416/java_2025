
<%@page import="jsp023_servlet.DBManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.*"%>
<%@page import="javax.naming.*"%>
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
	<% 
		Connection conn = null;
		DBManager db = new DBManager();
		conn = db.getConnection();
		
		if(conn != null) out.println("DB연동");
	%>
	<hr/>
	
	<div>
	
	
	</div>
</body>
</html>