package com.exp.serviceimplements;

import java.util.Scanner;

import com.exp.modal.User;
import com.exp.service.UserMethods;

public class UserServiceImplements implements UserMethods {
	Scanner sc=new Scanner(System.in);
	public static final int User_max=5;
	User [] userArray=new User[User_max];
	@Override
	public void addUserDetails() {
		System.out.println("Please enter how many user you want to add");
		int choice=sc.nextInt();
		for(int i=0;i<choice;i++) {

			User u=new User();
			System.out.println("Please Enter User ID ");
			u.setUid(sc.nextInt());

			System.out.println("Please Enter User Name ");
			u.setUname(sc.next());

			System.out.println("Please Enter User Mobile Number ");
			u.setUmobileNumber(sc.nextLong());

			System.out.println("Please Enter User Address ");
			u.setuAdd(sc.next());

			userArray[i]=u;
			System.out.println("User Register Successfully......");
			System.out.println();
		}

	}

	@Override
	public void deleteUserusingIndex() {
		System.out.println("Please enter user Index to delete");
		int index=sc.nextInt();
		userArray[index]=null;
		System.out.println("User deleted Successfully....");
	}

	@Override
	public void deleteUserusingId() {
		System.out.println("Please Enter User Id to delete User ");
		int choice=sc.nextInt();
		int index=0;
		for (User user : userArray) {
			if(user !=null) {
				if(choice == user.getUid()) {
					break;
				}
			}
			index++;
		}
		userArray[index]=null;
	}

	@Override
	public User[] getUserDetails() {
		for (User user : userArray) {
			if(user !=null) {
			System.out.println(""+user.getUid()+" "+user.getUname()+" "+
					user.getuAdd()+" "+user.getUmobileNumber());
			}
		}
		return userArray;
	}

}
