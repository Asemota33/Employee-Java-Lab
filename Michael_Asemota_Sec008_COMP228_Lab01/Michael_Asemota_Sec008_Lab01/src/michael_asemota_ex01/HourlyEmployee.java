package michael_asemota_ex01;

public class HourlyEmployee {


		int employeeId;
		String firstName;
		String lastName;
		double hoursWorked;
		double hourlyRate;
		
		public int getEmployeeId() {return employeeId;}
		public String getFirstName() {return firstName;}
		public String getLastName() {return lastName;}
		public double getHoursWorked() {return hoursWorked;}
		public double getHourlyRate() {return hourlyRate;}

		public void setHourlyRate(double hRate) {
			if (hRate < 14){
				System.out.print("The hourly rate is too low\n");
				hourlyRate = 14;
			}
				else {
					hourlyRate = hRate;
				}
			}
		public void setHoursWorked(double hWorked) {
			if (hWorked <= 0) {
				System.out.print("Your hours worked a week cannot be 0 or negative\n");
			}
			else {
				hoursWorked = hWorked;
			}
			
		}
		
		public HourlyEmployee(String lname, String fname, int empId, double hRate, double hWorked) {
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
			setHourlyRate(hRate);
			setHoursWorked(hWorked);
	}
		
		public HourlyEmployee(String lname, String fname, int empId) {
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
			double Pay = hourlyRate * hoursWorked;
			return Pay;
		}
		@Override
		public String toString() {
			return String.format("Employee Id: %s%n" + "First Name: %s\n" + "Last Name: %s\n" + "Hourly Rate: %s\n" + "Hours Worked: %s\n", 
					employeeId, firstName, lastName, hourlyRate, hoursWorked);
		}

	}


