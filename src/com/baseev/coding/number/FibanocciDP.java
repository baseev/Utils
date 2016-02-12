package com.baseev.coding.number;

public class FibanocciDP {
	
	public static int getFibanocci(int n) {
		int f[] = new int[n+1];
		f[0] = 0;
		f[1] = 1;
		
		for(int i=2; i<=n; i++) {
			f[i] = f[n-1] + f[n-2];
		}
		return f[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
