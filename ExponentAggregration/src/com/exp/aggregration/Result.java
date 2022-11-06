package com.exp.aggregration;

public class Result {
	public static void main(String[] args) {
		Address add=new Address("Akole","Pune","422601");
		Student student = new Student(78,"amit","COEP",add);
		
		System.out.println(student.sid+" "+student.sname+" "+student.collegename+" "+
		student.address.pAdd+" "+student.address.pincode);
	}
}
