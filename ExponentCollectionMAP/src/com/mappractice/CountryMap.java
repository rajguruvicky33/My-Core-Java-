package com.mappractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountryMap {
	private Map<String, Map<String, String>> addCounty() {
		Map<String, String> Maharashtra=new HashMap<>();
		Maharashtra.put("M1", "Pune");
		Maharashtra.put("M2", "Nashik");
		
		Map<String, String> Gujrat=new HashMap<>();
		Gujrat.put("G1", "Surat");
		Gujrat.put("G2", "Vapi");
		
		Map<String, Map<String, String>> india=new HashMap<>();
		india.put("MAHARASHTRA", Maharashtra);
		india.put("GUJRAT", Gujrat);
		
		return india;
	}
	public static void main(String[] args) {
		CountryMap cmap=new CountryMap();		//class object
		
		Map<String, Map<String, String>> india=cmap.addCounty();  //method call using object
		System.out.println("-----Iterate using KeySet------");
		Set<String> state=india.keySet();	//convert state map in set
		
		Iterator<String> itr1=state.iterator();
		while(itr1.hasNext()) {
			String key=itr1.next();
	//		System.out.println(key);
			System.out.println("\nState: "+key+" "+india.get(key));
			System.out.println("------------------------------");
			
			Map<String, String> city=india.get(key);	//for inner map
			Set<String> s=city.keySet();
			
			Iterator<String>itr2=s.iterator();
			while(itr2.hasNext()) {
				String key1=itr2.next();
				System.out.println(key1+" "+city.get(key1));
			}

		}
		System.out.println("\n-----for each loop----");
		for(String s:state) {
			System.out.println("\n"+s);
			System.out.println("----------------");
			
			Map<String, String> listofCity=india.get(s);
			Set<String>city2=listofCity.keySet();
			for(String s2:city2) {
				System.out.println(s2+" "+listofCity.get(s2));
			}
		}
		
	}

}
