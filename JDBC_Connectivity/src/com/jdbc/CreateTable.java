package com.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

import javax.sql.ConnectionEvent;

public class CreateTable {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");    //load driver...
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/exponent", "root", "root@123");
			
			String sql1="create table employee  (id int(10),name varchar (45))";
			
			Statement smt =connection.createStatement();
			
			smt.execute(sql1);
			
			connection.close();
			
			System.out.println("Table created successfully....");
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
