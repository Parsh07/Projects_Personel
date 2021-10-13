package com.Udemy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_Program {
	public static void main(String[] args) {
		Map<String, String> languages = new HashMap<>();
		
		languages.put("A", "Alphabet start");
		languages.put("Z", "Alphabet end");
		
//		int[] alpha = {1,2,3,5,9,8,5};
//		System.out.println("=============================");
//		for(int numbers : alpha) {
//			System.out.println("array value is - "+numbers);
//		}
		System.out.println(languages);
		System.out.println(languages.keySet());
		for(String key : languages.keySet()) {
			System.out.println(key+" : "+languages.get(key));
			System.out.println("***************");
		}
		
//		List<Integer> data = new ArrayList<>();
//		data.add(89);
//		data.add(78);
//		data.add(45);
//		data.add(59);
//		data.add(07);
//		data.add(753);
//		
//		for (int a : data) {
//			System.out.println("values is arraylist is - "+a);
//		}
	}
}
