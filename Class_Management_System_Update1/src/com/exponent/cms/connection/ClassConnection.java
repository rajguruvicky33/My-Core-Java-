package com.exponent.cms.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ClassConnection {
	private static Connection connection=null;
	
	private ClassConnection() {
		
	}
	public static Connection getConnection() {
		try {
			if(connection==null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/ClassManagement", "root", "root@123");
			return connection;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	

}
