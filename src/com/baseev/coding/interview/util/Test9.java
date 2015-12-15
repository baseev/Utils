package com.baseev.coding.interview.util;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.time.DateUtils;

/**
 * 
 */

/**
 * @author baseev
 *
 */


public class Test9 {
    
    public static final Pattern countryExactPattern = Pattern.compile("^Country$", Pattern.CASE_INSENSITIVE);
    
	public static void main(String args[]) throws ParseException {        
	    Matcher countryNM = Test9.countryExactPattern.matcher("country_baseev");
        if (countryNM.matches()) {
            System.out.println("matching...");
        } else {
            System.out.println("not matching...");
        }
	}
}
