package com.baseev.coding.interview.util;

public class ReverseString
{

    public static void reverse( String str) {
        char[] s = str.toCharArray();
        int start = 0, end = 0, length;
        length = s.length;
        /* Reverse entire string */
        reverseString(s, start, length - 1);
        System.out.println( String.copyValueOf(s));
        
        while(end < length ){
            if( s[end] != ' ' ){ 
                start = end;
                while( end < length && s[end] != ' ' ) {
                    end++;
                }
                end--;
                reverseString(s, start, end );
                System.out.println(String.copyValueOf(s));
            }
            end++;
        }
        System.out.println( String.copyValueOf(s));
    }
    
    public static void reverseString( char str[], int start, int end ){
        char temp;
        while( end > start ){
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++; 
            end--;
        }
    }


    /**
     * @param args
     */
    public static void main(String[] args)
    {
        ReverseString.reverse("Iam baseev kumar from kerala");

    }

}
