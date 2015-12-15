package com.baseev.coding.interview.lang.inner;

public class Test1
{

    private int a = 10;
    
    public class Inner {
        //private int a = 20;        
        
        public void print() {
            System.out.println("Inner print : "+a);
        }
        
        
    }
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Test1.Inner inner = new Test1().new Inner();
        
        inner.print();

    }

}
