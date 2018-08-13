package example_eight;

import java.util.StringJoiner;

public class ExampleEight {

	public static void main(String[] args) {

		//Example One
		// Passing Hyphen(-) as delimiter
        StringJoiner xmen = new StringJoiner("-");    
          
        // Joining multiple strings by using add() method  
        xmen.add("Logan");  
        xmen.add("Magneto");  
        xmen.add("Rogue");  
        xmen.add("Storm");  
                  
        // Displaying the output String
        System.out.println(xmen);
        
        // Example Two
        /* Passing comma(,) as delimiter and opening bracket
    	 * "(" as prefix and closing bracket ")" as suffix
    	 */
        StringJoiner walkingDeadCrew = new StringJoiner(",", "(", ")");    
          
        // Joining multiple strings by using add() method  
        walkingDeadCrew.add("Negan");  
        walkingDeadCrew.add("Rick");  
        walkingDeadCrew.add("Maggie");  
        walkingDeadCrew.add("Daryl");  
                  
        // Displaying the output String
        System.out.println(walkingDeadCrew);
        
        // Example three
        /* Passing hyphen(-) as delimiter and string "pre"
    	 * as prefix and string "suff" as suffix
    	 */
    	StringJoiner walkingDeadCrewTwo = new StringJoiner("-", "start ", " end");    

    	walkingDeadCrewTwo.add("Sansa");  
    	walkingDeadCrewTwo.add("Imp");  
    	walkingDeadCrewTwo.add("Jon");  
    	walkingDeadCrewTwo.add("Ned"); 

    	System.out.println("Second String: " + walkingDeadCrewTwo);

    	/* Merging both the strings  
    	 * The important point to note here is that the output string will be 
    	 * having the delimiter prefix and suffix of the first string (the string
    	 * which is calling the merge method of StringJoiner)
    	 */
    	StringJoiner mergedCrew = walkingDeadCrew.merge(walkingDeadCrewTwo);   
    	System.out.println(mergedCrew);
	}

}
