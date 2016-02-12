package com.baseev.coding.array;

public class CheckMajority {

	public static boolean isMajority(int arr[], int element) {
		int n = arr.length;
		int lastIndex = n%2 == 0 ? n/2 : n/2+1;
		System.out.println(lastIndex);
		for(int i=0; i<lastIndex; i++) {
			System.out.println(i+" bb:: "+(i+n/2));
			if(arr[i] == element && arr[i+n/2] == element) {
				System.out.println(i+n/2+" :: "+arr[i+n/2]);
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr = {4, 3, 6, 2, 4, 4, 2, 2, 2, 2};
		int element = 4;
		System.out.println(CheckMajority.isMajority(arr, element));
	}

}
