package com.calculator2;

import java.util.Scanner;

public class Concept2 {
	public static void main(String[] args) {
		Scanner dc=new Scanner (System.in);
		System.out.println("Enter the first Number:");
		double num1=dc.nextDouble();
		System.out.println("Enter the Operator");
		char c=dc.next().charAt(0);
		System.out.println("Enter the Second Number:");
		double num2=dc.nextDouble();
		double result=0;
	
		
		//System.out.println(Arrays.toString(sign));   to print arrays
		
		if(c=='+') {
			result=num1+num2;
		}
		else if(c=='-') {
			result=num1-num2;
		}
		else if(c=='*') {
			result=num1*num2;
		}
		else if (c=='/'){
			result=num1/num2;
		}
		System.out.println("Result:");
		System.out.println();
		System.out.println(num1+" "+c+" "+num2+" "+"="+result);
		
		dc.close();
		
		
	}

}
