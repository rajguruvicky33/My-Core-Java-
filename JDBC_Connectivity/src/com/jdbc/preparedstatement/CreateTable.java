package com.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Batch1", "root",
					"root@123");

			String sql = "create table student(id int (15), name varchar(50),address varchar(45))";
			Statement smt = connection.createStatement();
			smt.execute(sql);
			System.out.println("Table Created successfully....");
			
			connection.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
