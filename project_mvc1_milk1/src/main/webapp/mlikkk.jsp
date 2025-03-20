
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>우유</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body>
	<div class="p-5 bg-dark text-white rounded">
		<h1>Milk ORDER Project- PreparedStatemnt Ex</h1>
		<p>PreparedStatemnt Ex</p>
	</div>
	<!-- bg-primary 파랑, danger(빨강), waring(노랑), dark(블랙),info(하늘색),secondary(회색) -->

	<div class="container card my-5">
		<h3 class="card-header text-center">Milk Order</h3>
		<table class="table table-dark table-striped table-hover my-5">

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

	<div class="container card my-5">
		<h3 class="card-header text-center">Milk Order</h3>
		<table class="table table-dark table-striped table-hover my-5">
			<caption>milk 주문현황</caption>
			<thead>
				<tr>
					<th scope="col">NO</th>
					<th scope="col">NAME</th>
					<th scope="col">NUM</th>
					<th scope="col">주문날짜</th>
				</tr>
			</thead>
		</table>
	</div>

	<div class="contatiner card my-5">
		<h3>MILK 주문하러 가기</h3>
		<div id="accordion">
		<!-- 주문하기 -->
		<!-- 주문하기 -->
		
			<div class="card my-3 ">
				<div class="card-header bg-warning">
					<a class="btn btn text-white" data-bs-toggle="collapse" href="#collapseOne" style="font-weight:bold;">
						주문하기 </a>
				</div>
				<div id="collapseOne" class="collapse show"
					data-bs-parent="#accordion">
					<div class="card-body">Lorem ipsum..</div>
				</div>
			</div>

			<!-- 주문수정 -->
			<!-- 주문수정 -->
			<div class="card my-3">
				<div class="card-header bg-warning">
					<a class="collapsed btn text-white" data-bs-toggle="collapse"
						href="#collapseTwo" style="font-weight:bold;"> 주문수정</a>
				</div>
				<div id="collapseTwo" class="collapse" data-bs-parent="#accordion">
					<div class="card-body">Lorem ipsum..</div>
				</div>
			</div>

			<!-- 주문수정 -->
			<!-- 주문수정 -->
			<div class="card my-3">
				<div class="card-header bg-warning">
					<a class="collapsed btn btn text-white" data-bs-toggle="collapse"
						href="#collapseThree" style="font-weight:bold;"> 주문삭제 </a>
				</div>
				<div id="collapseThree" class="collapse" data-bs-parent="#accordion">
					<div class="card-body">Lorem ipsum..</div>
				</div>
			</div>

		</div>
	</div>


</body>
</html>