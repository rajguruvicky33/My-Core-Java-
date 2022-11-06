package com.equalsandhashcode;

import java.util.HashSet;
import java.util.Set;


public class DuplicateTest {
	public static void main(String[] args) {
		
		Employee e=new Employee(101, "Akash"); 
		Employee e1=new Employee(101, "Akash");
		
		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());
		
		System.out.println(e==e1);   
		//this will check only addresses of given object
		
//		System.out.println(e.equals(e1));
		
		
		Set<Employee> emp=new HashSet<Employee>();
		emp.add(e);
		emp.add(e1);
		
		System.out.println(e.equals(e1));
		
		System.out.println("Size of Array: "+emp.size());
	}
	

}
