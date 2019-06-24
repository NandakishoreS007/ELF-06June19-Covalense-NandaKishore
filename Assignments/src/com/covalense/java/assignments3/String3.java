package com.covalense.java.assignments3;

import java.util.Scanner;

public class String3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String s = scan.nextLine();
		String[] st = s.split(" ");
		String temp1 = "";
		String temp2 = "";
		for (int i = 0; i <= st.length - 1; i++) {
			if (i % 2 == 0) {
				if (i == 0) {
					temp1 = st[i];
					st[i] = st[st.length - 1];
					st[st.length - 1] = temp1;
					System.out.print(st[i]);
					System.out.print("");
				}
				if (i > 0) {
					temp2 = st[i];
					st[i] = temp1;
					temp1 = temp2;
					System.out.print(st[i]);
					System.out.print("");
				}
			} else {
				System.out.print(st[i]);
				System.out.print("");
			}
		}
		scan.close();
	}

}
