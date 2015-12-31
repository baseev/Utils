package com.baseev.coding.g4g;

/**
 * 
 * @author baseev

Return maximum occurring character in the input string

Write an efficient C function to return maximum occurring character in the input string e.g., 
if input string is “test string” then function should return ‘t’.

 */

public class MaxOccurringCharacter
{
    private static int ASCII_COUNT = 256;
    
    public static char doCount(String str) {
        char charArray[] = str.toCharArray();
        int asciiArray[] = new int[ASCII_COUNT];
        int count =-1;
        char c = '\0';
        for(int i=0; i<ASCII_COUNT;i++) {
            asciiArray[i] = 0;
        }
        
        for(int i=0; i<charArray.length;i++) {
            if(count < asciiArray[charArray[i]]) {
                count = asciiArray[charArray[i]];
                c = charArray[i];
            }
            asciiArray[charArray[i]] = asciiArray[charArray[i]] + 1;
        }
        return c;
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        String str = "sapna";
        char c = MaxOccurringCharacter.doCount(str);
        System.out.println(c);
    }

}
