package example_four;

import java.util.Scanner;

public class ExampleFour {

	public static void main(String[] args) {
		
		// Example one
		String sentence = "Dot saw I was Tod";
		int sentenceLength = sentence.length();
		
		System.out.println(sentenceLength);
		
		// Example two
		/*@SuppressWarnings("resource")
		Scanner keyIn = new Scanner(System.in);
		
		System.out.println("Please enter  a password; password must be over 6 characters");
		String password = keyIn.nextLine();
		
		if (password.length() <= 6) {
			System.out.println("Sorry password is to short!!");
		} else {
			System.out.println("Nice password");
		}*/
		
		// Example Three
		/*String greeting = "Hello";
		char chosenCharacter = greeting.charAt(1);
		
		System.out.println(chosenCharacter);
		
		// Example Four
		char[] characterArray = greeting.toCharArray();
		
		for (int i = 0; i < characterArray.length; i++) {
			System.out.println(characterArray[i]);
		}*/
		
		// Example five
		/*String secondGreeting = "Hello";
		
		System.out.println(greeting.equals(secondGreeting));*/
		
		// Example six
		/*String title = "Game of Thrones";
		
		System.out.println(title.contains("Game"));
		System.out.println(title.contains("aGme"));
		System.out.println(title.contains("e of Thr"));*/
		
		// Example seven
		/*System.out.println(title.startsWith("Game"));
		System.out.println(title.startsWith("Thrones"));*/
		
		// Example eight
		/*String helloString = "Hello darkness my old friend!";
		
		System.out.println(helloString.replace('e', 'x'));*/
		
		// Example nine
		/*System.out.println(helloString.replaceFirst("darkness", "sunshine"));*/
		
		// Example ten
		/*String dogs = "dogs are the best, dogs are just so cute, dogs can just make your doggy day";
		
		System.out.println(dogs.replaceAll("dogs", "dragons"));*/
		
		// Example eleven
		/*String wordsArrayOne[] = dogs.split(" ");
		
		for (String temp : wordsArrayOne) {
			System.out.println(temp);
		}
		
		String wordsArrayTwo[] = dogs.split(" ", 2);
		
		for (String temp : wordsArrayTwo) {
			System.out.println(temp);
		}*/
	}

}
