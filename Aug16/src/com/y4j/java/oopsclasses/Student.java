package com.y4j.java.oopsclasses;

public class Student {
	String name;
	int lang1;
	int lang2;
	int lang3;
	int sub1;
	
	float claculatePercentage() {
		float percentage = (float)((lang1 + lang2 + lang3 + sub1)/400.0) * 100;
		return percentage;
	}
	
	void printDeatails() {
		System.out.println("Student : " + name);
		float percentage = claculatePercentage();
		System.out.println("Percentage is : " + percentage);
		System.out.println("Is Qualified: " + isQualified());
	}
	
//	Student(){ default constructor
//		
//	}
	
	boolean isQualified() {
		boolean isPromoted;
		if(claculatePercentage() >= 35) {
			isPromoted = true;
		}else {
			isPromoted = false;
		}
		
		return isPromoted;
	}
	
	
	Student(String name,int lang1, int lang2, int lang3, int sub1){
		System.out.println("My Custom constructor is getting called");	
		this.name  = name;
		this.lang1 = lang1;
		this.lang2 = lang2;
		this.lang3 = lang3;
		this.sub1 = sub1;
	}
	
	
	
	
}
