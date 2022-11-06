package com.optionalclass.java8;

import java.util.Optional;

/*Java introduced a new class Optional in jdk8. 
 * It is a public final class and used to deal with 
 * NullPointerException in Java application. 
 * You must import java.util package to use this class. 
 * It provides methods which are used to check the presence of 
 * value for particular variable.
 */

public class Concept {
	public static void main(String[] args) {
		//without optional class
		String [] s=new String [10];
		
//		String a5 =s[5];
//		System.out.println(a5);
		
		//with optional class
		Optional<String> check= Optional.ofNullable(s[5]);
		System.out.println("check");
		 if(check.isPresent()) {
			 String name=s[5].toLowerCase();
			 System.out.println(name);
		 }else {
			 System.out.println("String is not empty...");
		 }
		
	}

}
