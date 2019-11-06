package P2.Example;
//Encapsulation
public class EmployeeAbstraction {
	//fields -> called data in the Encapsulation concept
	private int baseSalary;
	private int hourlyRate;
	
	// "static" fields for concepts that do not belong to each individual employee
	public static int numberOfEmployees;
	
	//let's create a constructor explicitly if not a default constructor will be created by javac
	//iT shld use the exact class name and allows us to initial diff fields
	
	public EmployeeAbstraction(int baseSalary, int hourlyRate) {
		//this.baseSalary = baseSalary;
		// let's use getter/setter to take advantage of the data validation
		setBaseSalary(baseSalary);
		setHourlyRate(hourlyRate);
		numberOfEmployees++;
	}
	
	/*
	 * constructor overloading. case of employees not having the hourly rate
	 */
	
	public EmployeeAbstraction(int baseSalary) {
		this(baseSalary, 0); 
		//we can use this bcz we can't call employeeAbs object here and the 2 logics/methods of the other constructor
		// will be called. Now we call call EmployeeAbstraction obejct with only a single arg
		/*
		 * setBaseSalary(baseSalary); setHourlyRate(0);
		 */
	}
	public static void printNumberOfEmployee() {
		System.out.println(numberOfEmployees);
	}
	
	public int calculateWage(int extraHours) {
		return baseSalary + (extraHours * hourlyRate);
	}
	
	//Method overloading - CalculateWage with no parameter
	/*
	 * public int calculateWage() { return calculateWage(0); }
	 */
	
	private void setBaseSalary(int baseSalary) {
		if (baseSalary <= 0)
			throw new IllegalArgumentException("Salary can't be <= 0");
		this.baseSalary = baseSalary;
	}
	/*
	 * Abstraction -> we change getBaseSalary() from public to private to hide
	 * the implementation details from outsite, then we're reducing the cplexity
	 */
	private int getBaseSalary() {
		return baseSalary;
	}
	private void setHourlyRate(int hourlyRate) {
		if (hourlyRate < 0)
			throw new IllegalArgumentException("hourly rate can't be <= 0");
		this.hourlyRate = hourlyRate;
	}
	private int getHourlyRate() {
		return hourlyRate;
	}
}

