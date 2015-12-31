package com.baseev.coding.g4g;

public class ReverseString
{

    public static void printReverse(char arr[], int pointer) {
        if(pointer >= 0) {
            System.out.print(arr[pointer]);
            printReverse(arr, pointer -1);
        }
    }
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        String a = "ramuK veesaB";
        char arr[] = a.toCharArray();
        ReverseString.printReverse(arr, arr.length-1);
        // TODO Auto-generated method stub
    }

}
