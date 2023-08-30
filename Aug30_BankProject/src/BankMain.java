import com.y4j.bank.employees.Employee;
import com.y4j.bank.customers.Customer;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee din = new Employee("din", "esh", "din@gmail.com",45);	
		
		System.out.println(din.fName + din.lName);
		
		Customer khaja = new Customer("Kha", "ja", "khaja@gmail.com",12);
		
		System.out.println(khaja.fName + khaja.lName);
	}

}
