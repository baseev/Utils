package com.baseev.coding.g4g;

public class MultiplyBy7
{

    public static int getNumber(int n) {
        return ((n<<3)-n);
    }
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int n = MultiplyBy7.getNumber(9);
        System.out.println(n);
    }

}
