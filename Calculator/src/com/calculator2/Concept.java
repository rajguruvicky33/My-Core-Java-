package com.calculator2;


public class Concept {
	double x=1254;
	double y=125;
	double a=x+y;
	double b=x*a;
	double c1=b/y;

	public double add() {
		
		return a;
	}
	public double multiply() {
		return b;
	}
	public double divide() {
		return c1;
	}
	
	public static void main(String[] args) {
		Concept c=new Concept();
		double a=c.add();
		System.out.println(a);
		
		double b=c.multiply();
		System.out.println(b);
		
		double c1=c.divide();
		System.out.println(c1);
		
	}

}
