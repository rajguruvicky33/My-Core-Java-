package com.exp.bankingapplication.controller;

import java.util.Scanner;
import com.exp.bankapplication.service.RBI;
import com.exp.bankapplicaton.serviceexample.SBI;

public interface AdminController {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		RBI rbi=new SBI();
		
	while (flag){
		System.out.println("1: Create Account");
		System.out.println("2: Show Account Details");
		System.out.println("3: Show Account Balance");
		System.out.println("4: Deposit Money");
		System.out.println("5: Widraw Money");
		System.out.println("6: Update Account Details");
		System.out.println("7: Exit");
		
		int choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:
			rbi.registerAccount();
			break;
		case 2:
			rbi.showAccountDetails();
			break;
		case 3:
			rbi.showAccountBalance();
			break;
		case 4:
			rbi.depositMoney();
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
			System.out.println("Invalid Entry,Thank you for using SBI");
			break;
		}
		
	}
		
	}

}
