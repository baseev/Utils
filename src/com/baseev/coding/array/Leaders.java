package com.baseev.coding.array;

public class Leaders {

	public static void printLeaders(int arr[]) {
		int size = arr.length -1;
		int max = arr[size];
		System.out.println(max);
		for(int i=size-1; i>=0; i--) {
			if(max < arr[i]) {
				max = arr[i];
				System.out.println(max);
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {16, 17, 4, 3, 5, 2};
		Leaders.printLeaders(arr);
	}

}
