package com.baseev.coding.interview.util;
/**
 * 
 */

/**
 * @author baseev
 *
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Test3 {
	
	public static void main(String args[]) {
		String formUrl = "https://app4.leadformix.com/ef1/deepak/sform.html?url_id=testforfinal";
		String settingsUrl = "https://app4.leadformix.com/ef1/deepak/sform.html";
		System.out.println(formUrl.indexOf(settingsUrl));
		
	}
}
