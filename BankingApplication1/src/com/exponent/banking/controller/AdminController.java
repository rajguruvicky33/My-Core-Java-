package com.exponent.banking.controller;

import java.util.Scanner;

import com.exponent.banking.service.RBI;
import com.exponent.banking.service.implement.SBI;

public class AdminController {
	public static void main(String[] args) {
		
		boolean flag=true;
		RBI rbi=new SBI();
		while (flag) {
			Scanner sc=new Scanner(System.in);
			System.out.println("-----------------------");
			System.out.println("Welcome to SBI Bank...");
			System.out.println("-----------------------");
			
			System.out.println("Select 1: To create account");
			System.out.println("Select 2: To check account Details");
			System.out.println("Select 3: To Check account balance");
			System.out.println("Select 4: TO deposite money");
			System.out.println("Select 5: To widraw money");
			System.out.println("Select 6: To update account details");
			System.out.println("Select 7: Exit");
			System.out.println("-----------------------");
			
			int choice = 0;
			try {
				
				choice=sc.nextInt();
			} catch (Exception e) {
				System.out.println("Input allowed in Integer only");
				
			}
			
			switch (choice) {
			case 1: 
				rbi.RegisterAccount();
				break;
			case 2:
				rbi.showAccountDetails();
				break;
			case 3:
				rbi.showAccountBalance();
				break;
			case 4:
				rbi.depositeMoney();
				break;
			case 5:
				rbi.widrawMoney();
				break;
			case 6:
				rbi.updateAccountDetails();
				break;
			case 7:
				flag=false;
				break;
			default:
				System.out.println("Enter valid input");
				break;
			}
		}
		
	}
	

}
