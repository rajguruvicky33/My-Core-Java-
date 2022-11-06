package com.staticdefault.ininterface;

public interface A {
	void m1();
	
	default void m2() {
		System.out.println("Default method of interface ");
	}

}
