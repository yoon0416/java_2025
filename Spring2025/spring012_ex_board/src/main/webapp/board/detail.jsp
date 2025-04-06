<%@page import="com.company.dto.BoardDto"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>%>
<%@ include file="../inc/header.jsp" %>
<%@page import="java.sql.*"%>

<div class="container"  style="margin-top:5%; min-height:500px">
	<h3>MULTIBOARD 상세보기</h3> 					
	<div class="panel" >
	  <div  class="panel-body"> 
  		<span class="glyphicon glyphicon-plus">  ${dto.bhit}</span>    <p></p>
	</div>	
	</div>	
	<div class="panel"  >
	  <div  class="panel-body">
	  		<span class="glyphicon glyphicon-plus">  ${dto.bname}</span> <p></p>
		</div>
	</div>				
	<div class="panel"  >
	  <div  class="panel-body">
	  	<span class="glyphicon glyphicon-plus">  ${dto.btitle}</span> <p></p>
	  </div>	
	</div>
	<div class="panel"  >
	  <div  class="panel-body">
	  	<span class="glyphicon glyphicon-plus">  ${dto.bcontent}</span> <textarea  class="form-control"></textarea>
	  </div> 
	</div>	
	<div class="text-right"    >
		 <a href="${pageContext.request.contextPath}/board/edit?bno=${dto.bno}"  class="btn btn-danger" >수정</a> 
		 <a href="${pageContext.request.contextPath}/board/delete?bno=${dto.bno}"   class="btn btn-danger" >삭제</a>    
		 <a href="${pageContext.request.contextPath}/board/list"    class="btn btn-info" >목록보기</a> 
	</div>						 
</div>	
<%@ include file="../inc/footer.jsp" %>
