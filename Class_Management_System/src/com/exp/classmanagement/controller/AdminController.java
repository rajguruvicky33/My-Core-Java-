package com.exp.classmanagement.controller;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.exp.classmanagement.Service.ClassManagementSystem;
import com.exp.classmanagement.implementation.ClassMgSystemDetails;

public class AdminController {
	public static void main(String[] args) {
		
		boolean flag=true;
		ClassMgSystemDetails cmd=new ClassMgSystemDetails();
		
		while(flag) {
			Scanner sc=new Scanner(System.in);
			System.out.println("------------------------------------------------------------------------");
			System.out.println("Welcome to Class Management System");
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("Select 1: To add Course ");
			System.out.println("Select 2: To Display Course Details");
			System.out.println("Select 3: To add Faculty");
			System.out.println("Select 4: TO Display Faculty Details");
			System.out.println("Select 5: To add Batch");
			System.out.println("Select 6: To Display Batch");
			System.out.println("Select 7: To add Students");
			System.out.println("Select 8: To Display Student Details");
			System.out.println("Select 9: Exit");
			System.out.println("------------------------------------");
			
			int choice=0;
			try {
				choice=sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Input allowed in Integer only,Please give valid input..");
			}
			
			switch (choice) {
			
			case 1:
				cmd.addCourse();
				break;
			case 2:
				cmd.displayCourse();
				break;
			case 3:
				cmd.addFaculty();
				break;
			case 4:
				cmd.displayFaculty();
				break;
			case 5:
				cmd.addBatch();
				break;
			case 6:
				cmd.displayBatch();
				break;
			case 7:
				cmd.addStudent();
				break;
			case 8:
				cmd.displayStudent();
				break;
			case 9:
				flag=false;
				break;
			default:
				System.out.println("Enter valid Input");
			
				sc.close();
			
			}
			
			
		}
		
	}

}
