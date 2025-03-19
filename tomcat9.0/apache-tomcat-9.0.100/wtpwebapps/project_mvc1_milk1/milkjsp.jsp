<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Milk Table</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container card my-5">
        <h3 class="card-header text-center">WEBSTANDARD+TABLE</h3>

        <table class="table table-bordered text-center">
            <thead class="table-warning">
                <tr>
                    <th>MNO</th>
                    <th>MNAME</th>
                    <th>MPRICE</th>
                </tr>
            </thead>
            <tbody>
            <%
            // DB 연결을 위한 변수 선언
            Connection conn = null; 
            PreparedStatement pstmt2 = null;
            ResultSet rset2 = null;

            // 전체 데이터를 조회하는 SQL
            String sql2 = "SELECT * FROM milk";

            // DB 접속 정보
            String url = "jdbc:mysql://localhost:3306/milk";
            String id = "root", pass = "1234";

            try {
                // 1. 드라이버 로딩
                Class.forName("com.mysql.cj.jdbc.Driver");

                // 2. DB 연동
                conn = DriverManager.getConnection(url, id, pass);

                // 3. 전체 데이터 조회 실행
                pstmt2 = conn.prepareStatement(sql2);
                rset2 = pstmt2.executeQuery();

                // 4. 전체 데이터 출력 (테이블 형식)
                while (rset2.next()) {
                    out.println("<tr>");
                    out.println("<td>" + rset2.getInt("mno") + "</td>");
                    out.println("<td>" + rset2.getString("mname") + "</td>");
                    out.println("<td>" + rset2.getInt("mprice") + "</td>");
                    out.println("</tr>");
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // 자원 정리
                if (rset2 != null) rset2.close();
                if (pstmt2 != null) pstmt2.close();
                if (conn != null) conn.close();
            }
            %>
            </tbody>
        </table>
    </div>
</body>
</html>
