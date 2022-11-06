package com.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateRecord {
	public static void main(String[] args) {
		try {
			Connection connection=SingletonConnection.getConnection();
			String sql="update student set name=? where id=? ";
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Please enter name to update: ");
			String name=sc.next();
			System.out.println("Please enter id whose name you want to update:");
			int id=sc.nextInt();

			
			PreparedStatement pmt=connection.prepareStatement(sql);
			pmt.setString(1, name);
			pmt.setInt(2, id);
			
			pmt.execute();
			System.out.println("Record updated Successfully...");
			
			connection.close(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
