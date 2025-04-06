<%@page import="com.company.dto.BoardDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@ include  file="../inc/header.jsp" %>
<!--  END HEADER -->
<!--  END HEADER -->
<!--  END HEADER -->
<script>
//window.onload = function(){};  브라우저로딩 작업   맨마지막 1번만
//window.addEventListener("load" , function(){});
//jQuery(document).ready(function(){});
//$(document).ready(function(){});
$(function(){      
	let result = '${result}'; console.log(result);
	if(result == 'fail'){alert('비밀번호를 확인해주세요'); history.go(-1);}
	else if(result.length !=0){ alert('글쓰기성공'); }
});


</script>


<div class="container"   style="margin-top:5%; min-height:500px">
	<h3>MULTIBOARD</h3>
	<table  class="table table-striped">
		<caption>MULTIBOARD - MVC1</caption>
		<thead>
			<tr><th scope="col">NO</th><th scope="col">TITLE</th>
			     <th scope="col">WRITER</th><th scope="col">DATE</th><th scope="col">HIT</th><th scope="col">IP</th></tr>
		</thead>
		<tbody> 
		 <c:forEach var="dto" items="${list}" varStatus="status">
			<tr>
				<td>${list.size()-status.index}</td> <!-- 0,1,2 -->
				<td>  <a href="${pageContext.request.contextPath}/board/detail?bno=${dto.bno}">${dto.btitle} </a></td>
				<td>${dto.bname }</td>
				<td>${dto.bdate }</td>
				<td>${dto.bhit }</td>
				<td>${dto.bip }</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<p  class="text-right"><a href="${pageContext.request.contextPath}/board/create"   class="btn btn-danger">글쓰기</a></p>
</div>

<!-- END FOOTER -->
<!-- END FOOTER -->
<!-- END FOOTER -->
<!-- END FOOTER -->
<%@ include  file="../inc/footer.jsp" %>