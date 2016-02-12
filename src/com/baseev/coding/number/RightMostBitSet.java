package com.baseev.coding.number;

public class RightMostBitSet {

	public static int getNumber(int n) {
		return n*(n-1);
	}
	
	public static void main(String[] args) {
		int n = RightMostBitSet.getNumber(7);
		System.out.println(n);
	}
}