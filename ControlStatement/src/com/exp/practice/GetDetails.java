package com.exp.practice;

import java.util.Scanner;

public class GetDetails {
	public static void main(String[] args) {
		SetDetails set=new SetDetails();
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		
		switch (a) {
		case 1:
			System.out.println("Jersey Number:"+set.d.jerseyId+"\nPlayer Name:"
		+set.d.playerName+"\nState:"+set.d.state+"\nPin code:"+set.d.pinCode+"\nContact Number:"+set.d.contactNumber);
			break;
			
		case 2:
			System.out.println("Jersey Number:"+set.d1.jerseyId+"\nPlayer Name:"
		+set.d1.playerName+"\nState:"+set.d1.state+"\nPin code:"+set.d1.pinCode+"\nContact Number:"+set.d1.contactNumber);
			break;
			
		case 3:
			System.out.println("Jersey Number:"+set.d2.jerseyId+"\nPlayer Name:"
		+set.d2.playerName+"\nState:"+set.d2.state+"\nPin code:"+set.d2.pinCode+"\nContact Number:"+set.d2.contactNumber);
			break;
			
		case 4:
			System.out.println("Jersey Number:"+set.d3.jerseyId+"\nPlayer Name:"
		+set.d3.playerName+"\nState:"+set.d3.state+"\nPin code:"+set.d3.pinCode+"\nContact Number:"+set.d3.contactNumber);
			break;
			
		case 5:
			System.out.println("Jersey Number:"+set.d4.jerseyId+"\nPlayer Name:"
		+set.d4.playerName+"\nState:"+set.d4.state+"\nPin code:"+set.d4.pinCode+"\nContact Number:"+set.d4.contactNumber);
			break;
		}
	}

}
