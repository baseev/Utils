package com.baseev.coding.g4g;

import java.util.Arrays;

public class SwapArrayRotation
{

    private static void leftRotation(int arr[], int d, int n) {
        if(d==0 || d==n) {
            return;
        }
        
        if(n-d == d) {
            swap(arr, 0, n-d, d);
            return;
        }
        
        if(d<n-d) {
            swap(arr, 0, n-d, d);
            leftRotation(arr, d, n-d);
        } else {
            swap(arr, 0, d, n-d);
            //leftRotation(arr, d, n)
        }
    }
    
    
    public static void swap(int arr[], int fi, int si, int d) {
        int temp;
        for(int i=0; i<d; i++) {
            temp = arr[fi+i];
            arr[fi+i] = arr[si+i];
            arr[si+i] = temp;
        }
    }
    
    
    
    /**
     * 
     * 
     * One more rotation algorithm
     * 
     * 
     */
    
    public static void rotate(int arr[], int d, int n)
    {
        rvereseArray(arr, 0, d-1);
        rvereseArray(arr, d, n-1);
        rvereseArray(arr, 0, n-1);
    }
    
    public static void rvereseArray(int arr[], int start, int end)
    {
        int temp;
        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7};
        int d = 2;
        System.out.println(Arrays.toString(arr));
        SwapArrayRotation.rotate(arr, d, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    
}
