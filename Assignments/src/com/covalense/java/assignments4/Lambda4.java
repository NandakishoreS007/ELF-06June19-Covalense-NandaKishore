package com.covalense.java.assignments4;

import java.util.logging.Logger;

public class Lambda4 {
	private static final Logger log = Logger.getLogger("Nanda");

	public static void main(String[] args) {
		Lambda4Test q = (sqr) -> {
			return sqr * sqr;
		};
		int sqr = q.sqrt(5);
		log.info("" + sqr);
	}
}
