package com.baseev.coding.interview.util;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.time.DateUtils;

/**
 * 
 */

/**
 * @author baseev
 *
 */


public class Test10 {
    
    public static void main(String[] args)

    {
        /* Create Linked Lists */

        LinkedList<Integer> num1 = new LinkedList<Integer>();

        LinkedList<Integer> num2 = new LinkedList<Integer>();

        LinkedList<Integer> ans = new LinkedList<Integer>();

        LinkedList<Integer> tmp = new LinkedList<Integer>();

        /* Accept numbers */

        System.out.println("Subtracting Large Numbers Using Linked Lists Test\n");

        //String str1 = "109";

        //String str2 = "098";
        
        String str1 = "300";

        String str2 = "100";

        /* Find larger number */

        int l1 = str1.length(), l2 = str2.length();

        String s1 = str1, s2 = str2;

        boolean sign = false;

        if (l1 < l2 || (l1 == l2 && str1.compareTo(str2) < 0))

        {

            s1 = str2;

            s2 = str1;

            sign = true;

        }

        l1 = s1.length();

        while (s2.length() != l1)
            s2 = "0" + s2;

        /* Store digits in lists */            
        for (int i = l1 - 1; i >= 0; i--)

        {

            num1.add(s1.charAt(i) - '0');

            /* 9 complement of second number */

            System.out.println();
            num2.add('9' - s2.charAt(i));

        }    

        /* Add the numbers */        

        int carry = 0, carry1 = 0;
        int sum = 0;
        for (int i = 0; i < l1; i++)

        {

            int d1 = 0, d2 = 0;            

            try {

                d1 = num1.get(i);

            } 

            catch(Exception e){}            

            try {

                d2 = num2.get(i);

            } 

            catch(Exception e){}                        

            
            int x = d1 + d2 + carry;

            tmp.add(x % 10);
            
           carry = x / 10;
           
            
        }
        
        System.out.println("::::"+carry);
                
        for (int i = 0; i < l1; i++)

        {

            System.out.println(carry);
            
            int x = tmp.get(i) + carry;

            //System.out.println(x);

            ans.add(x % 10);

            carry = x / 10;

        }   
System.out.println(ans);
       

        /* Print number */    

        System.out.print("\nDifference = ");

        if (s1.equals(s2))

            System.out.print("0\n");

        else

        {

            if (sign)

                System.out.print("-");

            /* Dont print leading zeroes */

            int i;

            System.out.println(ans);
            for (i = ans.size() - 1; i >= 0; i--)
                if (ans.get(i) != 0) {
                    break;
                }
            for (; i >= 0; i--)
                System.out.print(ans.get(i));
            System.out.println();

        }                

    }
}
