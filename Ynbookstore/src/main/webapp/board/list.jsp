<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.company.dao.BoardDao" %>
<%@ page import="com.company.domain.BoardVO" %>

<!-- header -->
<%@ include file="/inc/header.jsp" %>
<!-- header -->

<div class="container card my-5">
    <h3 class="card-header bg-dark text-white text-center">게시판</h3>
    <!-- 게시판 테이블 -->
    <table class="table table-bordered table-striped table-hover table-dark my-5 text-center">
        <caption>게시판</caption>
        <thead>
            <tr>
                <th scope="col">NO</th>
                <th scope="col">TITLE</th>
                <th scope="col">WRITER</th>
                <th scope="col">DATE</th>
                <th scope="col">HIT</th>
            </tr>
        </thead>
        <tbody>
            <% 
                // BoardDao 객체를 사용하여 데이터 불러오기
                BoardDao dao = new BoardDao();
            	ArrayList<BoardVO> boardList = dao.selectAll(); // selectAll() 메소드로 게시글 목록을 불러옴
                for(BoardVO board : boardList) {
            %>
                <tr>
                    <td><%= board.getBno() %></td>
                    <td><a href="detail.jsp" style= "text-decoration: none; color: inherit;"> <%= board.getBtitle() %></a></td>
                    <td><%= board.getBname() %></td>
                    <td><%= board.getBdate() %></td>
                    <td><%= board.getBhit() %></td>
                </tr>
            <% } %>
        </tbody>
    </table>

    <!-- 글쓰기 버튼 -->
    <form action="write.jsp" method="get" id="write" style="position: absolute; right: 20px; bottom: 20px;">
        <button type="submit" class="btn btn-primary" id="divide">글쓰기</button>
    </form>
</div>

<!-- footer -->
<%@ include file="/inc/footer.jsp" %>
<!-- footer -->
