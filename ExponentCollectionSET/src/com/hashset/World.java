package com.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class World {
	public Set<Set<Set<String>>> addCountry() {
		Set<String> maharashtra = new HashSet<String>();
		maharashtra.add("Ahmednagar");
		maharashtra.add("Solaput");

		Set<String> Karanataka = new HashSet<String>();
		Karanataka.add("Banglore");
		Karanataka.add("Vijapur");

		Set<Set<String>> India = new HashSet<Set<String>>();
		India.add(maharashtra);
		India.add(Karanataka);

		Set<String> Washington = new HashSet<String>();
		Washington.add("Boston");
		Washington.add("Texas");

		Set<String> NewYork = new HashSet<String>();
		NewYork.add("New Jersey");
		NewYork.add("Yonkers");

		Set<Set<String>> USA = new HashSet<Set<String>>();
		USA.add(NewYork);
		USA.add(Washington);

		Set<Set<Set<String>>> world = new HashSet<Set<Set<String>>>();
		world.add(USA);
		world.add(India);

		return world;
	}

	public static void main(String[] args) {
		World w = new World();
		Set<Set<Set<String>>> a = w.addCountry();
		System.out.println("Iterate using Iterator Interface");

		Iterator<Set<Set<String>>> a1 = a.iterator();
		while (a1.hasNext()) {
			Set<Set<String>> a2 = a1.next();

			Iterator<Set<String>> a3 = a2.iterator();
			while (a3.hasNext()) {
				Set<String> a4 = a3.next();

				Iterator<String> a5 = a4.iterator();
				while (a5.hasNext()) {
					String result = a5.next();
					System.out.println(result);
				}

			}

		}
		System.out.println("\n--Using for each loop---");
		for (Set<Set<String>> t:a) {
			for(Set<String> t1:t) {
				for (String out:t1) {
					System.out.println(out);
				}
			}
		}

	}

}
