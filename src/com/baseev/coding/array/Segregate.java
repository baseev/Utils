package com.baseev.coding.array;

import java.util.Arrays;

public class Segregate {

	public static int[] getSegregated(int arr[]) {
		int left =0, right=arr.length-1;
		while(left<right) {
			while(arr[left] == 0 && left < right) {
				left ++;
			}
			
			while(arr[right] == 0 && left < right) {
				right --;
			}
			
			if(left < right) {
				arr[left]  = 0;
				arr[right] = 1;
				left++;
				right--;
			}
		}		
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,1,0,0,0,0,1,0,0,1,1,1,1,0,0};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(Segregate.getSegregated(arr)));
	}

}
