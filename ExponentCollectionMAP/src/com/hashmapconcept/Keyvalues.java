package com.hashmapconcept;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Keyvalues {
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer,String>();
		map.put(101, "Pune");
		map.put(102, "Mumbai");
		map.put(103, "Nashik");
		map.put(104, "Akole");
		map.put(105, "Nigdi");
		
		System.out.println(map);
		System.out.println(map.get(102));
		System.out.println(map.get(107));//it will gives null values
		
		System.out.println("---Iterate Using KeySet-------");
		Set<Integer> m1=map.keySet();
		Iterator<Integer> itr=m1.iterator();
		while(itr.hasNext()) {
			Integer i=itr.next();
			System.out.println(i+" "+map.get(i));
		}
		System.out.println("-------For each loop---------------");
		for(Integer a:m1) {
			System.out.println(a+" "+map.get(a));
		}
		
		System.out.println("----Iterate using entry Set-----");
		Set<Map.Entry<Integer, String>>m2=map.entrySet();
		Iterator<Map.Entry<Integer, String>> itr1=m2.iterator();
		while(itr1.hasNext()) {
			Map.Entry<Integer, String> keys =itr1.next();
			System.out.println(keys.getKey()+" "+keys.getValue());
		}
		System.out.println("---Iterate using value method----");
		Collection<String>mm=map.values();
		Iterator<String> itr3=mm.iterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		
	}
	

}
