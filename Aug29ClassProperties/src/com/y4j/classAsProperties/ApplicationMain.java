package com.y4j.classAsProperties;

public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car benz = new Car(); //instance or object;
		benz.name = "Benz Car";
		System.out.println(benz.name.charAt(1));
			
		Tyre frontLeftTyre = new Tyre("Black", 50, 50, 20, 1000, "Alloy Wheels", "Front Left Tyre");
		Tyre frontRightTyre = new Tyre("Black", 50, 50, 20, 1000, "Alloy Wheels", "Front Right Tyre");
		Tyre backleftTyre = new Tyre("Black", 50, 50, 20, 1000, "Alloy Wheels", "Back Left Tyre");
		Tyre backRightTyre = new Tyre("Black", 50, 50, 20, 1000, "Alloy Wheels", "Back Right Tyre");
		
		
		Door frgtDoor = new Door(1, 100, 200, "Iron", true, "Front Right Door");
		Door flftDoor = new Door(1, 100, 200, "Iron", true, "Front Left Door");
		Door brgtDoor = new Door(1, 100, 200, "Iron", true, "Back Right Door");
		Door blftDoor = new Door(1, 100, 200, "Iron", true, "Back Left Door");
		
		
		
		benz.frontLeftTyre = frontLeftTyre;
		benz.frontRightTyre = frontRightTyre;
		benz.backLeftTyre = backleftTyre;
		benz.backRightTyre = backRightTyre;
		
		benz.frontLeftDoor = flftDoor;
		benz.frontRightDoor = frgtDoor;
		benz.backRightDoor = brgtDoor;
		benz.backLeftDoor = blftDoor;
		
		
		benz.frontRightDoor.openWindow();
		benz.frontRightDoor.closeWindow();
		benz.frontRightDoor.openDoor();
		benz.frontRightDoor.closeDoor();
		
		
		String name = "Java Class";//name: instance or object or variable
		
		name.charAt(5);//charAt is a Function available in String
		

	}

}
