package com.Udemy;

import java.util.List;

public interface ItemClass{
	void rest();
	default void rest1() {
		System.out.println("1st rest");
	}
	private void rest2() {
		System.out.println("2nd rest");
	}
}
