package com.exponent.classcontroller;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.exponent.implementation.ClassManagementImplement;
import com.exponent.serviceinterface.ClassManagementSystem;

public class AdminController {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ClassManagementImplement cmd=new ClassManagementImplement();
		boolean flag=true;
		
		while(flag) {
			System.out.println("-----Welcome to class Management System-----");
			System.out.println("Select 1: To add Course");
			System.out.println("Select 2: TO Display Course");
			System.out.println("Select 3: To add Faculty");
			System.out.println("Select 4: TO Display Faculty");
			System.out.println("Select 5: To add batch");
			System.out.println("Select 6: TO display Batch");
			System.out.println("Select 7: To add Student");
			System.out.println("Select 8: To display Student");
			System.out.println("Select 9: Exit");
			System.out.println("------------------------------");
			
			int choice=0;
			try {
				choice=sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Please provide input in Integer");
			}
			switch(choice) {
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
				System.out.println("Please enter valid input");
				break;
				
			}
		}
		
	}

}
