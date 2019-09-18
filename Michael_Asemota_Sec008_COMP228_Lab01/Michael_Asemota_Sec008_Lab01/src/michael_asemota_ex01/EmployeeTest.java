package michael_asemota_ex01;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Commission Employee
		CommissionEmployee employee = new CommissionEmployee("Joseph","Dingle",12, 100000,0.1);
		System.out.print(employee);
		System.out.print(employee.earnings());
	
		System.out.print("\n\n");
		//Base Plus Commission Employee
		BasePlusCommissionEmployee employee1 = new BasePlusCommissionEmployee("Hello","Moto",12, 500);
		System.out.print(employee1);
		System.out.print(employee1.earnings());
		
		System.out.print("\n\n");
		//Hourly Employee
		HourlyEmployee employee2 = new HourlyEmployee("Asemota","Michael",12, 30, 12);
		System.out.print(employee2);
		System.out.print(employee2.earnings());
	}

}
