package com.exponent.overriding;

public class Child extends Parent {
	@Override
	public void m1() {
		System.out.println("First method of child class");
	}
	@Override
	public void m2(int i) {
	System.out.println("Second method of child class");
	}
	@Override
	public void m3(int i, String j) {
		System.out.println("Third method of child class");
	}
	public static void main(String[] args) {
		 
		Child c=new Child();
		c.m1();
		c.m2(10);
		c.m3(78, "Akole");
		c.m4(4521, 785698562L);
		c.m5(5);
	}

}
