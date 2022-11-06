package com.exponent.collection.list1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
//		List a=new ArrayList();			support loose coupling
		
		List <Integer> a1=new ArrayList<Integer>();
		
		a1.add(101);
		a1.add(102);
		a1.add(103);
		a1.add(104);
		a1.add(105);
		
		System.out.println(a1);
		System.out.println("size of array:"+a1.size());
		
		System.out.println("--Iterate array using Iterator interface--");
		
		Iterator<Integer>l1 = a1.iterator();
		while(l1.hasNext()) {
			int a=l1.next();
			System.out.println(a);
		}
		System.out.println("--Iterate array using forEach loop--");
	
		for(Integer a:a1) {
			System.out.println(a);
		}
	
	
	
	
	}

}
