package com.exp.ifelsestatement;

import java.util.Scanner;

public class NestedIfElseConcept {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the colour:");
		String colour = "Green";

		if (colour == "red") {
			System.out.println("Danger,Please stop");
		} else if (colour == "Yellow") {
			System.out.println("Warning,Please slow your vehicle");
		} else if (colour == "Green") {
			System.out.println("You are good to go");
		} else {
			System.out.println("Please enter valid input");
		}

	}
}
