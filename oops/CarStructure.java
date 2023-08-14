package com.y4j.java.oops;

public class CarStructure {
	
	String name;
	String version;
	int seatsCount;
	int lightsCount;
	
	void lightsOnOff(boolean isStart) {
		if(isStart) {
			System.out.println("Lights are on");
		}else {
			System.out.println("Lights are off");
		}
	}
	
	
	void carStartStop(boolean isStart) {
		if(isStart) {
			System.out.println("Car is Started");
		}else {
			System.out.println("Car is stopped");
		}
	}
	
	
}
