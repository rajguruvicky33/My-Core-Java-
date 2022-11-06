package com.exponent.abstractkeyword;

public class Mahindra extends Vehicle {

	@Override
	public void specification() {
		System.out.println("Specification of Mahindra Vehicle");
		String modalName=" THAR ";
		String modalId= "MDT8562Q";
		double modalcost=2078452;
		System.out.println("Modal Name:"+modalName+"\nModal Id:"+modalId+
				"\nModal Cost:"+modalcost);
	}
	public void m2() {
		System.out.println("Welcome to Mahindra Family");
	}	
	public static void main(String[] args) {
		
		Vehicle v=new Mahindra();
		v.tyre();
		v.specification();
//		v.m2();
		
	}

}
