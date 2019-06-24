package com.covalense.java.assignments3;

public class Car {
	public static void main(String[] args) {
		Benz b = new Benz();
		Audi a = new Audi();
		Parent p = new Parent();
		a.recieve();
		b.recieve();
		p.recieve();
		p.recieve();
	}
}
