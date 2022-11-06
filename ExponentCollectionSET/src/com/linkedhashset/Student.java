package com.linkedhashset;

public class Student {
	private int id;
	private String name;
	private String add;
	
	
	public Student(int id, String name, String add) {
		
		this.id = id;
		this.name = name;
		this.add = add;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+name+" "+add;
	}
	
	
	
}
