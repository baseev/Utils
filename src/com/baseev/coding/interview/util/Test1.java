package com.baseev.coding.interview.util;
/**
 * 
 */

/**
 * @author baseev
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Test1 {

	String lfclient_ip = "10.128.1.200";
	String lfformURL = "http://gmail.com";
	String LFMIdsite = "6919";
	String LFMC = "0777777777777777";
	String lfformName = "hhhhh";
	String lfname = "Baseev Kumar";
	String lfemail = "baseevk@gmail.com";
	String lfphone = "990015069";
	String lftitle = "baseev";
	String lfcountry = "India";
	String url = "https://test2.leadformix.com/bf/FormCapture.php";

	private String createRequestURL() {
		return url+"LFMIdsite=" + LFMIdsite + "&formURL=" + lfformURL
				+ "&client_ip=" + lfclient_ip + "&LFMC=" + LFMC
				+ "&_form_name_=" + lfformName + "&name=" + lfname + "&email="
				+ lfemail + "&phone=" + lfphone + "&job=" + lftitle
				+ "&country=" + lfcountry;
	}

	public void makeRequest() throws IOException {
		String url = this.createRequestURL();
		URL lfxURL = new URL(url);
		URLConnection lfxURLConnection = lfxURL.openConnection();
		lfxURLConnection.connect();
		BufferedReader in = new BufferedReader(new InputStreamReader(lfxURLConnection.getInputStream()));
		String inputLine;
		while ((inputLine = in.readLine()) != null) 
		{
			System.out.println(inputLine);
		}			
		in.close();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t = new Test1();
		try {
			t.makeRequest();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
