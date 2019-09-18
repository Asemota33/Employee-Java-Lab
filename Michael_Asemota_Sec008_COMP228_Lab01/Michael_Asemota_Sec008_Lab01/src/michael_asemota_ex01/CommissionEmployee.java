package michael_asemota_ex01;

public class CommissionEmployee {

	int employeeId;
	String firstName;
	String lastName;
	double grossSales;
	double commissionRate;
	
	public int getEmployeeId() {return employeeId;}
	public String getFirstName() {return firstName;}
	public String getLastName() {return lastName;}
	public double getGrossSales() {return grossSales;}
	public double getcomissionRate() {return commissionRate;}

	public void setCommissionRate(double commRate) {
		if (commRate < 0.1 || commRate > 1 ){
			System.out.print("The Commission rate is out of range\n");
			commissionRate = 0.1;
		}
			else {
				commissionRate = commRate;
			}
		}
	public void setGrossSales(double groSale) {
		if (groSale <= 0) {
			System.out.print("Your gross sales cannot be 0 or negative\n");
		}
		else {
			grossSales = groSale;
		}
		
	}
	
	public CommissionEmployee(String lname, String fname, int empId, double groSale, double comRate) {
		if (fname == null || fname == "") {
			System.out.print("Please enter a valid first name\n");
		}
		else {
			firstName = fname;
		}
		if (lname == null || lname == "") {
			System.out.print("Please enter a valid last name\n");
		}
		else {
			lastName = lname;
		}
		if (empId > 0) {
			employeeId = empId;
		}
		else {
			System.out.print("Please enter a valid employee ID");
		}
		setCommissionRate(comRate);
		setGrossSales(groSale);
}
	
	public CommissionEmployee(String lname, String fname, int empId) {
		if (fname == null || fname == "") {
			System.out.print("Please enter a valid first name\n");
		}
		else {
			firstName = fname;
		}
		if (lname == null || lname == "") {
			System.out.print("Please enter a valid last name\n");
		}
		else {
			lastName = lname;
		}
		if (empId > 0) {
			employeeId = empId;
		}
		else {
			System.out.print("Please enter a valid employee ID");
		}
	}
	public double earnings() {
		double commission = commissionRate * grossSales / 100;
		return commission;
	}
	@Override
	public String toString() {
		return String.format("Employee Id: %s%n" + "First Name: %s\n" + "Last Name: %s\n" + "Commission Rate: %s\n" + "Gross Sales: %s\n", 
				employeeId, firstName, lastName, commissionRate, grossSales);
	}

}
