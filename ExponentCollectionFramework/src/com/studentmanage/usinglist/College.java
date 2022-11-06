package com.studentmanage.usinglist;

import java.util.ArrayList;
import java.util.List;

public class College {
	public List<Student> addStudentDetails() {
		Student s1=new Student();
		s1.id=10;
		s1.name="Sachin";
		s1.add="Akole";
		
		Student s2=new Student ();
		s2.id=11;
		s2.name="Pratik";
		s2.add="Akurdi";
		
		Student s3=new Student();
		s3.id=12;
		s3.name="Rahul";
		s3.add="Nigdi";
		
		
		List<Student>student=new ArrayList<Student>();
		student.add(s1);
		student.add(s2);
		student.add(s3);
		
		return  student;
				
	}
	

}
