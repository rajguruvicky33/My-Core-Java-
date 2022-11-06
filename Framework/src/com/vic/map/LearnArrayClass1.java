package com.vic.map;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LearnArrayClass1 {
	public static void main(String[] args) {
		int [] numbers= {2,4,6,8,10,12,14};
		
		int index=Arrays.binarySearch(numbers, 6);
		
		System.out.println("The Index of key 6 in the Array:"+index );
		
				
		}
	}


