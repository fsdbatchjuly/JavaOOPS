package com.y4j.building.appartment;

public class Building {
	
	String name;
	int floors;
	String address;
	Flat[] flats; 
	boolean haveGenerator;
	
	Building(String name,int floors,String address,Flat[] flats,boolean haveGenerator){
		this.name = name;
		this.floors = floors;
		this.address = address;
		this.flats = flats;
		this.haveGenerator = haveGenerator;
		
	}
}
