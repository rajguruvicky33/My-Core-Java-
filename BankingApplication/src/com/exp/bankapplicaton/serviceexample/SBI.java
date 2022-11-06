package com.exp.bankapplicaton.serviceexample;

import java.util.Scanner;

import com.exp.bankapplication.modal.Account;
import com.exp.bankapplication.service.RBI;

public class SBI implements RBI{
	Scanner sc=new Scanner (System.in);
	Account account=new Account();
	

	@Override
	public void registerAccount() {
		System.out.println("Enter your account Number:");
		account.setAccountNo(sc.nextInt());
		
		System.out.println("Enter Customer Name:");
		account.setCustomerName(sc.next());
		
		System.out.println("Enter Mobile Number:");
		account.setMobileNo(sc.next());
		
		System.out.println("Enter Pan card Details  ");
		account.setPanCardNo(sc.next());
		
		System.out.println("Enter Aadhar card Number:");
		account.setAadharNo(sc.next());
		
		System.out.println("Enter Account Balance:");
		account.setAccountBalance(sc.nextDouble());
		
		System.out.println("Account created Successfully!!!");
	}
	@Override
	public void showAccountDetails() {
		System.out.println("Enter Account Number: ");
		int accNo=sc.nextInt();
		if(accNo==account.getAccountNo()) {
			
		System.out.println("Account Number:"+account.getAccountNo()
		+"\nCustomer Name:"+account.getCustomerName()+
		"\nMobile Number:"+account.getMobileNo()+"\nPan Card No:"+
		account.getPanCardNo()+"\nAadhar Number:"+account.getAadharNo()+
		"\nAccount Balance:"+account.getAccountBalance()+"\n");
		}else {
			System.out.println("Enter Correct Account Number");
		}
	}

	@Override
	public void showAccountBalance() {
		System.out.println("Enter Account Number");
		int accNo=sc.nextInt();
		if(accNo==account.getAccountNo()) {
		double amount =account.getAccountBalance();
		System.out.println("Account Balance:"+amount);
		}else {
			System.out.println("Account Number is incorect,Please enter correnct account Number");
		}
	}

	@Override
	public void widrawMoney() {
		System.out.println("Enter Account Number");
		int accNo=sc.nextInt();
		if(accNo==account.getAccountNo()) {
		System.out.println("Enter amount to be widhraw:");
		}
		double wamount=sc.nextDouble();
		if(wamount<=account.getAccountBalance()) {
			double amount=account.getAccountBalance()-wamount;
			System.out.println("Availabe Balance:"+amount);
			account.setAccountBalance(amount);
		}else {
			System.out.println("Account balance is insufficent");
		}
	}

	@Override
	public void depositMoney() {
		System.out.println("Enter Account Number:");
		int accNo=sc.nextInt();
		if(accNo==account.getAccountNo()) {
			System.out.println("Enter Amount to be deposited:");
			double dAmount=sc.nextDouble();
			double amount=account.getAccountBalance()+dAmount;
			account.setAccountBalance(amount);
			System.out.println("Account Balance:"+amount);
		}else {
			System.out.println("Enter Correct account Number");
		}
		
	}

	@Override
	public void updateAccountDetails() {
		System.out.println("Enter Account Number:");
		int accNo=sc.nextInt();
		boolean flag=true;
		while(flag) {
			System.out.println("1: To change Customer Name");
			System.out.println("2: To change  Mobile Number");
			System.out.println("3: To change Pan card Details ");
			System.out.println("4: To change Aadhar Number");
			System.out.println("5: Exit");
			
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Please Enter new Name:");
				String custName=sc.next();
				account.setCustomerName(custName);
				break;
			case 2:
				System.out.println("Please Enter New Mobile Number");
				String mobNo=sc.next();
				account.setMobileNo(mobNo);
				break;
			case 3:
				System.out.println("Please enter new Pancard Details");
				String panCard=sc.next();
				account.setPanCardNo(panCard);
				break;
			case 4:
				System.out.println("Enter new Aadhar Number");
				String adharNo=sc.next();
				account.setAadharNo(adharNo);
				break;
			case 5:
				flag=false;
				break;
			}
			flag=false;

		}
		
	}
	

}
