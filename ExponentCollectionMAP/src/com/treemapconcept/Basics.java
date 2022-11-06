package com.treemapconcept;

import java.util.Map;
import java.util.TreeMap;

public class Basics {
/*treehashmap=used to arranged array in ascending
 * order using key;;
 */
	public static void main(String[] args) {
		Map<Integer, String> map=new TreeMap<>();
		map.put(1, "Abc");
		map.put(2, "Efg");
		map.put(6, "xyz");
		map.put(4, "ghy");
		map.put(11, "iop");
		
		System.out.println(map);
	}
}
