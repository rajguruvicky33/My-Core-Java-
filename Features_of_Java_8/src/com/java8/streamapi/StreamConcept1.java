package com.java8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*A stream is a sequence of objects that supports various methods which 
 * can be pipelined to produce the desired result.
 * 
 * A stream is not a data structure instead it takes input from the 
 * Collections, Arrays or I/O channels.
 * 
 */

public class StreamConcept1 {
	public static void main(String[] args) {
		
		Stream<Integer> stream= Stream.of(14,15,16,17,18,19,20);
		stream.forEach( n   -> System.out.println(n));
		
		System.out.println("-------fo String array------");
		
		Stream<String> stream1= Stream.of(new String [] {"A","B","C","D","E"});
		stream1.forEach(n   ->  System.out.println(n));
		
		System.out.println("--------for ArrayList---------");
		
		List<Integer> l1 = new ArrayList<Integer>();
		 for (int i=1;i<=10;i++) {
			 l1.add(i);
			 
		 }
		Stream<Integer> st=l1.stream();
		st.forEach(n   ->   System.out.println(n));
		
		System.out.println("----Map------------");
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(11, "Sachin");
		map.put(12, "Rohit");
		map.put(13, "Rakesh");
		map.put(15, "Hardik");
		
		Stream<Entry<Integer, String>> m1 = map.entrySet().stream();
//		Arrays.toString(m1.toArray());
		System.out.println(Arrays.toString(m1.toArray()));
		
		System.out.println("--Filter even Numbers from above list---");
		List<Integer> l2 =l1.stream().filter(n  ->  n%2==0).collect(Collectors.toList());
		l2.forEach(x  ->  System.out.println(x));
		
		System.out.println("--square of above even Numbers----");
		List<Integer> l3=l1.stream().filter(n  -> n%2==0).map(x -> x*x).collect(Collectors.toList());
		System.out.println(l3);
		
		System.out.println("--Remove Duplicate Integer from list----");
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(15);
		list.add(9);
		list.add(15);
		list.add(10);
		list.add(11);
		
		List<Integer> l5=list.stream().distinct().collect(Collectors.toList());
		System.out.println(l5);
		l5.forEach(n -> System.out.println(n));
		
		System.out.println("--------Remove duplicate and sort ascending order--------");
		List<Integer> l6=list.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(l6);
	}

}
