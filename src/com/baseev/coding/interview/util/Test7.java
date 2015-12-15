package com.baseev.coding.interview.util;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 
 */

/**
 * @author baseev
 *
 */


public class Test7 {
	public static void main(String args[]) throws ParseException {        
		String a = "2014-02-24 12:24 PM -05:00";
		//2014-03-06 15:02 PM +0530

		Date dt = DateUtils.parseDate(a, new String[]{"yyyy-MM-dd hh:mm a ZZ"});
		
		SimpleDateFormat printFormat = new SimpleDateFormat("HH:mm:ss");
		
		System.out.println(printFormat.format(dt));
		
		//System.out.println(dt.getTime());
		//System.out.println(DateTime.parse(a));
		//SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm aa");
		//System.out.println(dateFormat.parse(a));
		
	}
}
