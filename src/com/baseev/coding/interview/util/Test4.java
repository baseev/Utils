package com.baseev.coding.interview.util;
/**
 * 
 */

/**
 * @author baseev
 *
 */


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test4 {
	
	ExecutorService executorService = Executors.newFixedThreadPool(10);
	private int num = 0;

	public void execute() {
		executorService.execute(new Runnable() {
		    public void run() {
		    	try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        System.out.println("Asynchronous task :: "+(++num));
		        
		    }
		});

		executorService.shutdown();
	}
	
	public static void main(String args[]) {
		
		Test4 t4 = new Test4();
		t4.execute();
		t4.execute();
		t4.execute();
		t4.execute();
		t4.execute();
		t4.execute();
		
		
		Test4 t5 = new Test4();
		t5.execute();
		
		
		Test4 t6 = new Test4();
		t6.execute();
		
		
		Test4 t7 = new Test4();
		t7.execute();
		
		
		Test4 t8 = new Test4();
		t8.execute();
		
		Test4 t9 = new Test4();
		t9.execute();
	}
}
