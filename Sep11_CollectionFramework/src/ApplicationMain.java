
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;

public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int rollNumbers[] = new int[5];
//		rollNumbers[0] = 101;
//		rollNumbers[1] = 102;
//		rollNumbers[2] = 103;
//		rollNumbers[3] = 104;
//		System.out.println(rollNumbers[1]);
//		rollNumbers[4] = 105;
		
//		int,float,double,long,char
//		Integer, Float, Double,Long,Character
		ArrayList<Integer> rollNumbers = new ArrayList();
		
		rollNumbers.add(101);
		rollNumbers.add(102);
		rollNumbers.add(103);
		rollNumbers.add(104);
		rollNumbers.add(106);
		
		
		ArrayList<String> shortForms = new ArrayList();
		shortForms.add("ind");
		shortForms.add("ger");
		shortForms.add("aus");
		
		
		ArrayList<String> fullForms = new ArrayList();
		fullForms.add("India");
		fullForms.add("Australia");
		fullForms.add("Germany");
		
		for(int i=0;i<fullForms.size();i++) {
			System.out.println(shortForms.get(i) + " " + fullForms.get(i));
		}
		
		String phoneNumbers[] = {"8142377077","9127876384","3482379484"};
		String names[] = {"dinesh","Kranthi","Mahesh"};
		/*
		Key	Value
		ind India 
		aus Australia 
		ger Germany 
		*/
//		HashMap<key,value>
		HashMap<Integer,String> countries =  new HashMap();
		
		countries.put(1, "Dinesh");
		countries.put(2, "Harini");
		countries.put(3, "Mahesh");
		countries.put(4, "Kranthi");
		
		System.out.println(countries.get(6));
	
		
		System.out.println("Enter the abbrevation to get the state full name");
		System.out.println("The AP is abbrevation for AndhraPradesh");
			
		ArrayList<String> codes = new ArrayList();
		codes.add("AP");
		codes.add("AR");
		codes.add("AS");
		codes.add("BR");
		
		//CollectionFramework in Java
		
	}

}
