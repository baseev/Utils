package com.baseev.coding.interview.sort;

public class Sort1 {

	public static void sort(int arr[], int size) {
		int low = 0;
		int mid = 0;
		int high = size-1;
		
		while(mid <= high) {
			switch (arr[mid])
	        {
	        case 0:
	            swap(arr[low++], arr[mid++]);
	            break;
	        case 1:
	            mid++;
	            break;
	        case 2:
	            swap(arr[mid], arr[high--]);
	            break;
	        }
		}		
	}
	
	private static void swap() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
