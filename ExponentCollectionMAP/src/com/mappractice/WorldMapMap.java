package com.mappractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class WorldMapMap {
	public Map<String, Map<String, Map<String, String>>>  addCountry() {
		Map<String, String> Maharashtra = new HashMap<String, String>();
		Maharashtra.put("MH1", "Pune");
		Maharashtra.put("MH2", "Nashik");

		Map<String, String> Gujrat = new HashMap<String, String>();
		Gujrat.put("GJ1", "Vapi");
		Gujrat.put("GJ2", "Surat");

		Map<String, Map<String, String>> India = new HashMap<String, Map<String, String>>();
		India.put("IND1", Maharashtra);
		India.put("IND2", Gujrat);

		Map<String, String> Washington = new HashMap<String, String>();
		Washington.put("WG", "Boston");
		Washington.put("WG2", "Texas");

		Map<String, String> NewYork = new HashMap<String, String>();
		NewYork.put("NY1", "New Jersey");
		NewYork.put("NY2", "Yonkers");

		Map<String, Map<String, String>> America = new HashMap<String, Map<String, String>>();
		America.put("USA1", NewYork);
		America.put("USA2", Washington); 
		
		
		Map<String, Map<String, Map<String, String>>> world = new HashMap<String, Map<String, Map<String, String>>>();
		world.put("WD1", India);
		world.put("WD2", America);
		
		return world;
	}
	public static void main(String[] args) {
		WorldMapMap wmap=new WorldMapMap ();
		Map<String, Map<String, Map<String, String>>>FirstMap=wmap.addCountry();
		
		Set<String> world=FirstMap.keySet();
		Iterator<String>itr1=world.iterator();
		while (itr1.hasNext()) {
			String key1=itr1.next();
			System.out.println(key1+" "+FirstMap.get(key1));
			System.out.println("**************************");
			
			
		Map<String, Map<String, String>> SecondMap=FirstMap.get(key1);
		Set<String>State=SecondMap.keySet();
		
		Iterator<String>itr2=State.iterator();
		while(itr2.hasNext()) {
			String key2=itr2.next();
			System.out.println("\n"+key2+" "+SecondMap.get(key2));
			System.out.println("------------------------------------");
			
		
		Map<String, String> ThirdMap=SecondMap.get(key2);
		Set<String> city=ThirdMap.keySet();
		
		Iterator<String > itr3=city.iterator();
		while(itr3.hasNext()) {
			String key3=itr3.next();
			System.out.println(key3+" "+ThirdMap.get(key3));
			System.out.println("..........................");
		}
			
			
		}
			
			
			
			
		}
		
	}

}
