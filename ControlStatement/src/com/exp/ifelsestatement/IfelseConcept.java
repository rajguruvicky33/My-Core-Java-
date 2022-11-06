package com.exp.ifelsestatement;

import java.util.Scanner;

public class IfelseConcept {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Please enter the age to check Eligibility:");
		int age=a.nextInt();
		
		if (age>=18) {
			System.out.println("Eligible for vote");
		}else {
			System.out.println("Not Eligible for vote");
		}
	
	}

}
