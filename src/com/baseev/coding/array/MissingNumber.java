package com.baseev.coding.array;

public class MissingNumber {

	public static void printElements(int arr[]) {
		int size = arr.length; 
		System.out.println("Repeating number is : ");
		for(int i=0; i<size; i++) {
			if(Math.abs(arr[i])-1<size && arr[Math.abs(arr[i])-1] > 0) {
				arr[Math.abs(arr[i])-1] = - arr[Math.abs(arr[i])-1];
			} else {
				System.out.println(Math.abs(arr[i]));
			}
		}
		System.out.println("Missing number is :");
		for(int i=0; i<size; i++) {
			if(arr[i] > 0){
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {3, 4, 5, 5, 6, 2, 8};
		MissingNumber.printElements(arr);
	}

}
