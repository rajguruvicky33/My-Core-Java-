package com.mappractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WorldMapList {
	public Map<String, Map<String, List<String>>> addCountries() {
		List<String> Maharashtra = new ArrayList<>();
		Maharashtra.add("Pune");
		Maharashtra.add("Satara");

		List<String> Telangana = new ArrayList<>();
		Telangana.add("Warangal");
		Telangana.add("Haiderabad");

		Map<String, List<String>> india = new HashMap<>();
		india.put("MH", Maharashtra);
		india.put("TL", Telangana);

		List<String> Washington = new ArrayList<>();
		Washington.add("Boston");
		Washington.add("Texas");

		List<String> NewYork = new ArrayList<>();
		NewYork.add("New Jersey");
		NewYork.add("Yonkers");

		Map<String, List<String>> America = new HashMap<>();
		America.put("USA1", Washington);
		America.put("USA2", NewYork);

		Map<String, Map<String, List<String>>> world = new HashMap<>();
		world.put("IND", india);
		world.put("USA", America);

		return world;

	}

	public static void main(String[] args) {
		
		WorldMapList world = new WorldMapList();

		Map<String, Map<String, List<String>>> map = world.addCountries();// *1
// first =try to convert outer map into set using keyset();

		Set<String> country = map.keySet();
		Iterator<String> itr1 = country.iterator();
		
		while (itr1.hasNext()) {
			String key1 = itr1.next();
			// System.out.println(key1);
			System.out.println(key1 + " " + map.get(key1));
			System.out.println("-------------");

// going for inner Map keys
// from *1
			Map<String, List<String>> mapinner = map.get(key1); // *2
			Set<String> state = mapinner.keySet();
			Iterator<String> itr2 = state.iterator();
			while (itr2.hasNext()) {
				String key2 = itr2.next();
				System.out.println("------------------------");
				System.out.println(key2 + " " + mapinner.get(key2));
				System.out.println("---------------------------");

// going to iterate inner list
// from *2
				List<String> InnerList = mapinner.get(key2);

				Iterator<String> itr3 = InnerList.iterator();
				while (itr3.hasNext()) {
					String city = itr3.next();
					System.out.println(city);
				}
			}
		}
		System.out.println("\n*******For each Loop**********");
// use set *1
		
		for (String a : country) {
			System.out.println(a + " " + map.get(a));
			System.out.println("---------------------");
			
// similar to set *2
			
			Map<String, List<String>> state = map.get(a);
			Set<String> innerMap = state.keySet();
			for (String b : innerMap) {
				
				System.out.println(b + " " + state.get(b));
				System.out.println("---------------------");
				
//last inner list
				
				List<String> city = state.get(b);
				for (String c : city) {

					System.out.println(c);
				}
			}
		}

	}

}
