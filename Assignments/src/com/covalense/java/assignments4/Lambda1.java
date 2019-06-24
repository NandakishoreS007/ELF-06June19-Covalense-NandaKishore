package com.covalense.java.assignments4;

import java.util.logging.Logger;

public class Lambda1 {
	private static final Logger log = Logger.getLogger("Nanda");
	static Lambda1Test s = (a, b) -> a + b;

	public static void main(String[] args) {
		int i = s.add(5, 10);
		log.info("Addition " + i);
	}
}
