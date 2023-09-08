package com.y4j.building.appartment;

public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person kranthi = new Person("Kranthi", "kranthi@gmail.com", 24);
		Person mahesh = new Person("Mahesh", "mahesh@gmail.com", 22);
		
		Person harini = new Person("Harini", "Harini@gmail.com", 22);
		Person tanweer = new Person("Tanweer", "tanweer@gmail.com", 22);
		Person shivam = new Person("Shivam", "shivam@gmail.com", 22);
		
		Flat f101 = new Flat(101, 1,  2, 2,kranthi);
		Flat f102 = new Flat(102, 1,  2, 2,kranthi);
		Flat f103 = new Flat(103, 1,  2, 2,mahesh);
		Flat f104 = new Flat(104, 1,  2, 2,mahesh);
		
		Flat f201 = new Flat(201, 2,  2, 2,harini);
		Flat f202 = new Flat(202, 2,  2, 2,kranthi);
		Flat f203 = new Flat(203, 2,  2, 2,kranthi);
		Flat f204 = new Flat(204, 2,  2, 2,harini);
		
		
		Flat f301 = new Flat(301, 3,  2, 2,shivam);
		Flat f302 = new Flat(302, 3,  2, 2,harini);
		Flat f303 = new Flat(303, 3,  2, 2,tanweer);
		Flat f304 = new Flat(304, 3,  12, 12,tanweer);
		
		Flat[] flats = {f101,f102,f103,f104,f201,f202,f203,f204,f301,f302,f303,f304};
		
		Building ramkyBuilding = new Building("Ramky Towers", 3, "Jublie Hills", flats, true);
		
		
		System.out.println("Name : "+ramkyBuilding.name);
		System.out.println("Floor : "+ramkyBuilding.floors);
		System.out.println("Address : "+ramkyBuilding.address);
		System.out.println("Generator :"+ramkyBuilding.haveGenerator);
		for(int i=0;i<ramkyBuilding.flats.length;i++) {
			System.out.println(ramkyBuilding.flats[i].flatNo);
			if(ramkyBuilding.flats[i].flatNo == 304) {
				System.out.println(" Fans Count " + ramkyBuilding.flats[i].fans);
			}
		}
		
		
		
		Flat myHF1001 = new Flat(1001, 1, 3, 3,kranthi);
		Flat myHF1002 = new Flat(1002, 1, 3, 3,kranthi);
		Flat myHF1003 = new Flat(1003, 1, 3, 3,kranthi);
		
		Flat myHF2001 = new Flat(2001, 2, 3, 3,mahesh);
		Flat myHF2002 = new Flat(2002, 2, 3, 3,mahesh);
		Flat myHF2003 = new Flat(2003, 2, 3, 3,mahesh);
		
		
		Flat myHF3001 = new Flat(3001, 3, 3, 3,tanweer);
		Flat myHF3002 = new Flat(3002, 3, 3, 3,tanweer);
		Flat myHF3003 = new Flat(3003, 3, 3, 3,tanweer);
		
		Flat myHF4001 = new Flat(4001, 3, 3, 3,harini);
		Flat myHF4002 = new Flat(4002, 3, 3, 3,harini);
		Flat myHF4003 = new Flat(4003, 3, 3, 3,harini);
		
		Flat myHF5001 = new Flat(5001, 3, 3, 3,harini);
		Flat myHF5002 = new Flat(5002, 3, 3, 3,harini);
		Flat myHF5003 = new Flat(5003, 3, 3, 3,harini);
	
		
		Flat[] myHomeFlats = {myHF1001,myHF1002,myHF1003,myHF2001, myHF2002,myHF2003,
				myHF3001,myHF3002,myHF3003,myHF4001,myHF4002,myHF4003,myHF5001,myHF5002,myHF5003};
		
		Building myHomeTowers = new Building("My Home Constructions", 5, "Gachibowli", myHomeFlats, true);
		
		System.out.println("Name : "+myHomeTowers.name);
		System.out.println("Floor : "+myHomeTowers.floors);
		System.out.println("Address : "+myHomeTowers.address);
		System.out.println("Generator :"+myHomeTowers.haveGenerator);
		for(int i=0;i<myHomeTowers.flats.length;i++) {
			System.out.println(myHomeTowers.flats[i].flatNo);
		}

		System.out.println(ramkyBuilding.flats[4].owner.name);
		
		
		
	}

}
