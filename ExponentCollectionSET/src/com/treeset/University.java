package com.treeset;

import java.util.Iterator;
import java.util.Set;

public class University {
	public static void main(String[] args) {
		College cg=new College();
		
		Set<Student> c=cg.addStudent();
		
		Iterator<Student> s3=c.iterator();
		
		while(s3.hasNext()) {
			Student r=s3.next();
			System.out.println(r);
		}
	}

}
