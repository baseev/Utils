package com.baseev.coding.interview.util;


public class RandomNumbers
{
    
    public static int getRandom(int min, int max) {
        Double r = Math.random();
        System.out.println("Random value : "+r);
        return (int) (min + (max-min) * r);
    }
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int min=5, max=10;        
        int c = RandomNumbers.getRandom(min, max);        
        System.out.println(c);
    }

}
