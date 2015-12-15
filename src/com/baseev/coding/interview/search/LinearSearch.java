package com.baseev.coding.interview.search;

public class LinearSearch
{
    
    public static boolean doLenearSearch(int[] array, int element) {
        for(int ele : array) {
            if(ele == element) {
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
        int[] array = {30,4,2,45,36,8,7};
        System.out.println(LinearSearch.doLenearSearch(array, 10));        
    }

}
