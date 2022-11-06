package com.vic.coll;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue1 {
	//this is the type of queue
	//It is used to give priority to certain element in the queue
	public static void main(String[] args) {
		Queue<String> qq=new PriorityQueue<String>();
		
		qq.offer("Prime Minister");
		qq.offer("Home Minister");
		qq.offer("HR Minister");
		qq.offer("Defence Minister");
		
		System.out.println("All Que:"+qq);
		
		qq.poll();
		System.out.println("After Removal:"+qq);
		
		qq.peek();
		System.out.println(qq);
		
		
		
	}

}
