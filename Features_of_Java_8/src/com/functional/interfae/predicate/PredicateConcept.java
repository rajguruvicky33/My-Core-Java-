package com.functional.interfae.predicate;

import java.util.function.Predicate;

/*It is a functional interface which represents a predicate 
 * (boolean-valued function) of one argument. 
 * It is defined in the java.util.function package and contains 
 * test() a functional method.
 */

public class PredicateConcept {
	public static void main(String[] args) {
		
		Predicate<Integer> p= a -> (a>10);
		System.out.println(p.test(20));
	}

}
