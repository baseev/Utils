package com.baseev.coding.interview.util;
/**
 * 
 */

/**
 * @author baseev
 *
 */


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test5 {

	
	public static void main(String args[]) {        
	Calendar c = GregorianCalendar.getInstance();
    c.setTime(new Date());
    c.add(Calendar.HOUR_OF_DAY, -6);
    System.out.print(c.getTime());
	}
}
