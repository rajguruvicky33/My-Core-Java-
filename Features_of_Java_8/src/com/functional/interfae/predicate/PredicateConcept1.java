package com.functional.interfae.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateConcept1 {
	public static void main(String[] args) {
		List<String> list= Arrays.asList("Pune","Akole","Nashik","Solapur"
				+ "Kolhapur","Latur");
		
		Predicate<String> pr=(s) -> s.startsWith("P");
		
		for (String s1:list) {
			if(pr.test(s1)) {
				System.out.println(s1);
			}
		}
		
	}

}
