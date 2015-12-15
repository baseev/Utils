package com.baseev.coding.interview.sort;

import java.util.Arrays;

public class ShellSort
{
    private int[] numbers;
    
    public ShellSort(int[] array) {
        numbers = array;
        doSort();
    }
    
    private void doSort() {
        int n = numbers.length;
        for(int gap=(n/2); gap>0; gap/=2) {
            for(int i=gap; i<n; i++) {
                int temp = numbers[i];
                int j;
                for(j=i; j>=gap && numbers[i-gap] > temp; j-=gap) {
                    //System.out.println("gap="+gap+", i="+i+", j="+j);
                    numbers[j]=numbers[j-gap];
                }
                numbers[j] = temp;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int[] array = {8, 2, 4, 9, 3, 6 };
        ShellSort s = new ShellSort(array);
    }

}
