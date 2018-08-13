package example_nine;

public class ExampleNine {

	public static void main(String[] args) {

		// Example one
		String output = String.format("%s = %d", "joe", 35);
		System.out.println(output);
		
		// Example two
		System.out.printf("My name is: %s%n", "joe"); // %n works the same as \n adding a newline character
		
		// Example three
		String helloWorld = String.format("%2$s", "Hello", " World!"); // prints: " World!"
		System.out.println(helloWorld);
		
		// Example four
		String world = String.format("|%20s|", "Titan"); // gives the string a width of 20 points
		System.out.println(world);
		
		// Example five
		world = String.format("|%-20s|", "Titan"); // left-justifies the String
		System.out.println(world);
		
		// Example six
		String money = String.format("%,d", 10000000); // formats the number to locale-specific thousands separator
		System.out.println(money);
		
		// Example seven
		System.out.printf("Decimal number with 2 decimal places %.2f%n", 2.34562836746); // rounds the number to decimal places
	}

}
