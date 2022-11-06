package com.exp.controller;

import java.util.Scanner;

import com.exp.modal.User;
import com.exp.serviceimplements.UserServiceImplements;

public class UserController {
	public static void main(String[] args) {
		UserServiceImplements user=new UserServiceImplements();
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		
		while(flag) {
			System.out.println("Welcome to User Management System....");
			System.out.println("--------------------------------------");
			System.out.println("Select 1 : Add User");
			System.out.println("Select 2 : Delete User using Index");
			System.out.println("Select 3 : Delete User using User ID");
			System.out.println("Select 4 : Show User Details");
			System.out.println("Select 5 : Exit");
			System.out.println("--------------------------------------");
		int choice =sc.nextInt();
		
		switch(choice) {
		
		case 1 :
			user.addUserDetails();
			break;
			
		case 2 :
			user.deleteUserusingIndex();
			break;
			
		case 3 :
			user.deleteUserusingId();
			break;
			
		case 4 :
			user.getUserDetails();
			break;
			
		case 5 :
			flag=false;
			break;
			
		default:
			System.out.println("Invalid Entry");
		}
		
	}
		
	}

}
