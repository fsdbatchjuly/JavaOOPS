import java.sql.*;
import java.util.*;


public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Connection
		//DriverManager
		//Statement
		//ResultSet
		
		System.out.println("1.Course list");
		System.out.println("2.Update course list");
		
		int value = sc.nextInt();
		
		switch(value) {
		case 1: 
			//Display Course List
			displayCourseList();
			break;
		case 2:
			//Upadate course list
			System.out.println("Please enter Course Name");
			

			break;
		}		

	}
	
	public static void displayCourseList() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/y4jdb","root","Bannu@123");           
			Statement statement = connect.createStatement();
			ResultSet result = statement.executeQuery("Select * from courseDetails");
			while(result.next()) {
				System.out.println(result.getString(1)+" "+result.getInt(2) + " " + result.getString(3));
			}
		}catch(Exception e){
			System.out.print(e.toString());
		}
	}
	
	public static void updateQuery(String courseName,int courseId, String courseShortForm) {
		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/y4jdb","root","Bannu@123");
			Statement statement = connect.createStatement();
			statement.executeUpdate("insert into courseDetails\n"
					+ "values('Oracle',17,'Ora')");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	

}
