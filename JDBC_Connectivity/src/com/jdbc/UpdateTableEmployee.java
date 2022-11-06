package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateTableEmployee {
	public static void main(String[] args) {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 
			 Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/exponent", "root", "root@123");
			 
			 String sql4="update employee set name='Vicky' where id=11";
			 
			 Statement s1=connect.createStatement();
			 s1.execute(sql4);
			 connect.close();
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
