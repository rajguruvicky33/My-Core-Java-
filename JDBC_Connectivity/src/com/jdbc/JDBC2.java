package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//Add details in employee in previously created table employee
public class JDBC2 {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connect=DriverManager.getConnection("jdbc:mysql://localhost/exponent", "root", "root@123");
			
			String sql2="insert into employee values (11,'Sachin')";
			String sql3="insert into employee values (12,'Hardik')";
			
			Statement st=connect.createStatement();
			
			st.execute(sql2);
			st.execute(sql3);
			
			connect.close();
			
			
			
			System.out.println("record inserted successfully...");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
