import java.sql.*;

import java.util.Scanner;

public class AppMain {

	public static void main(String args[]){  
	 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");		
		
		try{
			int age = sc.nextInt();
			System.out.println("Age is " + age);
			
			System.out.println("Age in months" + age*12);
			
		}catch(Exception e) {
			System.out.println("Please Enter Valid Input");
		}
		
		System.out.println("Code is completed");
			
		
	}  

}
