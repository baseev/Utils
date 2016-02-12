package com.baseev.coding.lang;

public class InnerClass {

	private int x = 10;
	
	class Myinner {
		
		public void print() {
			System.out.println(this);
			System.out.println(InnerClass.this);
			System.out.println(x);
		}
	}
	
	
	public static void main(String[] args) {
		InnerClass.Myinner inner = new InnerClass().new Myinner();
		inner.print();
	}

}
