package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC1 {
	public static void main(String[] args) {
		//6 steps
		try {
			//load driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//Establish connection
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/exponent", "root", "root@123");
		
			//create sql query
			String sql="insert into student values(102,'Akshay')";
			
			//create statement
			Statement stm=connection.createStatement();
			
			//execute query
			stm.execute(sql);
			
			//close all connection
			connection.close();
			System.out.println("Record Inserted...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}