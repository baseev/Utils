package com.baseev.coding.array;

public class MaxDiff {

	public static int maxDiff(int arr[]) {
		int max_diff = arr[0]-arr[1];
		int minElement = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < minElement) {
				minElement = arr[i];
			}
			
			if(arr[i] - minElement > max_diff) {
				max_diff = arr[i] - minElement;
			}
		}
		System.out.println(minElement);
		return max_diff;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {100, 1, 2, 6, 80};
		System.out.println(MaxDiff.maxDiff(arr));
	}

}
