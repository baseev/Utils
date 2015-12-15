package com.baseev.coding.interview.util;

public class RemoveDuplicateChars
{

    public static void removeDuplicateChars(String s) {
        char[] chars = s.toCharArray();
        boolean[] hits = new boolean[256];
        for (int i = 0; i < 256; ++i) {
            hits[i] = false;
        }
        char[] newChars = new char[chars.length];
        int j=0;
                
        for(char c : chars ) {
            if(!hits[c]) {
                newChars[j++] = c; 
                hits[c] = true;
            }
        }
        System.out.println(new String(newChars));
    }

    

    /**
     * @param args
     */
    public static void main(String[] args)
    {        
        RemoveDuplicateChars.removeDuplicateChars("baseev kumar");
    }

}
