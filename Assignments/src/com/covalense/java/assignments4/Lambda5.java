package com.covalense.java.assignments4;

import java.util.logging.Logger;

public class Lambda5 {
	private static final Logger log = Logger.getLogger("Nanda");

	public static void main(String[] args) {
		Lambda5Test t = (num) -> {
			for (int i = 0; i <= num; i++)
				log.info("" + i);

		};
		t.range(5);
	}
}
