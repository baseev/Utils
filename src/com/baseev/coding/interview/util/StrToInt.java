package com.baseev.coding.interview.util;

public class StrToInt
{

    public static void strToInt(String s) {
        char[] str = s.toCharArray();
        int i = 0, num = 0;
        boolean isNeg = false;
        int len = str.length;
        if( str[0] == '-' ){
            isNeg = true;
            i = 1;
        }
        while( i < len ){
            num *= 10;
            num += ( str[i++] - '0' );
        }
        if(isNeg)
            num *= -1;
        System.out.println(num);
    }

    public static void printChar() {
        System.out.println('5' - '0' );
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        StrToInt.printChar();
        
        StrToInt.strToInt("-123456");

    }

}
