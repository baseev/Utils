package com.baseev.coding.interview.dynamic.programming;

public class CuttingRode {

	public static int cut1(int price[], int n) {
		if(n<=0) {
			return 0;
		}
		int maxValue = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			maxValue = Math.max(maxValue, price[i]+cut1(price, n-i+1));
		}
		return maxValue;
	}
	
	public static int cut2(int price[], int n) {
		int val[] = new int[n+1];
		for(int i=0; i<n; i++) {
			int maxValue = Integer.MIN_VALUE;
			for(int j=0; j<n; j++) {
				maxValue = Math.max(maxValue, price[j]+val[i-j-1]);
			}
		}
		return val[n];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
