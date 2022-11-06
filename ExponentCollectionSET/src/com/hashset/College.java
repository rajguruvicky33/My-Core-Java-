package com.hashset;

import java.util.HashSet;
import java.util.Set;

public class College {
	
	public Set<Student> addStudentDetails() {
		
		Student s=new Student();
		s.setSid(1);
		s.setSname("Rakesh");
		s.setSadd("Karjat");
	
		Student s1=new Student();
		s1.setSid(2);
		s1.setSname("Ashok");
		s1.setSadd("Nanded");
		
		Student s2=new Student();
		s2.setSid(3);
		s2.setSname("Amol");
		s2.setSadd("Ravet");
		
		Set<Student> student=new HashSet<Student>();
		student.add(s);
		student.add(s1);
		student.add(s2);
		
		return  student;
	}

}
