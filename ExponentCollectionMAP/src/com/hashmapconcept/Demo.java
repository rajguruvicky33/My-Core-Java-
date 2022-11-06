package com.hashmapconcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<>();
		map.put(101, "India");
		map.put(102, "China");	//key is repeating so it takes next value for 102
		map.put(103, "Africa");
		map.put(104, "USA");
		map.put(102, "Nepal");
		
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map.get(101));

//to iterate map it must converted into set using following mehtods
		// keyset(); , entryset();, and values()
		System.out.println("-------Iterator------------");
		Set<Integer> m1=map.keySet();
		Iterator<Integer>it=m1.iterator();
		while (it.hasNext()) {
			Integer a=it.next();
			System.out.println(a+" "+map.get(a));
		}
		System.out.println("------For Each--------------");
		for(Integer a:m1) {
			System.out.println(a+" "+map.get(a));
		}
	}

}
