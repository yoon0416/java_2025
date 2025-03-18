package com.company.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC001 {

	public static void main(String[] args) {
		try {
			//1) 드라이버호출 com.회사명.프로젝트명.jdbc.Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			//2) jdbc 연동
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic","root","1234");
			if(conn != null) {System.out.println("db연동 성공!");}
			conn.close();
		}catch(Exception e){e.printStackTrace();}
		//mysql -uroot -p 비번
		
		
	}//end psvm

}//end class
