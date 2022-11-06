package com.mappractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Country {
	public Map<String, List<String>> addCountry() {
		List<String>Maharashtra=new ArrayList<>();
		Maharashtra.add("Pune");
		Maharashtra.add("Nashik");
		Maharashtra.add("Kolhapur");
		
		List<String>Gujrat=new ArrayList<>();
		Gujrat.add("Surat");
		Gujrat.add("Dandi");
		Gujrat.add("Ahemadabad");
		
		Map<String, List<String>> india=new HashMap<>();
		india.put("GUJRAT", Gujrat);
		india.put("MAHARASHTRA", Maharashtra);
		
		return india;
	}
	public static void main(String[] args) {
		Country country=new Country();
		Map<String, List<String>>india=country.addCountry();
		
		Set<String>state=india.keySet();
		Iterator<String>itr=state.iterator();
		while(itr.hasNext())
		{
			String key=itr.next();
			System.out.println("\nkey Value:"+key);
			System.out.println("---------------------");
			
			List<String>city=india.get(key);
			Iterator<String>itr1=city.iterator();
			while(itr1.hasNext()) {
				System.out.println("Cities: "+itr1.next());
				
			}
		}
		
	}

}
