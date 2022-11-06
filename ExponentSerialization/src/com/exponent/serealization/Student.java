package com.exponent.serealization;

import java.io.Serializable;

public class Student implements Serializable {
	public int id;
	public String name;
	public String add;
	
	public Student(int id, String name, String add) {
		
		this.id = id;
		this.name = name;
		this.add = add;
	}
	

}
