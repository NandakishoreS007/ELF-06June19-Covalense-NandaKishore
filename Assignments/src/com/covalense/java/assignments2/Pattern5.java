package com.covalense.java.assignments2;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("ënter no of rows:");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n - i + 1; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		s.close();
	}
}
