package com.assignment3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class HashMapSortedAsList {


	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Hello");
		hs.add("World");
		hs.add("Java");
		
		List<String> list = new ArrayList<String>();
		
		
		for(String sc : hs) {
			list.add(sc);
		}
		for(String lst:list) {
			System.out.println(lst);
		}
	}
	
}
