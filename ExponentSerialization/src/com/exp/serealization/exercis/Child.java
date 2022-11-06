package com.exp.serealization.exercis;

public class Child extends Parent{
	
	int sid;
	String sname;
	String sadd;
	public Child(int sid, String sname, String sadd) {
		super(1, "Rajesh", "Pune");
		this.sid = sid;
		this.sname = sname;
		this.sadd = sadd;
	}
	
	

}
