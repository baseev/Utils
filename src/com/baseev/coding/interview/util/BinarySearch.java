package com.baseev.coding.interview.util;

public class BinarySearch
{

    int binarySearch(int arr[], int l, int r, int x)
    {
       if (r >= l)
       {
            int mid = l + (r - l)/2;
     
            // If the element is present at the middle itself
            if (arr[mid] == x)  return mid;
     
            // If element is smaller than mid, then it can only be present
            // in left subarray
            if (arr[mid] > x) return binarySearch(arr, l, mid-1, x);
     
            // Else the element can only be present in right subarray
            return binarySearch(arr, mid+1, r, x);
       }
     
       // We reach here when element is not present in array
       return -1;
    }
     
    public static void main(String args[]) {
        
        BinarySearch b = new BinarySearch();
        int a[] = {1,2,4,5,7,9};
        int e = b.binarySearch(a, 0, a.length-1, 3);
        System.out.println("Element is : "+e);
    }
    
}
