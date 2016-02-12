package com.baseev.coding.array;

public class FindSmallestMissingNumber {

	public static int find(int arr[], int start, int end) {
		if(start>end) {
			return end+1;
		}
		
		if (start != arr[start]) {
		      return start;			
		}
		
		int mid = (start + end) / 2;
		
		System.out.println(arr[mid]+" ::: "+mid);
		
	    if (arr[mid] > mid)
	      return find(arr, start, mid);
	    else
	      return find(arr, mid + 1, end);
	}
	
	public static void main(String[] args) {
		int arr[] = {10, 11, 12, 13, 14, 16};
		System.out.println(FindSmallestMissingNumber.find(arr, 0, arr.length-1));
	}

}
