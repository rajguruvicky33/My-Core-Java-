package com.exp.aggregration;
//Aggregration using constructor
public class Student {
	int sid;
	String sname;
	String collegename;
	Address address;
	
	public Student(int sid, String sname, String collegename, Address address) {
		
		this.sid = sid;
		this.sname = sname;
		this.collegename = collegename;
		this.address = address;
	}
	
	

}
