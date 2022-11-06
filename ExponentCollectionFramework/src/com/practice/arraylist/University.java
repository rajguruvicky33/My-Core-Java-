package com.practice.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class University {
	public List<List<String>> addUniversity() {
		
		List<String> PuneUniversity =new ArrayList<String>();
		PuneUniversity.add("Law");
		PuneUniversity.add("Psychology");
		PuneUniversity.add("Literature");
		
		List<String> MumbaiUniversity =new ArrayList<String>();
		MumbaiUniversity.add("Architecht");
		MumbaiUniversity.add("Automobile");
		MumbaiUniversity.add("Civil");
		
		List<String> ShivajiUniversity =new ArrayList<String>();
		ShivajiUniversity.add("Science");
		ShivajiUniversity.add("Commerce");
		ShivajiUniversity.add("Arts");
		
		List<List<String>> university=new ArrayList<List<String>>();
		university.add(ShivajiUniversity);
		university.add(PuneUniversity);
		university.add(MumbaiUniversity);
		
		return university;
	}
	public static void main(String[] args) {
		University university=new University();
		
		List<List<String>> uni1=university.addUniversity();
		System.out.println(uni1);
		
		System.out.println("\n--Iterate using Iterator interface--");
		
		Iterator<List<String>> uni2=uni1.iterator();
		while(uni2.hasNext())
		{
			List<String>uni3=uni2.next();
			
			Iterator<String> uni4=uni3.iterator();
			
			while (uni4.hasNext())
			{
				String uni5=uni4.next();
				System.out.println(uni5);
			}
		}
		
		System.out.println("\n--iterate using for each loop--");
		for(List<String> uni6:uni1) {
			
			for(String result:uni6) {
				System.out.println(result);
			}
		}
	}

}
