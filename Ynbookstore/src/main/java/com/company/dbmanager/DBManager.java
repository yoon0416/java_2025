package com.company.dbmanager;

import java.sql.Connection;
import javax.naming.*;
import javax.sql.DataSource;

public class DBManager {
public static Connection conn;
	
	public DBManager() {super();}
	
	public Connection getConnection() {
		
		try {
			Context initContext = new InitialContext();
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource)envContext.lookup("jdbc/mbasic");
			conn = ds.getConnection();
			System.out.println("................."+conn);
		} catch (Exception e) {e.printStackTrace();}
		return conn;
	}
}
