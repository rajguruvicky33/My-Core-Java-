package com.exponent.serealization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DePersistent {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("output.txt"));
		
		Student s1=(Student) in.readObject();
		Student s2=(Student) in.readObject();
	
		System.out.println(s1.id+" "+s1.name+" "+s1.add);
		System.out.println(s2.id+" "+s2.name+" "+s2.add);
	
	}

}
