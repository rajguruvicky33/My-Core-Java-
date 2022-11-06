package com.exponent.abstractkeyword;

public class Tata extends Vehicle {
	
	
	
	@Override
	public void specification() {
		System.out.println("Specification of TaTa Vehicle");
		String modalName=" Safari ";
		String modalId= "BAT8562";
		double modalcost=978452;
		System.out.println("Modal Name:"+modalName+"\nModal Id:"+modalId+
				"\nModal Cost:"+modalcost);
		
	}
	public void m1() {
		System.out.println("Welcome to Tata group");
	}
	
	public static void main(String[] args) {

//1)	first we make parent child class mixed object i.e. loose coupling
		Vehicle v=new Tata();
		v.tyre();
		v.specification();
//      v.m1();   we can't call this method as we create mixed object
		System.out.println("----------------------------");
	
// this child object
		Tata t=new Tata();
		t.tyre();
		t.specification();
		t.m1();
		
	
	}
}
