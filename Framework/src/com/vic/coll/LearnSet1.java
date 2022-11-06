package com.vic.coll;

import java.util.HashSet;

public class LearnSet1 {
	//SET=
	//types are=1)Hashset  2)TreeSet  3)LinkedHashset

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		
		hs.add(36);
		hs.add(14);
		hs.add(15);
		hs.add(30);
		hs.add(17);
		hs.add(11);
		
		System.out.println(hs);
		
		hs.remove(17);
		
		System.out.println(hs);
		
		//to check element whether it is present or not inside the Set
		System.out.println(hs.contains(50));
		System.out.println(hs.contains(11));
		
		
		
	}

}
