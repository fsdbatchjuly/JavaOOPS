package com.y4j.java.oopsclasses;

public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OOPS
		//Class & Objects
		//Class is blue print. attributes/properties and methods/functions
		Student harini = new Student("Harini", 20, 30, 40, 100);		
		harini.printDeatails();
		
		Student tanweer = new Student("Tanweer", 100, 20, 40, 15);
		tanweer.printDeatails();
		
		Student mahesh = new Student("Mahesh", 100, 70, 80, 60);
		mahesh.printDeatails();
		
		Student dinesh = new Student("Dinesh", 10, 20, 10, 10);
		dinesh.printDeatails();
		
		Car tata = new Car();
		System.out.println(tata.name + tata.seatsCount);
		
		Car tataHarrier = new Car("Tata Harrier");
		System.out.println(tataHarrier.name + tataHarrier.seatsCount);
		
		Car tataNexon = new Car("Tata Nexon",12);
		System.out.println(tataNexon.name + tataNexon.seatsCount);
	}

}
