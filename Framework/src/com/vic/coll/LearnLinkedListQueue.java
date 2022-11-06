package com.vic.coll;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
	// Queue=Basically used for first in first out:
	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<Integer>();

		que.offer(78);
		//we used offer instead of add function bcoz it thorw 
		//Exception
		que.offer(25);
		que.offer(12);
		que.offer(45);
		que.offer(32);

		System.out.println("Linked list Queue:" + que);

		que.poll(); // This is to remove element(first Element)

		System.out.println("After Removal:" + que);
		
		que.peek();	//Next element which is going to remove after
		//removing current element
		
		System.out.println(que.peek());
		

	}

}
