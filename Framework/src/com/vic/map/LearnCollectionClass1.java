package com.vic.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LearnCollectionClass1 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		
		 list.add(15);
		 list.add(41);
		 list.add(19);
		 list.add(12);
		 list.add(20);
		 list.add(19);
		 
		 System.out.println("min Value:"+Collections.min(list));
		 System.out.println("max Value:"+Collections.max(list));
		 
		 System.out.println(list);
		 
		
		
	}

}
