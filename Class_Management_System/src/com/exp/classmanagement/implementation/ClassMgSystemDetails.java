package com.exp.classmanagement.implementation;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.exp.classmanagement.Service.ClassManagementSystem;
import com.exp.classmanagement.modal.Batch;
import com.exp.classmanagement.modal.Course;
import com.exp.classmanagement.modal.Faculty;
import com.exp.classmanagement.modal.Student;

public class ClassMgSystemDetails implements ClassManagementSystem {
	Scanner sc = new Scanner(System.in);
	List<Course> Clist = new LinkedList<Course>();
	List<Faculty> Flist = new LinkedList<Faculty>();
	List<Batch> Blist = new LinkedList<Batch>();
	List<Student> Slist = new LinkedList<Student>();

	@Override
	public void addCourse() {
		int n = validCourseNo();
		for (int i = 0; i < n; i++) {
			Course course = new Course();
			// System.out.println("Enter Course ID to Set: ");
			course.setcId(validCourseId());
			// System.out.println("Enter Course name to set:");
			course.setcName(validCourseName());
			Clist.add(course);

		}
		System.out.println("Course added Successfully...");
	}

	public int validCourseNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many course you want to add: ");
		int n = 0;
		try {
			n = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Provide input in Numbers only");
			return validCourseNo();
		}
		return n;
	}

	public int validCourseId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Course id to set ");
		int choice = 0;
		try {
			choice = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Course Id must be in integer ");
			return validCourseId();
		}
		return choice;
	}

	public String validCourseName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Course Name to Set");
		String s = sc.nextLine();
		if (s.length() >= 15) {
			System.out.println("Name Must be within 15 Character");
			return validCourseName();
		}
		return s;
	}

	@Override
	public void displayCourse() {

		System.out.println("All the course Details are as follow:");
		System.out.println("------------------------------------------------");
		/*
		 * Iterator<Course> c=Clist.iterator(); while(c.hasNext()) {
		 * System.out.println(c.next()); }
		 */
		System.out.println("Course Id\tCourse Name");
		System.out.println("---------------------------------------");
		for (Course c : Clist) {
			System.out.println("" + c.getcId() + "\t\t" + c.getcName());

		}

	}

	@Override
	public void addFaculty() {
		if(Clist.isEmpty()) {
			System.out.println("Please add Course first");
			
		}else {
		int n = validFacultyNo();

		for (int i = 0; i < n; i++) {
			Faculty faculty = new Faculty();
			faculty.setfId(validFacultyId());

			faculty.setfName(validFacultyName());

			System.out.println("Enter Course Id ");
			displayCourse();

			int choice = sc.nextInt();
			int j = 0;
			for (Course course : Clist) {
				if (course.getcId() == choice) {
					faculty.setCourse(Clist.get(j));
				}
				j++;
			}
			Flist.add(faculty);
		}
		}
	}

	public int validFacultyNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many faculty you want to add");
		int no = 0;
		try {
			no = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Please give input in Integer only...");
			return validFacultyNo();
		}
		return no;
	}

	public int validFacultyId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Faculty id which you want to add ");
		int id = 0;
		try {
			id = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Faculty Id must be in Integer ");
			return validFacultyId();
		}
		return id;
	}

	public String validFacultyName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Faculty Name To Set ");
		String name = sc.nextLine();
		if (name.length() > 25) {
			System.out.println("Character in name allowed to 25 only");
			return validFacultyName();
		}
		return name;
	}

	@Override
	public void displayFaculty() {
		System.out.println("All the faculties we have are as follow: ");
		System.out.println("--------------------------------------------------");
		System.out.println("Faculty Id\tFaculty Name\tCourse Id\tCourse Name");
		System.out.println("------------------------------------------------------------");
		for (Faculty f : Flist) {
			System.out.println("" + f.getfId() + "\t\t" + f.getfName() + "\t\t" + f.getCourse().getcId() + "\t\t"
					+ f.getCourse().getcName());
		}

	}

	@Override
	public void addBatch() {
		int n = validBatchNo();
		int i = 0;
		for (i = 0; i < n; i++) {
			Batch batch = new Batch();
			// System.out.println("Please enter the Batch Id to set: ");
			batch.setbId(validBatchId());
			// System.out.println("Please enter Batch Name to set: ");
			batch.setbName(validBatchName());

			System.out.println("Enter Faculty Id: ");
			displayFaculty();
			int choice = sc.nextInt();
			int j = 0;
			for (Faculty f : Flist) {
				if (f.getfId() == choice) {
					batch.setFaculty(f);
				}
				j++;
			}
			Blist.add(batch);

		}

	}

	public int validBatchNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter how many batch you want to add: ");
		int n = 0;
		try {
			n = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Provide input in Numbers only");
			return validBatchNo();
		}
		return n;
	}

	public int validBatchId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Batch Id to set");
		int id = 0;
		try {
			id = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Batch id must be in Integer Values");
			return validBatchId();
		}
		return id;
	}

	public String validBatchName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Batch Name: ");
		String b = sc.nextLine();
		if (b.length() >= 20) {
			System.out.println("Batch Name character are upto 20 Only..");
			return validBatchName();
		}
		return b;
	}

	@Override
	public void displayBatch() {
		System.out.println("We have available following Batch: ");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Batch Id\tBatch Name\tFaculty ID\tFaculty Name\tCourse Id\tCourse Name");
		System.out.println("--------------------------------------------------------------------------------------");
		for (Batch b : Blist) {
			System.out.println("" + b.getbId() + "\t\t" + b.getbName() + "\t\t" + b.getFaculty().getfId() + "\t\t"
					+ b.getFaculty().getfName() + "\t\t\t" + b.getFaculty().getCourse().getcId() + "\t\t\t"
					+ b.getFaculty().getCourse().getcName());
		}

	}

	@Override
	public void addStudent() {
		int n = validStudentNo();
		for (int i = 0; i < n; i++) {
			Student student = new Student();
			// System.out.println("Add student Id to set: ");
			student.setsId(validStudentId());
			// System.out.println("Enter Student Name to set: ");
			student.setsName(validStudentName());
			System.out.println("Enter Batch Id: ");
			displayBatch();
			int choice = sc.nextInt();
			int j = 0;
			for (Batch b : Blist) {
				if (b.getbId() == choice) {
					student.setBatch(b);
				}
				j++;
			}
			Slist.add(student);
		}
	}

	public int validStudentNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Number of student want to add:");
		int n = 0;
		try {
			n = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Input allowed in integer only...");
			return validStudentNo();
		}
		return n;
	}

	public int validStudentId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter student id to set");
		int id = 0;
		try {
			id = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Student Id must be in Integer");
			return validStudentId();
		}
		return id;
	}

	public String validStudentName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter student name to set:");
		String s = sc.nextLine();
		if (s.length() >= 20) {
			System.out.println("Student name character must within 20");
			return validStudentName();
		}
		return s;

	}

	@Override
	public void displayStudent() {
		System.out.println("Student Details is as follows: ");
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"Student id\tStudent Name\tBatch Id\tBatch Name\tFaculty Id\tFaculty Name\tCouse Id\tCourse Name");
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------");
		for (Student s : Slist) {
			System.out.println("" + s.getsId() + "\t\t" + s.getsName() + "\t\t" + s.getBatch().getbId() + "\t\t\t"
					+ s.getBatch().getbName() + "\t\t\t" + s.getBatch().getFaculty().getfId() + "\t\t"
					+ s.getBatch().getFaculty().getfName() + "\t\t" + s.getBatch().getFaculty().getCourse().getcId()
					+ "\t\t" + s.getBatch().getFaculty().getCourse().getcName());
		}

	}

}
