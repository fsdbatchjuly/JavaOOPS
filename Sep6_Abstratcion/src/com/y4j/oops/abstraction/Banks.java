package com.y4j.oops.abstraction;

public abstract class Banks {
	
	String name;
	String ifscCode;
	String address;
	String accountNumber;
	
	abstract float houseLoanIntrest();
	
	void openAccount() {
		System.out.println("Fill an application");
		System.out.println("Choos a bank account type");
		System.out.println("Deposit some money");
	}

}
