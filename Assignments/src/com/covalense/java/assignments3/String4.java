package com.covalense.java.assignments3;

import java.util.Scanner;

class WordRev {
	void rev(String[] s) {
		for (int i = 0; i <= s.length - 1; i++) {
			char[] ch = s[i].toCharArray();
			for (int j = ch.length - 1; j >= 0; j--) {
				System.out.print(ch[j]);
			}
			System.out.print("ch[j]");
		}
	}
}

public class String4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String s1 = scan.nextLine();
		String[] st = s1.split(" ");
		WordRev wr = new WordRev();
		wr.rev(st);
		scan.close();
	}
}
