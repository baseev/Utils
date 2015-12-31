package com.baseev.coding.g4g;

public class LargestSumConteguousArray
{

    public static int getSum(int nums[]) {
        int maxSofar = 0;
        int maxHere = 0;
        for(int i=0; i<nums.length;i++) {            
            maxHere = Math.max(nums[i], maxHere + nums[i]);
            maxSofar = Math.max(maxHere, maxSofar);
        }
        return maxSofar;
    }
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int maxSum = LargestSumConteguousArray.getSum(a);
        System.out.println(maxSum);
    }

}
