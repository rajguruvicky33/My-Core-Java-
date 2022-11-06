package com.vic.map;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap1 {
	public static void main(String[] args) {
		
		Map<Integer,String> mp=new HashMap<>();
		
		mp.put(1, "One");
		mp.put(2, "Two");
		mp.put(3, "Three");
		mp.put(4, "Four");
		
		//We can't repeat the values in the map
		//means overrride is not allow
		
		System.out.println("Values of mp:"+mp);
		
		//To gets Iteration follow :
		for (Map.Entry<Integer, String> e:mp.entrySet()) {
	 		System.out.println(e);
			
		// or if you want to print only key then follow
		// method 1)
			System.out.println(e.getKey());
		// methode 2)
			System.out.println(e.getValue());
		}
		
		
		
	}

}
