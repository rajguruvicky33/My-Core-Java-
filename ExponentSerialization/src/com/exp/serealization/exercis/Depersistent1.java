package com.exp.serealization.exercis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Depersistent1 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream input=new ObjectInputStream(new FileInputStream("Output1.txt"));
		
		Child c=(Child)input.readObject();
		 
		System.out.println(c.pid+" "+c.pname+" "+c.padd+" "+" "+c.sid+" "+c.sname+" "+c.sadd);
	
	
	}

}
