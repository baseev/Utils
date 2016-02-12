package com.baseev.coding.interview.math;

public class BinomialCoefficient {

	public static int getCoefficient(int n, int k) {
		if(k==0||n==0) {
			return 1;
		}
		
		return getCoefficient(n-1, k-1)+getCoefficient(n-1, k)
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
