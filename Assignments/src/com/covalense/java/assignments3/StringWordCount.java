package com.covalense.java.assignments3;

public class StringWordCount {

	public static void main(String[] args) {
		String str = "hi all how are you";
		String s[] = str.split(" ");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + s[i].length());
		}
	}

}
