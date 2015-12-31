package com.baseev.coding.interview.tree;

public class SearchOnRotated
{

    public static int getPivot(int arr[], int low, int high) {
        int mid = (low + (high-low))/2;
        return mid;
    }
    
    public static int pivotedBinarySearch(int arr[], int n, int key) {
        int pivot = SearchOnRotated.getPivot(arr, 0, n-1);
        if(arr[pivot] == key)
            return pivot;
        if(arr[0] <= key) {
            return binarySearch(arr, 0, pivot-1, key);
        }
        return binarySearch(arr, pivot+1, n-1, key);
    }
    
    public static int binarySearch(int arr[], int low, int high, int key) {
        if (high < low)
            return -1;
        int mid = (low + high)/2;  /*low + (high - low)/2;*/
        if (key == arr[mid])
            return mid;
        if (key < arr[mid])
            return binarySearch(arr, low, (mid -1), key);
        return binarySearch(arr, (mid + 1), high, key);
    }
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int arr1[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 20;
        System.out.println(pivotedBinarySearch(arr1, arr1.length, key));

    }

}
