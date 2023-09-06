package com.y4j.oops.abstraction;

public abstract class Animal {
	
	/*
	  	Classes
		Objects
		Inheritence: Singlelevel, multilevel, hirearchial, hybrid, multiple
		Encapsulation :private setters & getters
		Polymorphism: func overloading(Compile Time Polymorphism) and overriding parent override in child
		Abstraction : abstraction and interface
		abstract classes we can create abstract and non abstract methods
		
	 */
	int legs;
	int hands;
	
	void speak()//declaration 
	{
	//body, definition, or implementation	
	}
	abstract void walk();
	
	void eats() {
		System.out.println("Animal is eating");
	}
		
}
