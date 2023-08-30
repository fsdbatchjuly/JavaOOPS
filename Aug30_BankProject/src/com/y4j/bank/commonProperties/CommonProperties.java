package com.y4j.bank.commonProperties;

public class CommonProperties {
	public String fName;
	public String lName;
	public String emailAddress;
	public int age;
	
	
	protected CommonProperties(String fName, String lName, String emailAddress, int age){
		this.fName = fName;
		this.lName = lName;
		this.emailAddress = emailAddress;
		this.age = age;
	}
}
