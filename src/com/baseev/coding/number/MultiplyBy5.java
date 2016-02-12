package com.baseev.coding.number;

public class MultiplyBy5 {

	public static boolean isMultipliedBy5(int n) {
		while(n>0) {
			n = n-5;
		}
		
		if(n==0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
