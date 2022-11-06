package com.staticdefault.ininterface;

public class B implements A {

	@Override
	public void m1() {

		System.out.println("Abstract method of Interface A");
		
	}
	@Override
	public void m2() {
		System.out.println("m2 method in class B");
	}

}
