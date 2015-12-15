package com.baseev.coding.interview.util;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * 
 */

/**
 * @author baseev
 *
 */


public class EmailValidation {
    
    public static final Pattern emailValPattern = Pattern.compile("[a-zA-Z0-9[!#$%&'()*+,/\\-_\\.\"]]+@[a-zA-Z0-9[!#$%&'()*+,/\\-_\"]]+\\.[a-zA-Z0-9[!#$%&'()*+,/\\-_\"\\.]]+", Pattern.CASE_INSENSITIVE);

	public static void main(String args[]) throws ParseException {        
	    Matcher countryNM = EmailValidation.emailValPattern.matcher("http://www.cairooil.com/js/home.asp");
        if (countryNM.matches()) {
            System.out.println("matching...");
        } else {
            System.out.println("not matching...");
        }
	}
}
