package P2.Example;

import java.util.Scanner;

public class HelloApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Name: ");
		String name = scanner.nextLine().trim();
		System.out.println("Hello " + name);
	}

}
