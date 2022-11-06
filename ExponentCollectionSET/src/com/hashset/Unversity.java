package com.hashset;

import java.util.Iterator;
import java.util.Set;

public class Unversity {
	public static void main(String[] args) {

		College college = new College();

		Set<Student> s = college.addStudentDetails();
		System.out.println("--Iterator using Iterator Interface---");
		Iterator<Student> s1 = s.iterator();

		while (s1.hasNext()) {
			Student s2 = s1.next();
			System.out.println(s2.getSid() + " " + s2.getSname() + " " + s2.getSadd());
		}

	}

}
