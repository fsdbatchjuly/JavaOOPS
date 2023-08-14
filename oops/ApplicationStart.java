package com.y4j.java.oops;

import java.util.Scanner;

public class ApplicationStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
				//Data Types : byte, short, int, long, float, double, char, boolean
				//Operators : Arithmetic, Logical(&&,||), Assignment +=, ++ , --, comparision
				//Conditions if, else if, if if if, Switch
				//Loops: for, while do while
				//Functions
				//Scope Of Variables
				
				//System.out.println()
				//String
				//Math
				//Scanner
				
				
				/*OOPS : 
					Class
					Objects
					Inheritance
					Encapsulation
					Method overloading
					Method overriding
					Abstraction
				*/	
				int num = 10; //reserve 4 bytes
				Scanner readWrite = new Scanner(System.in);// Reserve some space for readWrite heapMemory
				
				
//				CarStructure tataNexon = new CarStructure();
//				tataNexon.name = "Tata Nexon";
//				tataNexon.version = "High End Fully Automatic";
//				tataNexon.seatsCount = 4;
//				tataNexon.lightsCount = 6;
//				System.out.println(tataNexon.name);
//				tataNexon.carStartStop(true);
//				tataNexon.carStartStop(false);
//			
//				
//				CarStructure rollsRoyce = new CarStructure();		
//				rollsRoyce.name = "Rolls Royce";
//				rollsRoyce.version = "Rolls Royce High end";
//				rollsRoyce.seatsCount = 10;
//				rollsRoyce.lightsCount = 30;
//				System.out.println(rollsRoyce.name);
//				rollsRoyce.carStartStop(true);
//				rollsRoyce.carStartStop(false);
				
				
				Student maheshBabu = new Student();
				maheshBabu.name = "Mahesh Babu";
				maheshBabu.gender = 'M';
				maheshBabu.className = "XI";				
				maheshBabu.lang2 = 40;
				maheshBabu.lang3 = 40;
				maheshBabu.sub1 = 40;
				maheshBabu.sub2 = 40;
				maheshBabu.sub3 = 30;
				maheshBabu.calculatePercentage();
				maheshBabu.printDetails();
				
				
				Student pk = new Student();
				pk.name = "Pawan Kalyan ";
				pk.gender = 'M';
				pk.className = "XI";
				pk.lang1 = 40;
				pk.lang2 = 40;
				pk.lang3 = 40;
				pk.sub1 = 40;
				pk.sub2 = 40;
				pk.sub3 = 30;
				pk.calculatePercentage();
				pk.printDetails();
				
				
				
	}
	

}
