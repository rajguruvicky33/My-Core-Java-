package com.exponent.serealization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Persistent {
	public static void main(String[] args) throws IOException {
		
		Student s1=new Student(100, "Raj", "Akurdi");
		
		Student s2 =new Student(101, "Sachin", "Mumbai");
		
		FileOutputStream fio = new FileOutputStream("output.txt");
		ObjectOutputStream out = new ObjectOutputStream(fio);
		
		out.writeObject(s1);
		out.writeObject(s2);
		
		out.close();
		System.out.println("Success....");
				
	}

}
