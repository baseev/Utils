package com.baseev.coding.interview.dynamic.programming;

public class LCS {

	public static int getLCS(int x[], int y[], int m, int n) {
		if(m==0 || n==0) {
			return 0;
		}
		
		if(x[m-1]==y[n-1]) {
			return getLCS(x, y, m-1, n-1);
		}
		
		return Math.max(getLCS(x, y, m-1, n), getLCS(x, y, m, n-1));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
