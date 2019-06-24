package com.covalense.java.assignments2;

public class Prime1To100 {

	static void prime() {
		for (int i = 1; i <= 100; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}

		}
	}

	public static void main(String[] args) {
		prime();
	}

}
