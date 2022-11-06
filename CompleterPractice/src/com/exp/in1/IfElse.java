package com.exp.in1;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner aa=new Scanner(System.in);
		System.out.println("\n Please Enter the value so we can check:");
		String g=aa.next();
		String a="USA";
		String b="UK";
		String c="India";
		
		
		if (g==a) {
			System.out.println("Yes,USA is in top 3 developed country");
			
		}
		if(g==b) {
			System.out.println("Yes,UK is in top 3 developed country");
		}
		 if(g==c) {
			System.out.println("Yes,India is in top 3 developed country");
		}
		else {
			System.out.println("Invalid Entry");
		}
	}			
}
