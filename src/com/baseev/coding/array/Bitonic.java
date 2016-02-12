package com.baseev.coding.array;

import java.util.Arrays;

public class Bitonic {

	public static int getMaxBitonicSequence(int arr[]) {
		int max = 0, n=arr.length;
		int inc[] = new int[n];
		int dec[] = new int[n];
		for(int i=1; i<n; i++) {
			inc[i] = arr[i]>arr[i-1] ?  inc[i-1] + 1 : 1;
			System.out.println(inc);
		}
		
		for(int i=n-2; i>=0; i--) {
			dec[i] = arr[i]>arr[i+1] ?  inc[i+1] + 1 : 1;
		}
		
		System.out.println(Arrays.toString(inc));
		System.out.println(Arrays.toString(dec));
		
		
		max = inc[0] + dec[0] -1;		
		for(int i=0; i<n; i++) {
			if((inc[i] + dec[i] - 1) > max) {
				max = inc[i] + dec[i] - 1;
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		int arr[] = {12, 4, 78, 90, 45, 23};
		System.out.println(Bitonic.getMaxBitonicSequence(arr));
	}

}
