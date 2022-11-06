package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteRecord {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c2=DriverManager.getConnection("jdbc:mysql://localhost:3306/exponent", "root", "root@123");
			String s2="delete from employee where id=11";
			Statement st3=c2.createStatement();
			st3.execute(s2);
			c2.close();
			
			System.out.println("record deleted successfully...");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
