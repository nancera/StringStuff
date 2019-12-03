/*
 * Ryan Nance
 * Nancera@mail.uc.edu
 * Demonstrating the String and StringBuilder data types
 * Due: 12/03/2019
 */
package strings;
public class Main {

	public static void main(String[] args) {
		testSomeStrings();
		testSomeStringBuilders();
	}
	public static void testSomeStrings() {
		String test = "Todd Lindemann";
		long startTime = System.nanoTime();
		for (int i = 0; i < 1000000000; i++) {
			String fruit = "Applee";// Oops. Spelled wrong!
			fruit = fruit.replace("ee",  "e");
		//	System.out.println(fruit);

		}
		long endTime = System.nanoTime();

		// get difference of two nanoTime values
		long timeElapsed = endTime - startTime;
		System.out.println("testSomeStrings(): Execution time in milliseconds : " + (double)timeElapsed / 1000000);
	}
	/***
	 * Run some StringBuilder operations and see how long it takes
	 */
	public static void testSomeStringBuilders() {
		StringBuilder test = new StringBuilder("Todd Lindemann");
		long startTime = System.nanoTime();
		for (int i = 0; i < 1000000000; i++) {
			test = new StringBuilder ("Applee");
			///test= test + "!";//Append operation with a string type 
			test.replace(4,6,"e");
			//System.out.println("After replace, test = "+test.toString());
			
		}
		long endTime = System.nanoTime();

		// get difference of two nanoTime values
		long timeElapsed = endTime - startTime;
		System.out.println("testSomeStringBuilders(): Execution time in milliseconds : " + (double)timeElapsed / 1000000);
	}

}
