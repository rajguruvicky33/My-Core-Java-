package com.studentmanage.usinglist;

import java.util.Iterator;
import java.util.List;

public class University {
	public static void main(String[] args) {
		College college=new College();
		
		List<Student> stud=college.addStudentDetails();
		System.out.println("Iterate using iterator..");
		
		Iterator<Student>str=stud.iterator();
		
		while(str.hasNext()) {
			Student s=str.next();
			System.out.println(s.id+" "+s.name+" "+s.add);
		}
		System.out.println("\nIterate using for each loop");
		for (Student s:stud) {
			System.out.println(s.id+" "+s.name+" "+s.add);
		}
		
	}

}
