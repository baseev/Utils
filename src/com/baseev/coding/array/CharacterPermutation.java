package com.baseev.coding.array;

public class CharacterPermutation {

	public static void print(char str[], char[] data, int last, int index) {
		int length = str.length;
		for(int i=0; i<length; i++) {
			data[index] = str[i];
			if(last==index) {
				System.out.println(data);
			} else {
				print(str, data, last, index+1);
			}
		}		
	}
	
	public static void main(String[] args) {
		String str = "ABC";
		int length = str.length();
		char data[] = new char[length+1];
		data[length] = '\0';
		CharacterPermutation.print(str.toCharArray(), data, length-1, 0);
	} 
}
