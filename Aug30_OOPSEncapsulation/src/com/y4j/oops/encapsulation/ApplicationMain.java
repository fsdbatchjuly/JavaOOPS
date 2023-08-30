package com.y4j.oops.encapsulation;

public class ApplicationMain {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scope of Variables
		//public can be accessed anywhere within the project
		//private can be accessed only within the class
		//protected can be access only with in the package
		//default if you don't specify any it is  protected: It can be used within the package
		
		Employee anil = new Employee();		
		anil.empId = 1234;
		anil.empName = "Anil";
		anil.empAge = 124;	
		
		
		//Public or Protected variables
		//printing means reading means getting the value of variable empName
		System.out.println(anil.empName);
		
		anil.empName = "Anil Gubbala";
		//Assigning a new value or setting a new value to the variable empName
		
		
		//create getters and setters to access or modify private variables of a class
		anil.setEmpSalary(10000);		
		System.out.println(anil.getEmpSalary());
		//Encapsulation, some data hiding
		//You can share your BankAccount details
		//You won't share bank balance
		//you wont share your transaction otp's
		
		//OOPS
		//Class, Objects/Instances, Inheritence, 
		//(access modifiers:Public,private,protected), Encapsulation	
		
		
		//git clone url
		//git add * "It will add all the changes/files and make ready psuhed"
		//git commit -m "Commit message"
		//git push
		//userId:email or userId
		//password:create a token and use it as a password
	}
	

}
