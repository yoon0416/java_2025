<%@page import="java.net.InetAddress"%> <!-- 사용자의 IP 주소를 가져오기 위해 InetAddress 클래스 import -->
<%@ page import="java.sql.*" %> <!-- JDBC 관련 클래스들 (Connection, Statement, ResultSet 등) import -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- 페이지 인코딩 설정 -->

<%
    // 1. UTF-8 설정
    request.setCharacterEncoding("UTF-8"); // 한글 깨짐 방지를 위해 요청 데이터 인코딩을 UTF-8로 설정

    // 2. request.getParameter()를 이용해 데이터 받기
    String oname = request.getParameter("oname"); // 폼에서 입력받은 우유 이름 가져오기
    int onum = Integer.parseInt(request.getParameter("onum")); // 폼에서 입력받은 우유 갯수를 문자열에서 정수로 변환
    String oip = InetAddress.getLocalHost().getHostAddress(); // 주문자의 IP 주소를 가져옴 (자신의 컴퓨터 주소)

    // DB 접속 정보
    String url = "jdbc:mysql://localhost:3306/milk_order"; // DB 주소(localhost의 milk_order 데이터베이스)
    String id = "root";  // DB 접속용 사용자 ID
    String pass = "1234"; // DB 접속용 비밀번호

    Connection conn = null; // DB와 연결하기 위한 통로 (Connection 타입)
    PreparedStatement pstmt = null; // ?를 사용할 수 있는 SQL 실행 도구 (보안과 성능 좋음)
    Statement stmt = null; // 일반 SQL을 실행할 수 있는 기본 SQL 실행 도구
    ResultSet rs = null; // SELECT 결과를 담을 그릇 (표 형태의 데이터 저장)

    try {
        // 3. JDBC 드라이버 로딩
        Class.forName("com.mysql.cj.jdbc.Driver"); // MySQL 드라이버 로딩 (DB랑 자바가 소통할 수 있게 함)

        // 4. DB 연동
        conn = DriverManager.getConnection(url, id, pass); // 입력된 정보로 DB와 연결된 통로 생성 (전화선 연결 느낌)

        // 5. 데이터 삽입을 위한 SQL (INSERT)
        String sql = "insert into milk_order (oname, onum, oip) values (?, ?, ?)"; // 데이터 삽입용 SQL 문 (?는 나중에 값으로 대체됨)

        // 6. PreparedStatement 준비
        pstmt = conn.prepareStatement(sql); 	// 위의 sql문을 실행할 준비 (주문서 양식 만들어 놓기)
        pstmt.setString(1, oname); 				// 첫 번째 ?에 oname 변수값 설정 (주문할 우유 이름)
        pstmt.setInt(2, onum); 					// 두 번째 ?에 onum 변수값 설정 (주문할 갯수)
        pstmt.setString(3, oip); 				// 세 번째 ?에 oip 변수값 설정 (주문자의 IP)

        // 7. SQL 실행
        int result = pstmt.executeUpdate(); 	// INSERT문 실행 → 영향을 받은 행 수를 result에 저장 (삽입 성공 여부 확인용)

        if (result > 0) { // 삽입 성공 시
            // 8. 마지막으로 삽입된 주문번호(ono)를 조회
            stmt = conn.createStatement(); // db에 연결한 통로 conn에 sql을 실행할 도구를 생성할꺼다 그걸 stmt에 담을거고
            rs = stmt.executeQuery("select last_insert_id()");  // rs에 셀렉트 라스트 인설트 아이디라는 함수 실행을 넣을꺼다 (방금 삽입된 행의 id값을 가져옴)
            if (rs.next()) { // rs행에 값이 있다면 (결과 행이 존재하면)
                int ono = rs.getInt(1); // ono에 정수로 첫 번째 컬럼을 넣겠다 (주문번호를 정수로 꺼냄)

                // 9. 결과 처리:
                out.println("<script>alert('주문성공! 주문번호는 " + ono + "번입니다!'); location.href='milk.jsp';</script>"); // 주문 성공 메시지와 함께 주문번호를 알림창으로 띄움
            }
        } else {
            out.println("<script>alert('관리자에게 문의 바람'); location.href='milk.jsp';</script>"); // 삽입 실패 시 알림창 표시
        }

    } catch (Exception e) {
        e.printStackTrace(); // 예외(에러) 내용을 콘솔에 출력
        out.println("에러 발생: " + e.getMessage()); // 브라우저에 에러 메시지 출력
    } finally {
        // 10. 자원 정리
        try {
            if (rs != null) rs.close(); // 결과셋 닫기 (사용하던 표 그릇 정리)
            if (stmt != null) stmt.close(); // 일반 SQL 도구 정리
            if (pstmt != null) pstmt.close(); // PreparedStatement 도구 정리
            if (conn != null) conn.close(); // DB 연결 끊기 (전화선 정리)
        } catch (SQLException e) {
            e.printStackTrace(); // 자원 정리 도중 에러 발생 시 출력
        }
    }
%>
