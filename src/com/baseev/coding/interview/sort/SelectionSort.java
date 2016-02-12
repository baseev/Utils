package com.baseev.coding.interview.sort;

import java.util.Arrays;

public class SelectionSort
{
    private int[] numbers;
    
    public SelectionSort(int[] array) {
        numbers = array;
        doSort();
    }
    
    private void doSort() {
        int n = numbers.length-1;
        for(int i=0; i<=n; i++) {
            for(int j=i;j<=n;j++) {
                if(numbers[j] < numbers[i]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp ;
                }
            }
            System.out.println(Arrays.toString(numbers));
        }
        System.out.println(Arrays.toString(numbers));
    }
    
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int[] array = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43 };
        System.out.println(Arrays.toString(array));
        System.out.println("==================================================================");
        SelectionSort s = new SelectionSort(array);

    }

}
