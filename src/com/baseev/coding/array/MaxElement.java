package com.baseev.coding.array;


/**
 * 
 * @author Baseev
 * 
 * Find the maximum element in an array which is first increasing and then decreasing
 *
 */
public class MaxElement {

	public static int printMax(int arr[], int low, int high) {
		if(low==high) {
			return arr[low];
		}
		
		if((high==low+1) && arr[low] >= arr[high]) {
			return arr[low]; 
		}
		
		if((high==low+1) && arr[high] >= arr[low]) {
			return arr[high]; 
		}
		
		int mid = low+high/2;
		
		if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]) {
			return arr[mid];
		}
		
		if(arr[mid]>arr[mid+1] && arr[mid]<arr[mid-1]) {
			return printMax(arr, low, mid-1);
		} else {
			return printMax(arr, low, mid+1);
		}
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
