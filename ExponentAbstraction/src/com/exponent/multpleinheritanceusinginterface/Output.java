package com.exponent.multpleinheritanceusinginterface;
//this is multiple inheritance
//output class implement two interface INT1 and INT2

public class Output implements INT1,INT2{

	@Override
	public void m2() {
	System.out.println("This is method from Int2");
	}

	@Override
	public void m1() {
		System.out.println("This is common method from both Interface");
	}
	public static void main(String[] args) {
		System.out.println(a+" "+b+" "+c+" "+d);
		
		INT1 int1=new Output();
		int1.m1();
		
		System.out.println("---------------------");
		INT2 int2=new Output();
		int2.m1();
		int2.m2();
	}
}
