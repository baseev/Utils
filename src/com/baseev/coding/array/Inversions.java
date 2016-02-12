package com.baseev.coding.array;

public class Inversions {

	public static int getInversions(int arr[], int n) {
		int inersions = 0;
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] > arr[j]) {
					inersions++;
				}
			}
		}
		return inersions;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {1, 20, 6, 4, 5};
		System.out.println(Inversions.getInversions(arr, arr.length));
	}

}
