
public class ConceptsMain {
	String name;
	static String email;
	
	void normalFunction() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConceptsMain cm = new ConceptsMain();
		cm.name = "Java Class"; 
		
		email = "din@gmail.com";
		
		//Static variables and functions we can access w/o object or reference or instance
		//we can directly access using class name
		
		SampleClass.myStaticString = "Dinesh";		
		
		SampleClass sampCls = new SampleClass();		
		sampCls.myNormalString = "NormalStrin";
		sampCls.myVoidFunction();
		
		cm.normalFunction();
		
		//public private protected 
		//static
		//inheritence
		
		int myArray[] = {10,20,30,40,50};
//		System.out.println(myArray[6]);//Runtime
		
		
		Human hero = new Male();
		hero.voice();
		
		
		Human female = new Female();		
		female.voice();
		
		Human huma = new Human();
		huma.voice();
		//Run time Polymorphism;
		
//		https://www.javatpoint.com/runtime-polymorphism-in-java
			
		
		Addition add = new Addition();
		add.additionOfNumbers(1,2);//Compile time polymorphism	
		
	}
	
	void mySampleFunction() {
		name = "dinesh";
	}

}
