package com.baseev.coding.interview.util;
/**
 * 
 */

/**
 * @author baseev
 *
 */

import java.io.IOException;
import java.net.URL;

public class Test11 {

	String url = "leadformix.com/bf/uploads/nlp/host/host26562/Test_Page_copy.html?a=b&c=d";
	

	public void makeRequest() throws IOException {
		URL aURL = new URL(url);
		StringBuffer strBuffer = new StringBuffer();
		
	   strBuffer.append(aURL.getHost()
	                + aURL.getPath());
	      
		System.out.println(strBuffer);
		System.out.println(url);
		
	}

    public static void main(String[] args) throws IOException {
        Test11 t = new Test11();
        t.makeRequest();
    }
}
