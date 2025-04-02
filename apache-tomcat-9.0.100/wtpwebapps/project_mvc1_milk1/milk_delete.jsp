<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    // 1. UTF-8 설정
    request.setCharacterEncoding("UTF-8");

    // 2. request.getParameter()를 이용해 데이터 받기
    int ono = Integer.parseInt(request.getParameter("ono"));
    
    // 3. DB 연결을 위한 변수 선언
    Connection conn = null;
    PreparedStatement pstmt = null;
    
    // DB 접속 정보
    String url = "jdbc:mysql://localhost:3306/milk_order"; // DB URL
    String id = "root";  // DB ID
    String pass = "1234"; // DB Password

    try {
        // 4. JDBC 드라이버 로딩
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 5. DB 연동
        conn = DriverManager.getConnection(url, id, pass);
        
        // 6. 주문삭제할 delete 쿼리
        String sql = "DELETE FROM milk_order WHERE ono=?";

        // 7. PreparedStatement 준비
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, ono); // 주문 번호 설정

        // 8. 실행 전 쿼리 확인 (디버깅)
        out.println("SQL: " + sql + ", ono=" + ono + "<br>");

        // 9. SQL 실행
        int result = pstmt.executeUpdate(); // 데이터 삭제

        // 10. 결과 처리
        if (result > 0) {
            out.println("<script>alert('주문번호"+ono+"번 주문 취소 완료!'); location.href='milk.jsp';</script>");
        } else {
            out.println("<script>alert('해당 주문 번호가 존재하지 않거나 이미 취소된 주문입니다. 관리자에게 문의 바랍니다.'); location.href='milk.jsp';</script>");
        }

    } catch (Exception e) {
        e.printStackTrace();
        out.println("에러 발생: " + e.getMessage());
    } finally {
        // 11. 자원 정리
        try {
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
%>
