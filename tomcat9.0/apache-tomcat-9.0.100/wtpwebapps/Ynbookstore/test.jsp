
<%@page import="com.company.domain.BoardVO"%>
<%@ page import="com.company.dao.BoardDao" %>

<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.*"%>
<%@page import="javax.naming.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- header -->
<%@ include file="inc/header.jsp"%>
<!-- header -->


<div class="container card my-5">
	<h3 class="card-header">프로젝트 (1) 설정</h3>
	<ol>
		<li>dynamic web project  - JOAbooks</li>
		<li>inc - header/footer </li>
		<li>error page 설정 -  404 , 500</li>
		<li>DBCP</li>
	</ol>
	<h4>error</h4>
    

<%-- 
	<h4>DECP</h4>
	<%
    Context initContext = new InitialContext();		// Context 찾겠다 - 리소스
    Context envContext  = (Context)initContext.lookup("java:/comp/env"); // 환경Context
    DataSource ds       = (DataSource)envContext.lookup("jdbc/mbasic"); // pool 이름
    Connection conn     = ds.getConnection(); //db연동
    out.println("db연동");
	%> --%>
</div> <!-- end div -->

<div class="container card my-5">
	<h3 class="card-header">프로젝트(2) model</h3>
	<pre>
	1. DTO          : [com.company.domain]     - BoardVO private
	2. DBManager    :  [com.company.dbmanager] - DBManager
	3. DAO          : [com.company.dao]        - BoardDao
	</pre>
	<%
		BoardDao dao = new BoardDao();
	
		//6 delete
		/*
		System.out.println(dao.delete(5));
		System.out.println(dao.select(5)); 
*/

	
		//5. update
		/*
		BoardVO vo = new BoardVO();
		vo.setBtitle("제목-new");
		vo.setBcontent("내용-new");
		vo.setBno(3);
		System.out.println(dao.update(vo));
		System.out.println(dao.select(3));
		*/
	
		//4. updateHit
	//	System.out.println(dao.updateHit(2)); //1성공 -1 실패
		
		
		//3. select
		//System.out.println(dao.select(4));
	
		//2. insert(BoardVO vo) - btitle, bcontent, bname
		/*
		BoardVO vo = new BoardVO();
		vo.setBtitle("제목");
		vo.setBcontent("내용");
		vo.setBname("first");
		System.out.println(dao.insert(vo));
		*/
		
		//1. selectAll
	//	System.out.println( dao.selectAll() );
	%>



</div> <!-- end div -->

<!-- footer -->
<%@ include file="inc/footer.jsp"%>
<!-- footer -->








