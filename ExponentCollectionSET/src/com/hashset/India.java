package com.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class India {
	public Set<Set<String>> addState() {
		
		Set<String> Maharashtra=new HashSet<String>();
		Maharashtra.add("Pune");
		Maharashtra.add("Thane");
		
		Set<String> Telangana=new HashSet<String>();
		Telangana.add("Warangal");
		Telangana.add("Karimnagar");
		
		Set<Set<String>> India =new HashSet<Set<String>>();
		
		India.add(Telangana);
		India.add(Maharashtra);
		
		return India;

	}
	public static void main(String[] args) {
		
		India ind=new India();
		Set<Set<String>> i1=ind.addState();
		System.out.println("----Iterator Method----");
		Iterator<Set<String>> i2=i1.iterator();
		while (i2.hasNext()) {
			Set<String> r1=i2.next();
//			System.out.println(r1);
			
			Iterator<String> r2=r1.iterator();
			while (r2.hasNext()) {
				System.out.println(r2.next());
			}
		}
		System.out.println("\n----For Each loop----");
		
		for (Set<String> set : i1) {
			for (String set2 : set) {
				System.out.println(set2);
			}
			
		}
	
	
	
	}

}
