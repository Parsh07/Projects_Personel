package com.Udemy;

public class OuterClass {
	protected int OVa;
	int OVb;
	Innerclass innerclass = new Innerclass();
	
	protected void outerData() {
		System.out.println("Outer method");
		innerclass.innerData1();
	}
	
	public void Outerdata1() {
		System.out.println("outer method1");
		innerclass.innerData();
	}
	
	
	public class Innerclass{
		private int IVa;
		int IVb;
		
		
		protected void innerData() {
			System.out.println("Inner method");
			outerData();
		}
		
		public void innerData1() {
			System.out.println("Inner method1");
		}
		
	}
}
