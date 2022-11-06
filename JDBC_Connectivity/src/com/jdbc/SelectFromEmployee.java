package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectFromEmployee {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//class.forname used to create object

			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/exponent", "root",
					"root@123");
			String sql = "select * from student";

			Statement smt = connect.createStatement();

			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {
				System.out.println("Id:"+rs.getInt("id"));
				System.out.println(rs.getString("name"));
				System.out.println("--------------------");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
