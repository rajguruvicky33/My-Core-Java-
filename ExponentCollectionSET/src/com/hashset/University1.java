package com.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class University1 {
	public Set<Set<String>> addUniv() {
		Set<String> Pune=new HashSet<String>();
		
		Pune.add("Engineering");
		Pune.add("Architect");
		
		Set<String> Mumbai=new HashSet<String>();
		Mumbai.add("Arts");
		Mumbai.add("Commerce");
		
		Set<Set<String>> university =new HashSet<Set<String>>();
		university.add(Pune);
		university.add(Mumbai);
		
		return university;

		
	}
	public static void main(String[] args) {
		
		University1 uni=new University1();
		Set<Set<String>> u1=uni.addUniv();
		System.out.println("-------Using iterator interface------");
		Iterator<Set<String>> u2=u1.iterator();
		while(u2.hasNext()) {
			Set<String> r1=u2.next();
			
			Iterator<String> r2=r1.iterator();
			while (r2.hasNext()) {
				String r3=r2.next();
				System.out.println(r3);
			}
			
		}
		System.out.println("\n-----Using for Each loop---------");
		
		for(Set<String> t:u1) {
			for(String s:t) {
				System.out.println(s);
			}
		}
		
		
		
	}

}
