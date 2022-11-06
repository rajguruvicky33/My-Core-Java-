package com.treeset;

public class Student implements Comparable<Student> {

	int sid;
	String sname;
	String sadd;
	
	public Student(int sid, String sname, String sadd) {
		
		this.sid = sid;
		this.sname = sname;
		this.sadd = sadd;
	}
	@Override
	public String toString() {
	
		return sid+" "+sname+" "+sadd;

	}
/*	incase of treeset we get the output in ascending order
	but in this class contain student id,name,address so in 
	order to used treeset we follows follwing steps:
	
		1)implements this class with comparable interface
		2)add comprare to overrided method whose return type
		is int
															*/
	
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.sid;
	}

}
