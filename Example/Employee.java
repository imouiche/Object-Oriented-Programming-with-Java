package P2.Example;
//Encapsulation
public class Employee {
	//fields -> called data in the Encapsulation concept
	private int baseSalary;
	private int hourlyRate;
	
	//let's create a constructor explicitly if not a default constructor will be created by javac
	//iT shld use the exact class name and allows us to initial diff fields
	
	public Employee(int baseSalary, int hourlyRate) {
		//this.baseSalary = baseSalary;
		// let's use getter/setter to take advantage of the data validation
		setBaseSalary(baseSalary);
		setHourlyRate(hourlyRate);
	}
	
	// we use static when we want to call the method from the main method
	/*
	 * first charact of OOP ie calcuteWage method does not have any para/values
	 * instead we encapsulate these para/values along with methods that operate on
	 * them inside a single object/unit
	 */
	// we assume that extraHours is diff monthly and 2 others are fixed
	public int calculateWage(int extraHours) {
		return baseSalary + (extraHours * hourlyRate);
	}
	
	public void setBaseSalary(int baseSalary) {
		if (baseSalary <= 0)
			throw new IllegalArgumentException("Salary can't be <= 0");
		this.baseSalary = baseSalary;
	}
	public int getBaseSalary() {
		return baseSalary;
	}
	public void setHourlyRate(int hourlyRate) {
		if (hourlyRate <= 0)
			throw new IllegalArgumentException("hourly rate can't be <= 0");
		this.hourlyRate = hourlyRate;
	}
	public int getHourlyRate() {
		return hourlyRate;
	}
}

