package com.baseev.coding.interview.util;

public class Recursion {

	public static int get(int a, int b) {
		System.out.println(a+" :::: "+b);
		if(b==0) {
			return 1;
		}
		
		if(b%2==0) {
			return get(a*a, b/2);
		}
		
		return get(a*a, b/2)*a;
	}
	
	public static void main(String[] args) {
		System.out.println(Recursion.get(4, 3));
	}
}
