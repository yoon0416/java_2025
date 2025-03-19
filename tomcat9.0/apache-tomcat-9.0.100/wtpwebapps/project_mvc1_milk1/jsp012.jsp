<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Milk Data</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="p-5 bg-dark text-white rounded">
  <h1>Milk ORDER Project- PreparedStatemnt Ex</h1>
  <p>PreparedStatemnt Ex</p>
</div> <!-- bg-primary 파랑, danger(빨강), waring(노랑), dark(블랙),info(하늘색),secondary(회색) -->
    <div class="container card my-5">
        <h3 class="card-header text-center">Milk Order</h3>
        
        <table class="table table-dark table-striped table-hover my-5" >
        <caption>우유주문현황</caption>
	    <thead>
	      <tr>
	        <th scope="col">NO</th>
	        <th scope="col">NAME</th>
	        <th scope="col">PRICE</th>
	      </tr>
	    </thead>
	    <tbody>
	     
        
        <%
        // DB 연결을 위한 변수 선언
        Connection conn = null; 
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        // 전체 데이터를 조회하는 SQL
        String sql = "SELECT * FROM milk";
        
        // DB 접속 정보
        String url = "jdbc:mysql://localhost:3306/milk";
        String id = "root", pass = "1234";

        try {
            // 1. 드라이버 로딩
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. DB 연동
            conn = DriverManager.getConnection(url, id, pass);

            // 3. 전체 데이터 조회 실행
            pstmt = conn.prepareStatement(sql);
            rset = pstmt.executeQuery();

            // 4. 전체 데이터 출력
            while (rset.next()) {
          //      out.println(rset.getInt("mno") + " / " + rset.getString("mname") + " / " + rset.getInt("mprice") + "<br/>");
          		  int mno = rset.getInt("mno");
          		  String mname = rset.getString("mname");
          		  int mprice = rset.getInt("mprice");
           
            %>
            <tr>
	       		<td><%=mno%></td>
	      	 	<td><%=mname%></td>
	      	 	<td><%=mprice%></td>
	      	</tr>
            <% }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 자원 정리
            if (rset != null) rset.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        }
        %>
        </tbody>
        </table>
    </div>
</body>
</html>
