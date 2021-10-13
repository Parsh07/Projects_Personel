package com.Udemy;

public class Accessiblity {
	private static int test=0;
	private String rest;

	public Accessiblity(String name) {
		rest=name;
		test++;
	}
	
	public String getString() {
		return rest;
	}
	
	public static int getNumber() {
		return test;
	}
}
