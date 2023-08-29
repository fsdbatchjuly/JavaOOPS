package com.y4j.classAsProperties;

public class Door {
	int handle;
	int height;
	int width;
	String material;//Iron, steel, metal;
	boolean withGlass;
	String name;
	
	void openDoor(){
		System.out.println(this.name + " Door is opened");		
	}
	void closeDoor(){
		System.out.println(this.name + " Door is closed");
	}
	
	void openWindow() {
		System.out.println(this.name + " Window is Opened");
	}
	
	void closeWindow() {
		System.out.println(this.name + " Window is Closed");
	}
	
	
	Door(int handle, int height, int width, String material, boolean withGlass, String name){
		this.handle = handle;
		this.height = height;
		this.width = width;
		this.material = material;
		this.withGlass = withGlass;
		this.name = name;		
	}

	
}
