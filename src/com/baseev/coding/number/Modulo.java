package com.baseev.coding.number;

public class Modulo {

	public static int getModulo(int n, int d) {
		return n & (d-1);
	}
	
	public static void main(String[] args) {
		int n = 6;
		int d = 4;
		System.out.println(Modulo.getModulo(n, d));
	}
}
