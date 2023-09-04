package com.y4j.projectmobile;

public abstract class Banks {
	
	//General class which define rules 
	//Axis,HDFC,SBI
	
	//Loans,roi,lockers,deposits
	String fName;
	
	abstract void carLoanROI();
	
	void homeLoanROI() {
		System.out.println("Home loan roi is 8%");
	}
	void personalLoanROI() {
		
	}	
	void openAccount() {
		System.out.println("Account created");
	}
	
	Banks(String fName){
		this.fName = fName;
	}
}
