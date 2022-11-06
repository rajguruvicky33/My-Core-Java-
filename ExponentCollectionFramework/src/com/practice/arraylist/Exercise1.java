package com.practice.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Exercise1 {
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(101);
		list.add(102);
		list.add(null);      //null element
		list.add(103);
		list.add(104);
		list.add(102);       //duplicate element
		list.add(105);
		list.add(106);
		
		System.out.println("to check size");
		System.out.println(list.size());
		System.out.println("----------------");
		System.out.println(list);
		
		System.out.println("\n--Convert Arraylist to Array---");
		Object [] object=list.toArray();
		
		
		for(Object a:object) {
			System.out.println(a);
		}
		System.out.println("--------------------------");
		System.out.println("**Retrieve element at perticular position**");
		
		System.out.println("\nElemtnt at 0 index: "+list.get(0));
		System.out.println("Elemtnt at 2 index: "+list.get(2));
		System.out.println("\n-------------------------");
		
		System.out.println("**Index of perticular element in arraylist**");
		System.out.println("\nIndex of 105 element: "+list.indexOf(105));
		System.out.println("Index of 102 element: "+list.indexOf(102));
		System.out.println("-----------------------------");
		
		System.out.println("**Check element present or not**");
		System.out.println("\nIs 101 present in given arraylist: "+list.contains(101));
		System.out.println("Is 110 present in given arraylist: "+list.contains(110));
		System.out.println("------------------------------");
		
		System.out.println("**is given arraylist is empty??**");
		System.out.println(list.isEmpty());
		System.out.println("------------------------------");
		
//		System.out.println("**Remove all element at once**");
//		System.out.println(list.removeAll(list));
//		System.out.println(list.get(0));
		System.out.println("----------------------------");
		
		System.out.println("** Retain all element **");
		System.out.println(list.retainAll(list));
		System.out.println(list.get(0));
		System.out.println("-------------------------");
		
		System.out.println("\n**Remove duplicate**");
		System.out.println(list.stream().distinct().collect(Collectors.toList()));
		System.out.println("-------------------------");
		
		System.out.println("\n**Reverse ArrayList**");
		
		
	}

}
