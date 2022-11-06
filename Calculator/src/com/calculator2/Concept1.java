package com.calculator2;

import java.util.Scanner;

public class Concept1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter First number to perform operation:");
		
		double a=sc.nextDouble();
		
		System.out.println("Enter the Operator (+,-,*,/):");
		char c=sc.next().charAt(0);
		System.out.println("Please Enter Second number to perform operation:");

		double b=sc.nextDouble();

		double e=0;
		
		switch (c)
		{
		case  '+' :
					e=a+b;
					break;
			
		case '-' :
					e=a-b;
					break;
			
		case '*' :
					e=a*b;
					break;
			
		case '/' :
					e=a/b;
					break;
			
		default:
			System.out.println("Invalid Entry");
		
		}
			System.out.println("Result:");
			//System.out.println();
			System.out.println(a+" "+c+" "+b+"="+e);
			sc.close();
	}

}
