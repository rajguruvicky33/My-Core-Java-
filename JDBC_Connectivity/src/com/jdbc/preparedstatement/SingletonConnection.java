package com.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {
	private static Connection connection =null;
	
	private SingletonConnection() {
		
	}
	public static Connection getConnection() {
		if(connection==null) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Batch1", "root", "root@123");
			
			return connection;
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
		
		return connection;
	}
}
