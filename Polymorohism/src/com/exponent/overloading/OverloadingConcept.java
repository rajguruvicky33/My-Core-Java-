package com.exponent.overloading;
//same method name but different parameter
//

public class OverloadingConcept {
	public void m1() {
		System.out.println("First method of this class");
	}
	public void m1(int id,String name) {
		System.out.println("Method of two parameter");
		System.out.println(id);
		System.out.println(name);
	}
	public void m1(int id,String name,long aadharNo) {
		System.out.println("Method of three Parameter");
	}
	
	public static void main(String[] args) {
		OverloadingConcept over=new OverloadingConcept();
		over.m1(45,"Amit");
	}
	

}
