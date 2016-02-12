package com.baseev.coding.lang;

public class MethodInnerClass {

	private int x = 10;
	
	public void print() {
		int a = 20;
		class MethodInner {
			public void print() {
				System.out.println(this);
				System.out.println(MethodInnerClass.this);
				System.out.println(x);
			}
		}	
		
		MethodInner in = new MethodInner();
		in.print();
	}
	
	public static void main(String[] args) {
		MethodInnerClass in = new MethodInnerClass();
		in.print();
	}
}
