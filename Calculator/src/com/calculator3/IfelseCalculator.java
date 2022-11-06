 package com.calculator3;

import java.util.Scanner;

public class IfelseCalculator {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	double num1=sc.nextDouble();
	
	char a=sc.next().charAt(0);
	
	double num2=sc.nextDouble();
	double result =0;
	
	if (a=='+') {
		result =num1+num2;
	}
	else if (a=='-') {
		result =num1+num2;
	}
	else if (a=='*') {
		result = num1*num2;
	}
	else if (a=='/') {
		result =num1/num2;
	}
	
	System.out.println(num1+" "+a+" "+num2+"="+result);
	//System.out.println("Result:"+result);	
		
		
	}
}


