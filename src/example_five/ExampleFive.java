package example_five;

public class ExampleFive {

	public static void main(String[] args) {
		
		// Example one
		String title = "Avengers";
		
		System.out.println(title);
		
		title = title.concat(" Infinity");
		
		System.out.println(title);
		
		title = title.concat(" War");
		
		System.out.println(title);
		
		// Example two
		System.out.println("Avengers" + " Infinity" + " War");
		
		
		// Example three
		String strOne = "Avengers";
		String strTwo = " Infinity";
		String strThree = " War";
		
		System.out.println(strOne + strTwo + strThree);
	}
}
