package com.y4j.java.oopsclasses;

public class Car {
	String name;
	int seatsCount;
	
	Car(){
		System.out.println("Car Constructor called");
	}
	
	Car(String name){
		System.out.println("Car Constructor with name is called");
		this.name = name;
	}
	
	Car(String name, int seatsCount){
		System.out.println("Car Constructor with name and seactsCount called");
		this.name = name;
		this.seatsCount = seatsCount;
	}
}
