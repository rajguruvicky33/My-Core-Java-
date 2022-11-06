package com.vic.coll;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LearrnLinkedHashSet {
	//Similar to Hashset , only difference is that element are linked 
	//one after another
	public static void main(String[] args) {
		LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
		
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
