package com.Udemy;

public interface ISaveable {
	public int test=0;
	
	public void test();
	abstract void test1();
	private static void test2() {
		System.out.println("test2");
	}
	default void ret() {
		
	}
}
