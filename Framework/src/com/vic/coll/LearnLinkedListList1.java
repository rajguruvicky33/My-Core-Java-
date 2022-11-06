package com.vic.coll;

import java.util.LinkedList;
import java.util.List;

public class LearnLinkedListList1 {
	public static void main(String[] args) {
		List<Integer> last=new LinkedList<Integer>();
		
		last.add(5);
		last.add(8);
		last.add(6);
		last.add(9);
		last.add(10);
		
		System.out.println("Initial Values:"+last);
		
		last.remove(1);
		System.out.println("Values after removal of element at 1:"
		+last);
		
		last.clear();
		System.out.println("After clear:"+last);
		
	}

}
