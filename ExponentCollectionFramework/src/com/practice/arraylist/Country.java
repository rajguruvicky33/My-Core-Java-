package com.practice.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Country {
	public List<List<String>> addState() {
		
		List<String> Maharashtra = new ArrayList<String>();
		Maharashtra.add("Pune");
		Maharashtra.add("Mumbai");
		Maharashtra.add("Nashik");
		
		List<String> Gujrat = new ArrayList<String>();
		Gujrat.add("GandhiNagar");
		Gujrat.add("Surat");
		Gujrat.add("Vapi");
		
		List<List<String>> country=new ArrayList<List<String>>();
		country.add(Gujrat);
		country.add(Maharashtra);
		
		return country;
	}
	public static void main(String[] args) {
		
		Country country=new Country();
		
		List<List<String>> ind=country.addState();
		System.out.println(ind);//gives output in array form
		
		
		System.out.println("\n--Iterator using Iterator Interface---");
		
		Iterator<List<String>> i1=ind.iterator();
		while(i1.hasNext()) {
			List<String> i2=i1.next();
//			System.out.println(i2);     //this will iterate statewise
			
			Iterator<String> a1=i2.iterator();
			while(a1.hasNext())
			{
				System.out.println(a1.next());
			}
		}
		
		System.out.println("\n--Iterate using for each loop--");
		
		for (List<String> i : ind) {
//			System.out.println(i);
			
			for (String i2 : i) {
				System.out.println(i2);
			}
		}
		
		
		
		
	}

}
