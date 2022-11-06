package com.decoratordesignpattern;

public class BasicDress implements Dress{

	@Override
	public void assemble() {
		System.out.println("Basic Dress Features...");
	}

}
