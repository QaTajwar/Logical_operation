package logical_operation;

public class Logical_operation_continued {public static void main(String[]args) {
	// Logical operators = need to connect two or more expressions
	/*         && =(AND) both conditions must be true
	 *         || =(OR) either conditions must be true
	 *          ! =(NOT) reverses boolean value of conditions
	 *
	 */

 int temp = 2;		
	
if(temp>25) {
	System.out.println("It's ok outside");
	 }
	
else if(temp>=20 && temp<=30) {
	System.out.println("It's warm outside");
}
	
else {
	System.out.println("It's cold outside");
}
}
}