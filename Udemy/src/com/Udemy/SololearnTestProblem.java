package com.Udemy;

abstract class Test {
	int result1=10;
	private void limaka() {
		System.out.println("limaka");
	}
	
	abstract void rek();
}	
	public abstract class SololearnTestProblem extends Test{
		
		@Override
		void rek() {
			// TODO Auto-generated method stub
			
		}
		abstract void check();
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int result=0;
			for(int i=0; i<=5; i++) {
				if(i==3) {
					System.out.println("if block - "+(result+10));
					result =+ 10;
				}
				else {
					System.out.println("else block - "+(result+i));
					result =+ i;
				}
				System.out.println("Result inside for loop - "+result);
			}
			System.out.println(result);
			
//			Test t = new Test();
		}
	}
