package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertIntoemployee {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conect=DriverManager.getConnection("jdbc:mysql://localhost:3306/exponent","root","root@123");
			String insert="insert into employee values(12,'Rohit')";
			Statement st=conect.createStatement();
			st.execute(insert);
			conect.close();
			System.out.println("record insert successfully...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
