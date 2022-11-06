package com.functional.interfae.supplier;

import java.util.function.Supplier;
/*Java 8 Supplier is a functional interface whose functional 
 * method is  get(). The Supplier interface represents an 
 * operation that takes no argument and returns a result. 
 * As this is a functional interface and can therefore be used 
 * as the assignment target for a lambda expression or method 
 * reference.
 */

public class SupplierConcept1 {
	public static void main(String[] args) {
		
		Supplier<Double> supp= ()  ->Math.random();
		//to get random values
		System.out.println(supp.get());
	}

}
