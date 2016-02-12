package com.baseev.coding.interview.util;

public class Fun1 {

	
	public static int calc(int x, int y) {
		System.out.println(x+", "+y);
		if(x==0) {
			return y;
		}		
		return calc(x-1, x+y);
	}
	
	public static void main(String[] args) {
		System.out.println(Fun1.calc(5, 2));
	}

}
