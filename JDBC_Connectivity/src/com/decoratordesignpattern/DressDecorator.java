package com.decoratordesignpattern;

public class DressDecorator implements Dress{

	protected Dress dress;

	@Override
	public void assemble() {
		this.dress.assemble();
		
	}
	

}
