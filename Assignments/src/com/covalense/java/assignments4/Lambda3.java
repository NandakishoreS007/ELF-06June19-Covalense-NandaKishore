package com.covalense.java.assignments4;

import java.util.logging.Logger;

public class Lambda3 {
	private static final Logger log = Logger.getLogger("Nanda");

	public static void main(String[] args) {
		Lambda3Test l = () -> {
			log.info("lambda Example");
		};
		l.msg();
	}
}
