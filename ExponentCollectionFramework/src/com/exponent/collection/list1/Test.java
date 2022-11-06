package com.exponent.collection.list1;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		List list=new ArrayList();
		
		list.add("101");
		list.add("Sachin");
		list.add(null);
		list.add("Pune");
		list.add("50");
		list.add(null);
		
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(2));
		System.out.println(list.isEmpty());
		
		
	}

}
