package com.training.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;


public class LinkedListExample {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
	LinkedList<String> linkedList=new LinkedList<String>();
	linkedList.add("one");
	linkedList.add("two");
	linkedList.add("three");
	linkedList.add("four");
	
	linkedList.offerFirst("oneeee");
	linkedList.offerLast("fourrrr");
	
	System.out.println(linkedList);
	Iterator<String> iter=linkedList.descendingIterator();
	while(iter.hasNext())
	{
		System.out.println(iter.next());
	}
	for(String str:linkedList)
	{
		System.out.println(str);
	}
	List<String> arrayList = new ArrayList<>();
	arrayList.add("one");
	arrayList.add("two");
	arrayList.add("three");
	arrayList.add("one");
	System.out.println(arrayList.toString());
	
	
	
	

	TreeMap<String,Integer> gh=new TreeMap<String,Integer>();
	gh.put("one",53);
	gh.put("two",56);
	gh.put("three",23);
	gh.put("one",45);
	System.out.println(gh.toString());
	
	
	
	}

	}
