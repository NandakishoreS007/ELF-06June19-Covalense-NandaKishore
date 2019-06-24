package com.covalense.java.assignments3;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		String str;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a String:");
		str = s.nextLine();
		System.out.println("Reverse of a String" + str + "is:");
		for (int i = str.length(); i > 0; i--) {
			System.out.print(str.charAt(i - 1));
		}
		s.close();

	}
}
