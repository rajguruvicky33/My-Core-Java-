package com.functional.interfae.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierConcept2 {
	public static int getTwoInteger() {
		 int random=new Random().nextInt();
		 if (random<10) {
			 return 10;
		 }
		 return 10;
	}
	public static void main(String[] args) {
		Supplier<Integer> sup= SupplierConcept2::getTwoInteger;
		System.out.println(sup.get());
	}

}
