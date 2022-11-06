package com.collections.classmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		Collections.addAll(list, "Vicky,Ajay,Nilesh");
		/* add All is collections class methods used to insert all
		 * element at a time...Collections class has other methods too
		 * which are as follows:
		 * 
		 * Sort method=sort element in assecding order..
		 */
		System.out.println(list);
		//sort method:
		Collections.sort(list);
		System.out.println("List after sorting: "+list);
		
		System.out.println("\n----New Topic Unmodifiable List----");
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(101);
		list1.add(102);
		list1.add(103);
		list1.add(104);
		list1.add(105);
		/*to make list unmodifiable we unmodifiable list method in collections
		 * class ...call that method ...then pass our list in that method as
		 * follows...so we can't modify that list directly...
		 */
		System.out.println(list1);
		System.out.println("\n");
		List<Integer> unmodifylist=Collections.unmodifiableList(list1);
//		unmodifylist.add(106);   we can't add this element as list is 
		System.out.println(unmodifylist);
		
		System.out.println("\nSynchronised List");
		Collections.synchronizedList(list1);
	}

}
