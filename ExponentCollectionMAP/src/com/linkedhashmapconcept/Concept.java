package com.linkedhashmapconcept;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Concept {
	/*linked hashmap =maintain insertion order
	 * single null key values allowed
	 * duplicate key is no allowed
	 */
	public static void main(String[] args) {
		Map<String, Integer> mp=new LinkedHashMap<>();
		
		mp.put("Archana", 500);
		mp.put("Priya", 400);
		mp.put("Puja", 900);
		mp.put("Vaibhav", 1500);
		mp.put("Ganesh", 1200);
		
		System.out.println(mp);
		System.out.println(mp.size());
		System.out.println(mp.get("Puja"));
		System.out.println("---Iterator-----");
		Set<String> itr=mp.keySet();
		Iterator<String> ss=itr.iterator();
		while(ss.hasNext()) {
			String a=ss.next();
			System.out.println(a+"\t "+mp.get(a));
		}
		System.out.println("----For Each Loop-----");
		for (String string : itr) {
			System.out.println(string+"\t "+mp.get(string));
		}
	
	}
	

}
