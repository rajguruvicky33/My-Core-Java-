package com.vic.coll;

import java.util.Stack;

public class LearnStack1 {
	//stack =it is Last in First out type data structure
	public static void main(String[] args) {
		Stack<String> animal=new Stack<String>();
		animal.push("Elephant");
		animal.push("Dog");
		animal.push("Horse");
		animal.push("Cat");
		
		System.out.println("Before pop out:"+animal);
		
		//Now to get peak element:
		System.out.println("Peak Element:"+animal.peek());
		
		animal.pop();  // To remove Last Element:
		System.out.println("After Pop Out:"+animal);
		
		
		
		
	}

}
