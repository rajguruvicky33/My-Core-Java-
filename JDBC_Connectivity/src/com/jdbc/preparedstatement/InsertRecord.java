package com.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
/*we are using prepared statement
 * 
 */
public class InsertRecord {
	public static void main(String[] args) {
		Connection connection=null;
		try {
			Scanner sc=new Scanner (System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Batch1", "root", "root@123");
			
			System.out.println("enter how many student you want to add: ");
			int choice=sc.nextInt();
			for (int i=1;i<=choice;i++) {
			String sql="insert into student values(?,?,?)";
			
			
			System.out.println("Please enter student id to set:");
			int id=sc.nextInt();
			System.out.println("Please enter student name to set:");
			String name=sc.next();
			System.out.println("Please enter student address to set:");
			String address=sc.next();
			
			PreparedStatement pmt=connection.prepareStatement(sql);
			pmt.setInt(1, id);
			pmt.setString(2, name);
			pmt.setString(3 , address);
			
			pmt.execute();
			
			System.out.println("Details inserted successfully...");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
