package com.Udemy;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Excersize {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("************Program started*********");
//		int i = scan.nextInt();
//		double d = scan.nextDouble();
//		scan.nextLine();
//		String str = scan.nextLine();
//		scan.close();
//		System.out.println("String: "+str);
//		System.out.println("Double: "+d);
//		System.out.println("Integer: "+i);
		
		ArrayList<String> data = new ArrayList<>();
		data.add("a");
		data.add("b");
		data.add("c");
		data.add("d");
		data.add("e");
		
		ListIterator<String> listIterator = data.listIterator();
		
		System.out.println("==============================");
		System.out.println(listIterator.next());
		System.out.println("==============================");
		System.out.println(listIterator.next());
		System.out.println("==============================");
		System.out.println(listIterator.previous());
		System.out.println("==============================");
		System.out.println(listIterator.previous());
		System.out.println("==============================");
	}

}
