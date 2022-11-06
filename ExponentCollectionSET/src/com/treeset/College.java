package com.treeset;

import java.util.Set;
import java.util.TreeSet;

public class College {
	public Set<Student> addStudent() {
		Student s1=new Student(11, "Kavya", "Akole");
		Student s2=new Student(12, "Komal", "Chichwad");
		
		Set<Student> s=new TreeSet<Student>();
		s.add(s1);
		s.add(s2);
		
		return s;
		
	}

}
