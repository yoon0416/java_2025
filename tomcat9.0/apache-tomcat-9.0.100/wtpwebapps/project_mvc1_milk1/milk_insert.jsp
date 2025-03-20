<%@page import="java.net.InetAddress"%>
<%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
    // 1. UTF-8 설정
    request.setCharacterEncoding("UTF-8");

    // 2. request.getParameter()를 이용해 데이터 받기
    String oname = request.getParameter("oname");
    int onum = Integer.parseInt(request.getParameter("onum"));
    String oip = InetAddress.getLocalHost().getHostAddress(); // 주문자의 IP 주소
    
    // DB 접속 정보
    String url = "jdbc:mysql://localhost:3306/milk_order"; // DB URL
    String id = "root";  // DB ID
    String pass = "1234"; // DB Password

    Connection conn = null;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    try {
        // 3. JDBC 드라이버 로딩
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 4. DB 연동
        conn = DriverManager.getConnection(url, id, pass);

        // 5. 데이터 삽입을 위한 SQL (INSERT)
        String sql = "insert into milk_order (oname, onum, oip) values (?, ?, ?)";

        // 6. PreparedStatement 준비
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, oname); // 우유 이름
        pstmt.setInt(2, onum); // 우유 갯수
        pstmt.setString(3, oip); // 주문자의 IP
        
        // 7. SQL 실행
        int result = pstmt.executeUpdate(); // 데이터 삽입

        if (result > 0) {
            // 8. 마지막으로 삽입된 주문번호(ono)를 조회
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select last_insert_id()");  
            if (rs.next()) {
                int ono = rs.getInt(1);  
                
                // 9. 결과 처리:
                out.println("<script>alert('주문성공! 주문번호는 " + ono + "번입니다!'); location.href='milk.jsp';</script>");
            }
        } else {
            out.println("<script>alert('관리자에게 문의 바람'); location.href='milk.jsp';</script>");
        }

    } catch (Exception e) {
        e.printStackTrace();
        out.println("에러 발생: " + e.getMessage());
    } finally {
        // 10. 자원 정리
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
%>
