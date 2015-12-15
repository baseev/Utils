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

public class Test2 {

	String path = "/home/baseev/test-data";
	String dir1 = "/1";
	String dir2 = "/2.html";
	
	public void createDirs() throws IOException {
		File file1 = new File(path+dir1);
		if (!file1.exists()) {
			(new File(path+dir1)).mkdir();
			System.out.println(path+dir1);
			File file2 = new File(path+dir1+dir2);
			if (!file2.exists()) {
				(new File(path+dir1+dir2)).createNewFile();
			}
		} else {
			File file2 = new File(path+dir1+dir2);
			if (!file2.exists()) {
				(new File(path+dir1+dir2)).createNewFile();
			}
		}
		
	}
	
	
	public void createFile(String directory, String file) throws IOException {
		File dir = new File(directory);
		if (!dir.exists()) {
			dir.mkdir();
			File f = new File(directory+file);
			if (!f.exists()) {
				f.createNewFile();
			}
		}
	}
	
	
	public void createDirectory(String directory)throws IOException {
		File dir = new File(directory);
		if (!dir.exists()) {
			dir.mkdir();
		}
	}
	

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Test2 t2 = new Test2();
		try {
			t2.createDirs();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
