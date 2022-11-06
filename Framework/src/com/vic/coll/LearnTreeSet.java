package com.vic.coll;

import java.util.HashSet;
import java.util.TreeSet;

public class LearnTreeSet {
	//TreeSet= Element are linked as well as in a Sorted Form
	//check output of below programme
	//it arranged element in the ascending order
	public static void main(String[] args) {
		TreeSet<Integer> hs=new TreeSet<Integer>();
		
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
