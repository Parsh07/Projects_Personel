package com.Udemy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		OuterClass outerClass = new OuterClass();
//		OuterClass.Innerclass innerclass = outerClass.new Innerclass();
//		outerClass.Outerdata1();
		
//		Accessiblity a = new Accessiblity("1st Instance creation");
//		System.out.println("Result is - "+Accessiblity.getNumber()+" and name is - "+a.getString());
//				
//		Accessiblity b = new Accessiblity("2nd Instance creation");
//		System.out.println("Result is - "+Accessiblity.getNumber()+" and name is - "+b.getString());
	
	
		Scanner sc = new Scanner(System.in);
		int iterations = sc.nextInt();
		while(iterations!=0){
		    int number = sc.nextInt();
		    int ln = number%10;
		    while(number>=10) {
		    	number=number/10;
		    }
		    int fn=number;
		    int sum = fn+ln;
		    System.out.println(sum);
		    iterations--;
		}
	}

}
