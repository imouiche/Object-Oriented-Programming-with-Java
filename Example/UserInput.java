package P2.Example;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Name: ");
		//byte age = scanner.nextByte();
		String name = scanner.nextLine().trim(); //method chaining
		//strim method to remove space before the name if any
		
		System.out.println("You are " + name );
		
		//simplified statement
		int income = 120_000;
		boolean hasHighIncome = (income > 100_000); // only work with boolean
		
		// Another example: returned operator
		String className = income > 100_000 ? "First" : "Economy";
		
		System.out.println(className + " class");
	}

}
