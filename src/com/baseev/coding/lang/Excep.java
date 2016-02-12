package com.baseev.coding.lang;

public class Excep {

	public static void make() throws Error {
		//throw new Error("Throwable...");
	}
	
	public static void main(String[] args) {
		try {
			Excep.make();
			System.exit(0);
		} catch (Error e) {
			System.out.println("Catch.....");
		} finally {
			System.out.println("Finally.....");
		}		
	}
}
