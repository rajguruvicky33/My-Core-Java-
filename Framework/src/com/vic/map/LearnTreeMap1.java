package com.vic.map;

import java.util.TreeMap;

public class LearnTreeMap1 {
	//he map is sorted according to the natural ordering of its keys, 
	//or by a Comparator provided at map creation time, 
	//depending on which constructor is used. 
	public static void main(String[] args) {
		TreeMap<String,Integer> tree=new TreeMap<String,Integer>();
		
		tree.put("Maharashtra", 95);
		tree.put("Gujrat", 96);
		tree.put("Bihar", 100);
		tree.put("Keral", 101);
		
		System.out.println(tree);
		
		tree.remove("Maharashtra");
		System.out.println(tree);
		
		
		
		
		
	}

}
