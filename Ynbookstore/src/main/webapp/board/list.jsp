<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp" %>


<div class="container my-5">
	<h3>NAVER BOOK</h3>
	<div class="result">
	</div>
	
	
	<script>
	// 1. window.onload = function(){}; 브라우저 로딩되면 동작
	//el $() jQuery
	$(function(){
		
		$.ajax({
	         url:"${pageContext.request.contextPath}/books",
	         dataType:"json", 
	         type:"GET",
	         success:function(json){ 
	        	 //1. 데이터 분해
	        	 //console.log(json); 
	        	 let items = json.items;
	        	// console.log(items[0]); //객체한개 = {title:"",image:""}
	        	 
	        	 for(let i=0; i<items.length; i++){
	        		 let div = $('<div class="card my-3">'); //<div></div> 태그만들기
	        		 let p1 = $('<div class="card-body">').html('<img src="'+items[i].image+'"style="width: 200px; height: auto;"/>');
	        		 let p2 = $('<div class="card-body" >').html(items[i].title); //html reset해서 넣기
	        		 let p25 = $('<div class="card-body" >').html('저자 : '+items[i].author);
	        		 let p3 = $('<div class="card-body">').html('<a href="'+items[i].link+'"/>'+items[i].title+'</a>'); 
	        		 let p35 = $('<div class="card-body">').html('출판사 : '+items[i].publisher);
	        		 let p4 = $('<div class="card-body">').html(items[i].discount+'원');
	        		 
	        		 div.append(p1).append(p2).append(p25).append(p3).append(p35).append(p4); //div태그안에 p1추가하고 p2추가
	        		 $(".result").append(div);
	        	 }
	        	 //2. 보여줄 화면에 껴넣기
	        	 
	        	 
	          },error:function(xhr, textStatus, errorThrown){
	            $(".result").html(textStatus + "(HTTP-" + xhr.status + "/" + errorThrown);
	         } // $(".result")  document.querySelector(".result")
	      });
		
	}); //2. jQuery 브라우저 로딩되면 동작
	
	</script>
</div>

<div class="container   my-5">
	<h3>MULTIBOARD</h3>
	<%-- <%=request.getAttribute("list")%> --%>
	<table  class="table table-striped  table-bordered table-hover text-center">
		<caption>MULTIBOARD-LIST</caption>
		<thead>
			<tr><th scope="col">NO</th><th scope="col">TITLE</th>
			      <th scope="col">WRITER</th><th scope="col">DATE</th><th scope="col">HIT</th></tr>
		</thead>
		<tbody>
 			<c:forEach items="${list}" var="dto" varStatus="status">
 				<tr>
 					<td>${list.size() - status.index}</td>
 					<td>${dto.btitle}</td>
 					<td><a href="detail.do?bno=${dto.bno}">${dto.bname}</a></td>
 					<td>${dto.bdate}</td>
 					<td>${dto.bhit}</td>
 				</tr>
 			</c:forEach>
	
		</tbody>
	</table>
	<p  class="text-end"><a href="write_view.do"   class="btn btn-primary">글쓰기</a></p>
</div>

<%@ include file="../inc/footer.jsp" %>