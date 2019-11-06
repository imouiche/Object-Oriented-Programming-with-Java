package P2.Example;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
public class Main {

	// the main func will always be statis
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primitive types, and do not have memory
		byte age = 30; // use byte as int uses 4 bytes
		long viewsCount = 3_123_456_789L; // long instead of double
		float price = 10.99F; // float instead of double
		char letter ='A';
		boolean isEligible = false;
		
		Date now = new Date(); // allocating memory for reference variable ie instantiation
		// Date is an example of reference type
		//int[] numbers = {1,2,23,3};
		int[][] numbers = {{2,4,4}, {2,3,5}};
		int[][][] num = new int[2][3][5];
		num[0][0][2] =3;
		//Arrays.toString(numbers)
		//Arrays.deepToString(num)
		System.out.println(Arrays.deepToString(numbers));
		
		final float PI = 3.14F; // to initialize as a constant
		double x = 1.2;
		int y = (int) x + 2; // explicit casting
		int result = (int) Math.round(Math.random()*100);
		System.out.println(result);
		
		//Number Format
		/*NumberFormat currency = new NumberFormat not possible
		 * NumberFormat class cannot be instantiated, so need to use factory method ie getC...
	*/
		NumberFormat currency = NumberFormat.getCurrencyInstance(); // in dollar
		String resultat = currency.format(123456.456);
		
		// resultat in percentage using method chaining
		String resultat2 = NumberFormat.getPercentInstance().format(0.1);
		System.out.println(resultat2);
		
	}

}
