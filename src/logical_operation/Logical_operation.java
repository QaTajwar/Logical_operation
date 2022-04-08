package logical_operation;

import java.util.Scanner;

public class Logical_operation { public static void main(String[]args) {
	
	// Logical operators = need to connect two or more expressions
				/*         && =(AND) both conditions must be true
				 *         || =(OR) either conditions must be true
				 *          ! =(NOT) reverses boolean value of conditions
				 *
				 */
		
		
			Scanner scanner = new Scanner(System.in);
		
			
			System.out.println("You are playing a game! Press q or Q to quit");
			String response = scanner.next();
			
			if( response.equals("q") ||  response.equals("Q")) {
			System.out.println("You quit the game");	      // only for ! change || to && code will work 100%
			}
			else {
				System.out.println("Starting Game");      // change/update the string() 
			}
	
	
	
	
}

}
