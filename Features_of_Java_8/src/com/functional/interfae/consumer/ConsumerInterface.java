package com.functional.interfae.consumer;

import java.util.function.Consumer;

public class ConsumerInterface {
	public static  void getMessage(String name) {
		System.out.println("Hello"+name);
	}
	public static void getValue(int value) {
		System.out.println(value);
	}
	public static void main(String[] args) {
		
		Consumer<String> consumer1= ConsumerInterface::getMessage ;
		consumer1.accept(" Java");
		
		Consumer<Integer> consumer2 = ConsumerInterface :: getValue;
		consumer2.accept(51);
		
	}

}
