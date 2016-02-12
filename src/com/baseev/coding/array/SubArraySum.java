package com.baseev.coding.array;
/**
 * 
Given an unsorted array of nonnegative integers, find a continous subarray which adds to a given number.

Examples:

Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Ouptut: Sum found between indexes 2 and 4

Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
Ouptut: Sum found between indexes 1 and 4

Input: arr[] = {1, 4}, sum = 0
Output: No subarray found
There may be more than one subarrays with sum as the given sum. The following solutions print first such subarray.
 *
 */
public class SubArraySum {

	public static void getSubArray(int arr[], int sum) {
		int n= arr.length;
		int currentSum = arr[0], start=0, i=0;
		
		for(i=1; i<n; i++){
			while(currentSum>sum&&start<i-1) {
				currentSum = currentSum - arr[i];
				start++;
			}
			if(currentSum==sum) {
				System.out.println("Sum found between inxdexes "+start+" and "+(i-1));
				return;
			}
			if(i<n) {
				currentSum = currentSum+arr[i];
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
