package com.y4j.classAsProperties;

public class Tyre {
	String color;
	int width;
	int height;
	float thinckness;
	int price;
	String type;//Alloy or Steel or Iron
	String name;
	
	
	void startMoving(){
		System.out.println(this.name + " wheel is moving");
	}	
	void stopMoving(){
		System.out.println(this.name + " wheel is stop moving");
	}
	
	
	Tyre(String color, int width, int height, float thinckness, int price, String type, String name){
		this.color = color;
		this.width = width;
		this.height = height;
		this.thinckness = thinckness;
		this.price = price;
		this.type = type;
		this.name = name;
	}
	public Tyre(String color2, int width2, int height2, int thinckness2, int price2, String type2, String name2) {
		// TODO Auto-generated constructor stub
	}
	
}
