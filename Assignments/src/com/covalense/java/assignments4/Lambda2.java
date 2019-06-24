package com.covalense.java.assignments4;

import java.util.logging.Logger;

public class Lambda2 {
	private static final Logger log = Logger.getLogger("Nanda");

	public static void main(String[] args) {
		Lambda2Test f = (num) -> {
			int fa = 1;
			for (int i = 1; i <= num; i++) 
				fa = fa * i;
				return fa;
		};
		int fa = f.fact(5);
		log.info(" " + fa);
	}
}
