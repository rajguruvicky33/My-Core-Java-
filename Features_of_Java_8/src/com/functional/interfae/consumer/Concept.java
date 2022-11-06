package com.functional.interfae.consumer;

import java.util.function.Consumer;

/***CONSUMER***
 * It is a functional interface defined in java.util.function package. 
 * It contains an abstract accept() and a default andThen() method. 
 * It can be used as the assignment target for a lambda expression or 
 * method reference.
 *The Consumer Interface accepts a single argument and does not 
 *return any result
*/
public class Concept {
	public static void main(String[] args) {
		 
		Consumer<Integer> c =   (x)   ->System.out.println(x);
		c.accept(101);
	}

}
