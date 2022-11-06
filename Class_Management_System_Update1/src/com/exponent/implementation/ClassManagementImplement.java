package com.exponent.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.exponent.classmodal.Student;
import com.exponent.cms.connection.ClassConnection;
import com.exponent.serviceinterface.ClassManagementSystem;
import com.mysql.cj.protocol.Resultset;

public class ClassManagementImplement implements ClassManagementSystem {
	Connection connection = null;

	@Override
	public void addCourse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Add Course...");
		try {
			connection = ClassConnection.getConnection();
			System.out.println("Please enter how many course you want to add:");
			int n = sc.nextInt();

			for (int i = 1; i <= n; i++) {
				String sql = "insert into Course values (?,?)";

				System.out.println("Please enter Course id you want to set:");
				int cId = sc.nextInt();
				System.out.println("Please enter Course Name you want to set:");
				String cName = sc.next();

				PreparedStatement ps = connection.prepareStatement(sql);
				ps.setInt(1, cId);
				ps.setString(2, cName);

				ps.execute();
				System.out.println("Course Details added Successfully...");

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// connection.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public void displayCourse() {
		System.out.println("Display Course...");
		try {
			connection = ClassConnection.getConnection();
			String sql = "select * from Course";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(sql);
			while (rs.next()) {
				System.out.println("Course Id:" + rs.getInt(1));
				System.out.println("Course Name:" + rs.getString(2));
				System.out.println("--------------------------");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	@Override
	public void addFaculty() {
		Scanner sc = new Scanner(System.in);
		Connection connection = null;
		connection = ClassConnection.getConnection();

		System.out.println("Add Faculty...");
		String sql = "insert into faculty values (?,?,?)";

		try {

			System.out.println("Enter how many Faculty you want to add");
			int n = sc.nextInt();
			for (int i = 1; i <= n; i++) {

				System.out.println("Enter Faculty id to set:");
				int fId = sc.nextInt();

				System.out.println("Enter Faculty name to set:");
				String fName = sc.next();

				System.out.println("Select Course id to assign faculty");
				displayCourse();
				int cId = sc.nextInt();

				PreparedStatement ps = connection.prepareStatement(sql);
				ps.setInt(1, fId);
				ps.setString(2, fName);
				ps.setInt(3, cId);
				ps.execute();
				System.out.println("Faculty Details added Successfully...");

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	@Override
	public void displayFaculty() {
		System.out.println("Display Faculty...");
		System.out.println("\tFaculty Id\tFaculty Name\tCourse id\tCourse name");
		try {
			connection = ClassConnection.getConnection();
			String sql = "Select f.fId,f.fName,c.cId,c.cName from faculty f inner join course c on f.cId=c.cId";
			Statement smt = connection.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			while (rs.next()) {
				System.out.println("\t" + rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getInt(3) + "\t\t"
						+ rs.getString(4));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
//				connection.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public void addBatch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Add Bactch...");
		System.out.println("Please enter how many batch you want to add:");
		int n = sc.nextInt();
		try {
			connection = ClassConnection.getConnection();
			String sql = "insert into batch values (?,?,?)";
			for (int i = 1; i <= n; i++) {
				PreparedStatement ps = connection.prepareStatement(sql);
				System.out.println("Please enter Batch id to set:");
				int bId = sc.nextInt();
				ps.setInt(1, bId);
				System.out.println("Please enter Batch Name to set:");
				String bName = sc.next();
				ps.setString(2, bName);

				System.out.println("Please enter faculty id to set:");
				displayFaculty();
				int fId = sc.nextInt();
				ps.setInt(3, fId);

				ps.execute();

				System.out.println("batch added successfully");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
//				connection.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public void displayBatch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Display Batch...");
		System.out.println("\tBatch Id\tBatch Name\tFaculty Id\tFaculty Name\tCourse Id\tCourse name");
		try {
			connection = ClassConnection.getConnection();
			String sql = "Select b.bId,b.bName,f.fId,f.fName,c.cId,c.cName from batch b inner join faculty as f on b.fId=f.fId inner join course c on f.cId=c.cId";
			Statement smt=connection.createStatement();
			ResultSet rs=smt.executeQuery(sql);
			while(rs.next()) {
				System.out.println("\t"+rs.getInt(1)+"\t\t"+rs.getNString(2)+"\t"+rs.getInt(3)+"\t\t"+rs.getString(4)+"\t\t"+rs.getInt(5)+"\t\t"+rs.getString(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
//				connection.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public void addStudent() {
		Connection connection=null;
		Scanner sc= new Scanner(System.in);
		connection=ClassConnection.getConnection();
		System.out.println("Add Student...");
		String sql="insert into student values (?,?,?)";
		try {
			System.out.println("Enter how many student you want to add:");
			PreparedStatement ps=connection.prepareStatement(sql);
			int n=sc.nextInt();
			for (int i=1;i<=n;i++) {
				
				System.out.println("Enter Student Id to set:");
				int sId=sc.nextInt();
				ps.setInt(1, sId);
				System.out.println("Enter Student Name to set:");
				String sName=sc.next();
				ps.setString(2, sName);
				
				System.out.println("Set Batch to student using Batch Id:");
				displayBatch();
				int bId=sc.nextInt();
				ps.setInt(3, bId);
				
				ps.execute();
				
				
					
				}
				System.out.println("Student added Successfully...");
	
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public void displayStudent() {
		System.out.println("Sudent Details...");
		System.out.println("\tStudent Id\tStudent Name\tBatch Id\tBatch Name\tFaculty Id\tFaculty Name\tCourse Id\tCourse name");

		try {
			connection=ClassConnection.getConnection();
			String sql="Select s.sId,s.sName,b.bId,b.bName,f.fId,f.fName,c.cId,c.cName from student s inner join  batch b on s.bId=b.bId inner join faculty f on b.fId=f.fId inner join course c on f.cId=c.cId ";
			Statement smt=connection.createStatement();
			ResultSet rs=smt.executeQuery(sql);
			while (rs.next()) {
				System.out.println("\t"+rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getInt(3)+"\t\t"+rs.getNString(4)+"\t"+rs.getInt(5)+"\t\t"+rs.getString(6)+"\t\t\t"+rs.getInt(7)+"\t\t"+rs.getString(8));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		


	}

}
