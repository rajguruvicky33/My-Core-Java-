package com.exp.serealization.exercis;

import java.io.Serializable;

public class Parent implements Serializable{
	
	int pid;
	String pname;
	String padd;
	public Parent(int pid, String pname, String padd) {
	
		this.pid = pid;
		this.pname = pname;
		this.padd = padd;
	}
	

}
