package com.y4j.java.oops;

public class Student {

	String name;
	int sub1;
	int sub2;
	int sub3;
	int lang1;
	int lang2;
	int lang3;
	String className;
	char gender;
	
	void printDetails() {
		
		System.out.println("Student Name is " + name);
	}
	void calculatePercentage() {
		
		float percent = (float)((sub1 + sub2 + sub3 + lang1 + lang2 + lang3)/600.0) * 100;
		System.out.println(this.name + " got " + percent);
		
	}
	
	
	
	
	
}
