package com.y4j.oops.inheritence;

public class ParentDetails {

	String firstName;
	String lastName;
	String middleName;
	int age;
	char gender;
	String dob;
	String emailId;
	
	
	void getFullName() {
		System.out.println(this.firstName + this.lastName + this.middleName);
	}
	void ageInMonths() {
		System.out.println("Age in Months " + age*12);
	}
}
