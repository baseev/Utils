package com.baseev.coding.interview.sort;

import java.util.Arrays;

public class InsertionSort
{
    private int[] numbers;
    
    public InsertionSort(int[] array) {
        numbers = array;
        doSort();
    }
    
    private void doSort() {
        int n = numbers.length -1;
        for(int i=1; i<=n; i++) {
            int key = numbers[i];
            int j = i-1;
            while(j>=0 && numbers[j] > key) {
                numbers[j+1] = numbers[j];
                j = j-1;
                //System.out.println("j="+j+", key="+key);
            }
            numbers[j+1] = key;
        }
        System.out.println(Arrays.toString(numbers));
        
    }
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int[] array = {8, 2, 4, 9, 3, 6 };
        InsertionSort s = new InsertionSort(array);
    }
}
