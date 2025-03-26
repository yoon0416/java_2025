package jsp023_servlet;
// 로그인!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Jsp025_login
 */
@WebServlet("/Jsp025_login")
public class Jsp025_login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Jsp025_login() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        // 1. 데이터 넘겨받기
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");

        // 2. DBManager 연동
        DBManager db = new DBManager();
        Connection conn = db.getConnection();

        // 3. SQL 구문처리
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "select * from member where name=? and pass=?";
        
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, pass);

            rs = pstmt.executeQuery();  // select 쿼리 실행

            if (rs.next()) {  // 로그인 성공
                // 세션 생성
                HttpSession session = request.getSession();
                session.setAttribute("user", name);  // 세션에 사용자 아이디 저장

                
                out.println("<script>alert('로그인 성공!'); location.href='jsp022_my.jsp';</script>");
            } else {
                // 로그인 실패
                out.println("<script>alert('아이디 또는 비밀번호가 잘못되었습니다.'); location.href='jsp025_login.jsp';</script>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) { try { rs.close(); } catch (SQLException e) { e.printStackTrace(); } }
            if (pstmt != null) { try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); } }
            if (conn != null) { try { conn.close(); } catch (SQLException e) { e.printStackTrace(); } }
        }
    }
}
