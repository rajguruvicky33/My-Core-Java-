package com.functional.interface1;

public class TestResult implements Test {

	@Override
	public void m1(String msg) {
	System.out.println(msg);
	}
	public static void main(String[] args) {
		Test t=new TestResult();
		t.m1("Hello");
	}
}
