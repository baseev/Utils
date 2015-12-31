package com.baseev.coding.g4g;
/**
 * 
 * @author baseev

Here is a solution that prints numbers using recursion.
Other alternatives for loop statements are recursion and goto statement, but use of goto is not 
suggestible as a general programming practice as goto statement changes the normal program execution 
sequence and makes it difficult to understand and maintain. 

 */

public class PrintNumbers
{

    public static void print(int n) {
        if(n>0) {
            print(n-1);
            System.out.println(n);
        }
        return;
    }
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        PrintNumbers.print(100);
    }

}
