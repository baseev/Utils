package com.baseev.coding.interview.math;

public class SmallestElements {
	
	public static void printSmallest(int arr[]) {
		int first=Integer.MAX_VALUE, second=Integer.MAX_VALUE;		
		for(int i=0; i<arr.length; i++){
			if(arr[i] < first) {
				second = first;
				first = arr[i];
			} else if(arr[i] < second && arr[i] != first) {
				second = arr[i];
			}
		}		
		System.out.println("First and second elements are "+first+" and "+second);
	}
	
	public static void main(String[] args) {
		int arr[] = {10, 2, 20, 5, 6, 8, 9, 12, 6};
		SmallestElements.printSmallest(arr);
	}
}
