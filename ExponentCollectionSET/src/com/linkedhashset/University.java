package com.linkedhashset;

import java.util.Iterator;
import java.util.Set;

public class University {
	public static void main(String[] args) {
		
		College c=new College();
		Set<Student> c1 =c.addStudDetails();
		
		Iterator<Student> c2 =c1.iterator();
		
		while(c2.hasNext()) {
			Student c3=c2.next();
			
			System.out.println(c3);
		}
	}

}
