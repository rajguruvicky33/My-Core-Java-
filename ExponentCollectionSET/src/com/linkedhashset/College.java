package com.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class College {
	public Set<Student> addStudDetails() {
		
		Student s1=new Student(51, "Akash", "Shivajinagar");
		Student s2=new Student(51, "Pratik", "Akurdi");
		Student s3=new Student(53, "Shruti", "Pimpri");
		
		Set<Student> student =new LinkedHashSet<Student>();
		
		student.add(s1);
		student.add(s2);
		student.add(s3);
		
		return student;
	}

}
