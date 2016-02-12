package com.baseev.coding.array;

public class MaxSum {

	public static int getSum(int arr[], int n) {
		int incl = arr[0];
		int excl = 0;
		int exclNew = 0;
		for(int i=0; i<n; i++) {
			exclNew = Math.max(incl, excl);
			incl = excl + arr[i];
			excl = exclNew;
		}
		return Math.max(excl, incl);
	}
	
	public static void main(String[] args) {
		int arr[] = {3, 2, 5, 10, 7};
		System.out.println(MaxSum.getSum(arr, arr.length));
	}
}
