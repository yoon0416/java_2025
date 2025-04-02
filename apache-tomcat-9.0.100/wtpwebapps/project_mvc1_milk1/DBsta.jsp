<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DB 연동 테스트</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container card my-5">
        <h3 class="card-header">Statement</h3>
        <pre class="alert alert-warning my-5">
        1. 드라이버 연동 Class.forName
        2. DB 연동 DriverManager.getConnection(url,id,pw);
        3. Statement 사용
        4. 결과 : ResultSet(select) / int (insert, update, delete)
        </pre>
        <% 
            Connection conn = null;
            Statement stmt = null;
            ResultSet rset = null;

            try {
                // 1. 드라이버 로딩
                Class.forName("com.mysql.cj.jdbc.Driver");

                // 2. DB 연동
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/milk", "root", "1234");

                // 3. Statement 사용
                stmt = conn.createStatement();

                // 4. SQL 실행 (SQL Injection 위험이 있음)
                String sql = "SELECT * FROM milk WHERE mname = 'white'";
                rset = stmt.executeQuery(sql);

                // 결과 출력
                while (rset.next()) {
                    out.println(rset.getInt("mno") + " / " + rset.getString("mname") + " / " + rset.getInt("mprice") + "<br/>");
                }

            } catch (Exception e) {
                e.printStackTrace();
                out.println("<p class='text-danger'>에러 발생: " + e.getMessage() + "</p>");
            } finally {
                try {
                    if (rset != null) rset.close();
                    if (stmt != null) stmt.close();
                    if (conn != null) conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        %>
    </div>
    
    
    
</body>
</html>
