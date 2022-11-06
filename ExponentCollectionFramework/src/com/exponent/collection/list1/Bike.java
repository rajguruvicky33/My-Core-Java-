package com.exponent.collection.list1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Bike {
	public static void main(String[] args) {
		
		LinkedListConcept l1=new LinkedListConcept(101, "Honda", "Unicorn", 959856.785);
		LinkedListConcept l2=new LinkedListConcept(102, "Bajaj", "Pulsar", 78968.856);
		LinkedListConcept l3 = new LinkedListConcept(103, "TVS", "Jupiter", 60995.652);
		
		List<LinkedListConcept> list=new LinkedList<LinkedListConcept>();
		
		list.add(l1);
		list.add(l2);
		list.add(l3);
		
		System.out.println("****Iterate using iterator interface****");
		
		Iterator<LinkedListConcept>list1=list.iterator();
		
		while(list1.hasNext()) {
			LinkedListConcept result = list1.next();
			System.out.println(result.id+" "+result.Brand+" "+result.modalName+" "+result.cost);
		}
	}

}

