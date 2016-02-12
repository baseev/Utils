package com.baseev.coding.interview.string;

import java.util.Arrays;

public class ReverseStrings {

	public static String reverse1(char arr[], int start, int end){
		char temp;
		while(start<end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return Arrays.toString(arr);
	}
	
	public static String reverse2(char arr[], int start, int end){
		if(start>=end) return "";
		char temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		reverse2(arr, start+1, end-1);
		return Arrays.toString(arr);
	}
	
	public static void main(String[] args) {
		String str = "Baseev Kumar";
		int start= 0;
		int end = str.length()-1;
		char arr[] = str.toCharArray();
		
		System.out.println(ReverseStrings.reverse1(arr, start, end));
		//System.out.println(ReverseStrings.reverse2(arr, start, end));
	}

}
