package com.practice.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class World {
	public List<List<List<String>>> addCountry() {
		
		List<String> Maharashtra = new ArrayList<String>();
		Maharashtra.add("Pune");
		Maharashtra.add("Mumbai");
		Maharashtra.add("Nashik");
		
		List<String> Gujrat = new ArrayList<String>();
		Gujrat.add("GandhiNagar");
		Gujrat.add("Surat");
		Gujrat.add("Vapi");
		
		List<List<String>> India = new ArrayList<List<String>>();
		India.add(Gujrat);
		India.add(Maharashtra);
		
		List<String> NewYork = new ArrayList<String>();
		NewYork.add("Yonkers");
		NewYork.add("New York City");
		NewYork.add("Bufallows");
		
		List<String> California = new ArrayList<String>();
		California.add("San Fracsisco");
		California.add("San Diego");
		California.add("Los Angeles");
		
		List<List<String>> America = new ArrayList<List<String>>();
		America.add(NewYork);
		America.add(California);
		
		List<List<List<String>>>world = new ArrayList<List<List<String>>>();
		world.add(India);
		world.add(America);

		return world;
	}
	public static void main(String[] args) {
		
		World world=new World();
		
		List<List<List<String>>> world1=world.addCountry();
		System.out.println(world1);      
	
		System.out.println("\n--iterate using Iterator Interface--");
		
		Iterator<List<List<String>>> wd1=world1.iterator();
		while(wd1.hasNext()) {
			List<List<String>> ww=wd1.next();
//			System.out.println(ww);      //this will iterate countrywise
			
			Iterator<List<String>> ww1=ww.iterator();
			while (ww1.hasNext())
			{
				List<String> ww2=ww1.next();
//				System.out.println(ww2);     //print statewise
				
				Iterator<String> ww3=ww2.iterator();
				while(ww3.hasNext())
				{
					String ww4=ww3.next();
					System.out.println(ww4);
				}
			}
		}
		
		System.out.println("\n--Iterate using for each loop--");
		
		for (List<List<String>> list : world1) {
//			System.out.println(list);
			
			for (List<String> list1 : list) {
//				System.out.println(list1);
				
				for (String list2: list1) {
					System.out.println(list2);
					
				}
			}
			
		}
		
	}

}
