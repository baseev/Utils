package com.baseev.coding.number;

public class FibanocciNormal {

	public static int getFibanocci(int n) {
		if(n <=1) {
			return n;
		}
		
		return getFibanocci(n-1) + getFibanocci(n-2);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
