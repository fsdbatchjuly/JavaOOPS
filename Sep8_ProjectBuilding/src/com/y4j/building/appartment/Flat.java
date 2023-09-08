package com.y4j.building.appartment;

public class Flat {
	
	int flatNo;
	int floorNumber;
	int fans;
	int lights;
	Person owner;
	
	Flat(int flatNo,int floorNumber,int fans,int lights,Person owner){
		this.flatNo = flatNo;
		this.floorNumber = floorNumber;
		this.fans = fans;
		this.lights = lights;
		this.owner = owner;
	}

}
