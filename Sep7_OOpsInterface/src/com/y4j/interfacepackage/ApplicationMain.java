

package com.y4j.interfacepackage;

import java.util.ArrayList;

public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//interface 
		
		//Class, abstract class ::: extends
		//interface :::: implements can multiple inheritence
//		String name[] = new String[3];
//		name[0] = "Java";
//		name[1] = "Class";
//		name[2] = "Hi";	
//		
//		String codes[] = {"123","3143","4234","3245"};
//		codes[4] = "23234";
		
		ArrayList<String> names = new ArrayList();
		names.add("Tanweer");
		names.add("Mahesh");
		names.add("Kranthi");
		names.add("Sai");
		names.add("Harini");

		System.out.println(names.size());		
		
		
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println(names.indexOf("Kranthi"));
		names.add(1, "Dinesh");
		
		
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		
		names.remove(0);
		
		System.out.println("\n");
		
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		
		/*
		int Integer
		float Float
		double Double
		char Character
		*/
		
				
		ArrayList<Character> rollNumbers = new ArrayList();
		rollNumbers.add('c');
		rollNumbers.add('b');
		rollNumbers.add('a');
		rollNumbers.add('f');
		
		ArrayList<Axis> axisBanks = new ArrayList();
		
		Axis b1 = new Axis();
		Axis b2 = new Axis();
		Axis b3 = new Axis();
		
		axisBanks.add(b1);
		axisBanks.add(b2);
		axisBanks.add(b3);
		
	}

}
