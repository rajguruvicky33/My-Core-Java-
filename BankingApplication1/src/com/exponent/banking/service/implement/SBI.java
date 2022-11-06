package com.exponent.banking.service.implement;

import java.util.Scanner;

import com.exponent.banking.modal.Account;
import com.exponent.banking.service.RBI;

public class SBI implements RBI {
	Scanner sc = new Scanner(System.in);
	Account account = new Account();

	@Override
	public void RegisterAccount() {
		// System.out.println("Please enter account Number");
		account.setAccNo(getaccounNumber());

		// System.out.println("Please enter Customer Name");
		account.setCustName(getCustomerName());

		//System.out.println("Please enter mobile number");
		account.setMobNo(getMobileNumber());

		//System.out.println("Please enter aadhar number");
		account.setAadharNo(getAadharNumber());

		System.out.println("Please set account balance");
		account.setAccountBalance(sc.nextDouble());

		System.out.println("Customer added Successfully...");

	}

	@Override
	public void showAccountDetails() {
		System.out.println("Please enter account number to show details");
		int choice = sc.nextInt();
		if (choice == account.getAccNo()) {
			System.out.println(account.getAccNo() + "\n" + account.getCustName() + "\n" + account.getMobNo() + "\n"
					+ account.getAccountBalance());
		} else {
			System.out.println("Please enter correct account Number");
		}
	}

	@Override
	public void showAccountBalance() {
		System.out.println("Please enter account number to check balance");
		int choice = sc.nextInt();
		if (choice == account.getAccNo()) {
			System.out.println("Account Balance with account Number " + account.getAccNo() + "is Rs. "
					+ account.getAccountBalance());
		} else {
			System.out.println("enter valid account number");
		}

	}

	@Override
	public void depositeMoney() {
		System.out.println("Please enter account number in which money to be deposited");
		int choice = sc.nextInt();
		if (choice == account.getAccNo()) {
			System.out.println("enter amount to be deposited:");
			int amount = sc.nextInt();
			double accountBalance = amount + account.getAccountBalance();
			account.setAccountBalance(accountBalance);
			System.out.println("New account balance: " + account.getAccountBalance());
		} else {
			System.out.println("Please enter correct account number");
		}
	}

	@Override
	public void widrawMoney() {
		System.out.println("Please enter account number to widraw money");
		int choice = sc.nextInt();
		if (choice == account.getAccNo()) {
			System.out.println("Enter the amount to be widraw");
			double amount = sc.nextDouble();
			if (amount <= account.getAccountBalance()) {
				double accountBalance = account.getAccountBalance() - amount;
				System.out.println("account balance after widrawal: " + accountBalance);
				account.setAccountBalance(accountBalance);
			} else {
				System.out.println("widrawal amount must be less than available balance:");
			}
		} else {
			System.out.println("Incorrect account number");
		}
	}

	@Override
	public void updateAccountDetails() {
		// TODO Auto-generated method stub

	}

	public int getaccounNumber() {
		System.out.println("please enter account Number to set");
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		try {
			choice = sc.nextInt();
		} catch (Exception e) {
			System.out.println("account number must be in Numbers");
			return getaccounNumber();
		}
		String accNo = String.valueOf(choice);
		if (choice <= 0 || accNo.length() != 5) {
			return getaccounNumber();
		}
		return choice;
	}

	public String getCustomerName() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer name to set");
		String custName=sc.next();
		if(custName.length()>=12) {
			System.out.println("Name must be within 12 character");
			return getCustomerName();
		}
		return custName;
	}
	public String getMobileNumber() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter mobile Number to set");
		String mobNo=sc.next();
		String mobNumb=String.valueOf(mobNo);
		if(mobNumb.length()!=10) {
			System.out.println("Please enter Mobile Number of 10 digit");
			return getMobileNumber();
		}
		return mobNo;
	}
	public String getAadharNumber() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Aadhar Number to set");
		String adharNo=sc.next();
		String adharNumb=String.valueOf(adharNo);
		if(adharNumb.length()!=12) {
			System.out.println("Please enter Aadhar Number of 12 digit");
			return getAadharNumber();
		}
		return adharNo;
		
	}
	
}
