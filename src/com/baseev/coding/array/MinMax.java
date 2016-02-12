package com.baseev.coding.array;

public class MinMax {
	
	public static void printMinMax(int arr[]) {
		int min = 0, max = 0, n=arr.length;
		if(n==1) {
			min = max = arr[0];
		}
		
		if(arr[0]<arr[1]) {
			min = arr[0];
			max = arr[1];
		} else {
			min = arr[1];
			max = arr[0];
		}
		
		for(int i=2; i<n; i++) {
			if(arr[i] < min) {
				min = arr[i];
			} 
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("max = "+max+", min = "+min);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
