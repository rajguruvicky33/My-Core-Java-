package com.vic.coll;

import java.util.ArrayDeque;
import java.util.Comparator;

public class LearnArrayDeque1 {
	public static void main(String[] args) {
		ArrayDeque<Integer> dq=new ArrayDeque<Integer>();
		
		dq.offer(15);
		dq.offerFirst(14);
		dq.offer(16);
		dq.offerLast(78);
		//offer and offerLast perform same functions
		//both add element at the last
		
		System.out.println(dq);
		
		dq.poll();
		System.out.println(dq);
		
		dq.peek();
		System.out.println(dq);
		
	}

}
