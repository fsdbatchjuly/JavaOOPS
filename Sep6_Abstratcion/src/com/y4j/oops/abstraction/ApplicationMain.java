package com.y4j.oops.abstraction;

public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		//Compile time polymorphism
		//Learn each concept individually
		//Compare with the old concepts
		
		Child1 c1 = new Child1();//Constructors
		c1.myParentFunction();
		
		
		Kangaroo k1 = new Kangaroo();
		k1.walk();
		k1.eats();
		
		
		Axis hyderabadAxis = new Axis();
		hyderabadAxis.openAccount();
		
		Hdfc hyderabadHdfc = new Hdfc();
		hyderabadHdfc.openAccount();		
		
	}	
	
	
	

}
