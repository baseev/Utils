package com.baseev.coding.interview.util;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.time.DateUtils;

/**
 * 
 */

/**
 * @author baseev
 *
 */


public class Test8 {
	public static void main(String args[]) throws ParseException {        
		String a = "ZGY5OWVmMjlhNjZmYTZlOGQ3N2Y0NmU5MTUxYTJiY2Q=";
		byte[] b = Base64.decodeBase64(a);
		System.out.print(new String(b));
	}
}
