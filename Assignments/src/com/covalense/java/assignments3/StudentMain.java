package com.covalense.java.assignments3;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student();

		s1.setName("nanda");
		s1.setAge(22);
		s1.setSalary(2000);
		s1.setCompany("covalense");

		System.out.println("Name is " + s1.getName());
		System.out.println("age is " + s1.getAge());
		System.out.println("Salary is " + s1.getSalary());
		System.out.println("Company is " + s1.getCompany());
	}

}
