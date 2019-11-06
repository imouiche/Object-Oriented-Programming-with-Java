package P2.Example;

public class CleanCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullName = greetUser("Inoussa", "Mouiche");
		System.out.println(fullName);

	}
public static String greetUser(String firstName, String lastName) {
	// System.out.println("hello " + firstName + " " + lastName);
	return "hello " + firstName + " " + lastName;
}
}
