package com.baseev.coding.lang;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent {
	public void m1() throws IOException {
	}
}

public class Exception1 extends Parent {

	public void m1() throws FileNotFoundException {
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
