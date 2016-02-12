package com.baseev.coding.interview.dynamic.programming;

public class MaxSumIncresingSubSequence {

	public static int getMaxSun(int arr[], int n) {
		int max=0;
		int msis[] = new int[n-1];
		for(int i=0; i<n; i++) {
			msis[i] = arr[i];
		}
		for(int i=1; i<n; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i]>arr[j] && msis[i]<msis[j]+msis[i]) {
					msis[i] = msis[j]+msis[i];
				}
			}
		}
		for(int i=0; i<n; i++) {
			max = Math.max(max, msis[i]);
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
