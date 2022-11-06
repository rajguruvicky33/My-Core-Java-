package com.exponent.interfacekey;
//inheritace fromt interface to class we used implements instead of extends

public class Test implements I {

	@Override
	public void m1() {
	System.out.println("Overrided method from Interface");
	}
	
	public void m3() {
		System.out.println("THis is method of class Test");
	}
	public static void main(String[] args) {
		I i=new Test();
		System.out.println(I.i);            //or
//		System.out.println(i.i);
		System.out.println(i.j);
		System.out.println(i.k);
		i.m1();
//		i.m3();       for this make object of child class test
	}

}
