package com.baseev.coding.interview.sort;

import java.util.Arrays;

public class QuickSort
{
    int[] numbers;

    public QuickSort(int[] values)
    {        
        if (values.length == 0) {
            return;
        }
        numbers = values;
        System.out.println("Original array : "+Arrays.toString(numbers));
        System.out.println("=============================================================================");
        sort(0, values.length - 1);
    }

    public void sort(int low, int high)
    {
        int i = low, j = high;
        int pivot = numbers[low + ((high - low) / 2)];
        System.out.println("low = "+low+", high = "+high+", pivot = "+pivot);
        while (i <= j) {
            while (numbers[i] < pivot) {
                i++;
                System.out.println("i++ ="+i);
            }
            while (numbers[j] > pivot) {
                j--;
                System.out.println("j-- ="+j);
            }
            System.out.println("i = "+i+", j = "+j+", Array = "+Arrays.toString(numbers));
            if (i <= j) {
                exchange(i, j);                
                i++;
                j--;
                System.out.println("After exchange i = "+i+", j = "+j+", Array = "+Arrays.toString(numbers));
            }
            System.out.println("i = "+i+", j = "+j+", Array = "+Arrays.toString(numbers));
            System.out.println("#############################################################################");
        }

        if (low < j) {
            System.out.println("low < j , sort("+low+","+ j+");");
            sort(low, j);
        }
        if (high < i) {
            System.out.println("i < high , sort("+i+","+ high+");");
            sort(i, high);
        }
    }

    private void exchange(int i, int j)
    {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int numbers[] = {34, 53, 20, 18, 67, 3, 4, 5, 6, 7, 9, 10 };
        //int numbers[] = {30, 40, 3, 8, 6, 9};
        QuickSort qSort = new QuickSort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+", ");
        }
    }

}
