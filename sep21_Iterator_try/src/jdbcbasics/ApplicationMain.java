package jdbcbasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<String> names = new ArrayList();
//		names.add("Kranthi");
//		names.add("Mahesh");
//		names.add("Tanweer");
//		names.add("Khaja");
//		names.add("Harini");
//		
//		System.out.println("For loop");
//		for(int i = 0; i<names.size();i++) {
//			System.out.println(names.get(i));
//		}
//		
//		System.out.println("\nIterator loop");
		
		
		Student s1 = new Student("K", "ja");
		Student s2 = new Student("T", "weer");
		Student s3 = new Student("M", "esh");
		Student s4 = new Student("K", "thi");
		Student s5 = new Student("H", "ini");
		
		ArrayList<Student> students = new ArrayList();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
				
		Iterator stIt = students.iterator();
		
//		while(stIt.hasNext()) {
//			Student s = (Student) stIt.next();
//			System.out.println(s.fName + s.lName);
//		}
//				
		try {
			System.out.println(students.get(5).fName);
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("Code completed");

	}

}
