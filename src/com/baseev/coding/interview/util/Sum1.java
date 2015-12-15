package com.baseev.coding.interview.util;
/**
 * 
 */

/**
 * @author baseev
 *
 */

public class Sum1 {

    public int minimumSum(int[] array)
    {
          int counter1, counter2, minimumSum;
          int n = array.length;
          counter1 = array[n-1];
          counter2 = array[n-2];
          // It is assumed that the array is sorted.
          int i = n-3;
          while(i>=0)
          {
              if(counter1 > counter2)
              { 
                  counter2 = counter2 + array[i];
              }
              else
              {
                  counter1 = counter1 + array[i];
              }
              i--;
          }
          if(counter1 > counter2)
          {
              minimumSum = counter1 - counter2;
          }
          else
              minimumSum = counter2 - counter1;
          return minimumSum ;
    }
    
	public static void main(String[] args) {
	    int[] array =  {1,2,3,4, 5};
	    Sum1 s = new Sum1();
	    System.out.println(s.minimumSum(array));
	    
	}

}
