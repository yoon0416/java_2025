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
	<div class="alert alert-warning" style=font-size:1.5em>
		<h3 class="card-header">form - score</h3>
		<%
			String kor = request.getParameter("kor");
			int kori = 0;
			
			String eng = request.getParameter("eng");
			int engi = 0;
			
			String math = request.getParameter("math"); 
			int mathi = 0;
			

			
			if (kor != null && !kor.isEmpty()) {
				try {kori = Integer.parseInt(kor);} 
				catch (NumberFormatException e) {kori = 0;}
			}
			
			if (eng != null && !eng.isEmpty()) {
				try { engi = Integer.parseInt(eng);} 
				catch (NumberFormatException e) { engi = 0;}
			}
			if (math != null && !math.isEmpty()) {
				try {mathi = Integer.parseInt(math);} 
				catch (NumberFormatException e) {mathi = 0;}
			}
			
			int total = kori+engi+mathi;
			
			double avg = 0;
			if (kori > 0 || engi > 0 || mathi > 0) { //0나누면 그때 그 인피니티?
				avg = total / 3.0;
			}
		%>
			<p>국어 : <%= kori %></p>
			<p>영어 : <%= engi %></p>
			<p>수학 : <%= mathi %></p>
			<p>총점 : <%= total %></p>
			<p>평균 : <%= String.format("%.2f",avg) %></p>
			<table class="table table-bordered table-striped table-hover my-5">
			<caption>성적처리</caption>
			    <thead>
			      <tr>
			        <th scope="col">KOR</th>
			        <th scope="col">ENG</th>
			        <th scope="col">MATH</th>
			        <th scope="col">TOTAL</th>
			        <th scope="col">AVG</th>
			      </tr>
			    </thead>
			    <tbody>
					<tr>
						<td><%=kori %></td>
						<td><%=engi %></td>
						<td><%=mathi %></td>
						<td><%=total %></td>
						<td><%=String.format("%.2f",avg) %></td>
					</tr>
			    </tbody>
			  </table>
		<p><a href="jsp_score.jsp" class="btn btn-danger">BACK</a></p>
	</div>
</body>
</html>
