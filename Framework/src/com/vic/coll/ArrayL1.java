package com.vic.coll;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayL1 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
	  //ArrayList<String> list1=new ArrayList<String>();
	  //ArrayList<Boolean>list2=new ArrayList<Boolean>();
		list.add(10);
		list.add(25);
		list.add(78);
		list.add(45);
		//above used to add index ie.at 0 Index number is 10
		System.out.println(list);
		
		//to add element in between follow following steps:
		list.add(2, 36);
		System.out.println(list);//new element added 
		
		//to replace element used:
		list.set(1, 12);
		System.out.println(list);
		
		//delete element
		list.remove(2);   //deleted element at 2nd index
		System.out.println(list);
		
		//Size of array
		int size=list.size();
		System.out.println(size);
		
		//loops
		for (int i=0;i<list.size();i++) {
			System.out.println( list.get(i));
		}
		System.out.println();
	
		//Sorting
		Collections.sort(list);
		System.out.println(list);
		
		//remove Integer
		list.remove(Integer.valueOf(78));
		System.out.println(list);
		
		//For loops
		for (int i=0;i<list.size();i++) {
			System.out.println("the element is:"+list.get(i));
		}
		
		Iterator<Integer> it= list.iterator();
		while (it.hasNext()) {
			System.out.println("iterator:"+it.next());
		}
		
		
	}

}
