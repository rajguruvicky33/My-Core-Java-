package com.functional.interface1;

public class Test1Result{
	public static void main(String[] args) {
		
	Test1 t=(int x,int y) -> (x*y);
	int k=t.calculate(78, 52);
	System.out.println(k);

		
	}

}
