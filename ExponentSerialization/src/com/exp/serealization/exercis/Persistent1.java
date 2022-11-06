package com.exp.serealization.exercis;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Persistent1 {
	public static void main(String[] args) throws IOException {
		
		Child c=new Child(2, "Pratiksha", "Akole");
		
		FileOutputStream aa=new FileOutputStream("Output1.txt");
		
		ObjectOutputStream ot=new ObjectOutputStream(aa);
		ot.writeObject(c);
		
		ot.close();
		
		System.out.println("success.....");
				
	}

}
