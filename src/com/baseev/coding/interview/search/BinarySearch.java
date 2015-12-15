package com.baseev.coding.interview.search;

public class BinarySearch
{
    public static boolean doBinarySearch(int[] array, int element) {
        int low =0;
        int high = array.length-1;
        
        while(low<=high) {
            int middle = (low+high)/2;
            if(element>array[middle]) {
                low = middle + 1;
            } else if(element<array[middle]) {
                high = middle - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(BinarySearch.doBinarySearch(array, 14)); 
    }

}
