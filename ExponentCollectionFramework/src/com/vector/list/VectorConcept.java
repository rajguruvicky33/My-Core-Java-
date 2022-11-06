package com.vector.list;

import java.util.Iterator;
import java.util.Vector;

//t is recommended to use the Vector class in the thread-safe 
//implementation only

public class VectorConcept {
	public static void main(String[] args) {
		
		Vector v=new Vector();
		v.add(101);
		v.add("Vicky");
		v.add("Akole");
		
		System.out.println("Element in vector: "+v);
		
		System.out.println("------Iteration-------");
		
		Iterator v1=v.iterator();
		while (v1.hasNext()) {
			System.out.println(v1.next());
		}
		
		
		
		
	}

}
