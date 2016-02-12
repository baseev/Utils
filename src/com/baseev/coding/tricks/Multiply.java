package com.baseev.coding.tricks;

/**
 * 
 * @author Baseev
 * 
 * 
 * Multiply two integers without using multiplication, division and bitwise operators, and no loops
 * 
 * Ans :
 * By making use of recursion, we can multiply two integers with the given constraints.
 *
 */
public class Multiply {

	public static int multiply(int x, int y) {
		if(y==0) {
			return 0;
		}
		
		if(y>0) {
			return x+multiply(x, y-1);
		}
		
		if(y<0) {
			return multiply(x, -y);
		}
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
