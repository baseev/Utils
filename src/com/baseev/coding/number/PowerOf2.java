package com.baseev.coding.number;

public class PowerOf2 {

	public static boolean getNumber(int n) {
		return ((n&(n-1)) == 0);
	}
	
	public static void main(String[] args) {
		System.out.println(PowerOf2.getNumber(16));
	}
}