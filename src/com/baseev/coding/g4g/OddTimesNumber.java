package com.baseev.coding.g4g;

public class OddTimesNumber
{

    public static int getOddOccurence(int arr[]) {
        int res = 0;
        for(int i=0; i<arr.length; i++) {
            res = res^arr[i];
            System.out.println(res);
        }
        return res;
    }
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int arr[] = {2, 3, 5, 4, 5, 2, 4, 3, 2, 4, 4, 1, 2};
        int n = OddTimesNumber.getOddOccurence(arr);
        System.out.println(n);
    }

}
