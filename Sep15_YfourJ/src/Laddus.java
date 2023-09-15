
import java.util.Scanner;
public class Laddus {

	public static void main(String[] args) {
//		Scanner laddu = new Scanner(System.in);
		System.out.println("Enter the total laddus :");
		
		for( int i =0;i<1000; i++) {
			double laddu = (double) i;
		double laddus = laddu;
		double p,q,r,s;
		
		 p = ((laddus-1)/3);
		 double a = (laddus-1)-p;
//		 System.out.println("First person eat laddu after Sharing:" +p);
//		 System.out.println("Remaining laddus :"+a);
		 
		 q =((a-1)/3);
		 double b = (a-1)-q;
//		 System.out.println("Second person eat laddu after Sharing:" +q);
//		 System.out.println("Remaining laddus :"+b);
		 
		 r =((b-1)/3);
		 double c =(b-1)-r;
//		 System.out.println("Third person eat laddu after Sharing:" +r);
//		 System.out.println("Remaining laddus :"+c);
		 
		 s =c/3;
		 
//		 System.out.println("After all laddus sharing by neighbour for each person:"+s);
		
		 
		 if(c%3==0) {
			 System.out.println(laddus+" is the correct answer!");
		 }
		 
//		 else {
//			 System.out.println(laddus+" is wrong answer!");
//		 }
//		
		}
	}

}
