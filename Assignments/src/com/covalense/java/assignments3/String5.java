package com.covalense.java.assignments3;

public class String5 {
	public static void main(String[] args) {
		String s = "hi all how are you";
		String[] s1 = s.split("");
		for (int i = 0; i <= s1.length - 1; i++) {
			if (i % 2 == 0) {
				char[] ch = s1[i].toCharArray();
				for (int j = ch.length - 1; j >= 0; j--) {
					System.out.print(ch[j]);
				}
				System.out.print("");
			} else {
				System.out.print(s1[i]);
				System.out.print("");
			}
		}
	}
}
