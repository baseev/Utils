package com.baseev.coding.interview.util;

public class UniqueChars
{

    public static boolean isUniqueChars(String s) {
        char[] chars = s.toCharArray();
        boolean[] char_values = new boolean[256];
        for(char c : chars ) {
            if(char_values[c]) {
                return false;
            }
            char_values[c] = true;
        }
        return true;
    }

    

    /**
     * @param args
     */
    public static void main(String[] args)
    {        
        System.out.println(UniqueChars.isUniqueChars("abddd"));
    }

}
