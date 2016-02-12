package com.baseev.coding.interview.math;

/**
 * 
 * Question: There are 2 sorted arrays A and B of size n each. Write an
 * algorithm to find the median of the array obtained after merging the above 2
 * arrays(i.e. array of length 2n). The complexity should be O(log(n))
 * 
 */

public class Median {
	
	public static int getMedian1(int arr1[], int arr2[], int n) {
		int m1=-1, m2=-1, i=0, j=0;
		for(int counter=0; counter < n; counter++) {
			if(i==counter) {
				m1 = m2;
				m2 = arr2[0];
				break;
			}
			 
			if(i==counter) {
				m1 = m2;
				m2 = arr1[0];
				break;
			}
			
			if(arr1[i] < arr2[j]) {
				m1 = m2;
				m2 = arr1[i];
				i++;
			} else {
				m1 = m2;
				m2 = arr2[j];
				j++;
			}
		}
		return (m1+m2)/2;
	}
	
	
	
	
	
	
	public static void main(String[] args) {

	}
}
