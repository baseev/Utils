package com.baseev.coding.interview.lang.exception;


public class ExceptionHandlers
{

    public void print(int divisor)
    {
       assert divisor > 1;
       try {
           int a  = 100/divisor;
           return;
       } catch(RuntimeException re) {
           System.out.println("Baseev Exception : "+re);
       }
        finally {
            System.out.println("finally");
        }
        
    }
    
    public static void main(String args[]) {
        ExceptionHandlers e = new ExceptionHandlers();
        e.print(0);
        System.out.println("After exception");
    }
   
}
