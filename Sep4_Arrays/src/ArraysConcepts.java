
import java.util.ArrayList;

public class ArraysConcepts {
	
	public static Pet p1;
	public static Pet p2;
	public static Pet p3;
	public static Pet p4;
	
	public static Pet pets[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = {
				"Dinesh",
				"Kranthi",
				"Mahesh",
				"Tanweer",
				"Khaja",
				"Sai",
				"Nag",
				"Shiv"
			};
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		names[0] = "Dinesh K";
		names[1] = "Mahesh";
		names[2] = "Kranthi";
		
		System.out.println("\n After Sorting");
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		System.out.println("\nPets Details are:::::") ;
		
		
		p1 = new Pet("jimmy", 'M', "Dog");
		p2 = new Pet("Puppy", 'F', "Cat");
		p3 = new Pet("Bunny", 'M', "Dog");
		p4 = new Pet("sweety", 'F', "Rabbit");		
		Pet pets[] = {p1,p2,p3,p4};		
		Person personDinesh = new Person(pets, "Dinesh");
		

		p1 = new Pet("abc", 'M', "Dog");
		p2 = new Pet("def", 'F', "Cat");
		p3 = new Pet("ghi", 'M', "Dog");
		p4 = new Pet("jkl", 'F', "Rabbit");		
		Pet pets1[] = {p1,p2,p3,p4};
		Person personMahesh = new Person(pets1, "Mahesh");
		
	
		
		p1 = new Pet("1243", 'M', "Dog");
		p2 = new Pet("3124", 'F', "Cat");
		p3 = new Pet("42314", 'M', "Dog");
		p4 = new Pet("13423", 'F', "Rabbit");		
		Pet pets2[] = {p1,p2,p3,p4};				
		Person personKranthi = new Person(pets2, "Kranthi");
		
		Person peopleArray[] = {personDinesh,personMahesh,personKranthi};
		
		for(int i=0;i<peopleArray.length;i++) {
			System.out.println(peopleArray[i].name + " ");
			
			Pet pp[] =  peopleArray[i].pets;
			for(int j=0;j<pp.length;j++) {
				System.out.println(peopleArray[i].pets[j].name);
			}
		}
		
		
	}
	
	

}
