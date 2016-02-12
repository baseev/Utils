package com.baseev.coding.array;

import java.util.Arrays;

public class SegregateOddEven {

	public static int[] segregate(int arr[]) {
		int left = 0;
		int right = arr.length-1;
		
		while(left<right) {
		
			while(arr[left]%2==0 && left<right) {
				left++;
			}
			
			while(arr[right]%2==1 && left<right) {
				right--;
			}
			
			if(left<right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}			
		}			
		return arr;
	}
	
	
	
	public static void main(String[] args) {
		int arr[] = {12, 34, 45, 9, 8, 90, 3};
		System.out.println(Arrays.toString(arr));
		SegregateOddEven.segregate(arr);
		System.out.println(Arrays.toString(arr));
	}

}
