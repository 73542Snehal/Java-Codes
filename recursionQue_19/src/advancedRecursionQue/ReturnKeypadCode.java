package advancedRecursionQue;
/*Return Keypad Code
Send Feedback
Given an integer n, using phone keypad find out all the possible strings that can be made using digits of input n.
Return empty string for numbers 0 and 1.
Note :
1. The order of strings are not important.
2. Input and output has already been managed for you. You just have to populate the output array and return the count of elements populated in the output array.
Input Format :
Integer n
Output Format :
All possible strings in different lines
Constraints :
1 <= n <= 10^6
Sample Input:
23
Sample Output:
ad
ae
af
bd
be
bf
cd
ce
cf*/
import java.util.*;

public class ReturnKeypadCode {

	private static final String[] KEYPAD = {
	        "",     // 0
	        "",     // 1
	        "abc",  // 2
	        "def",  // 3
	        "ghi",  // 4
	        "jkl",  // 5
	        "mno",  // 6
	        "pqrs", // 7
	        "tuv",  // 8
	        "wxyz"  // 9
	    };

	    public static String[] keypad(int n) {
	        // Base case: Return empty array for numbers 0 and 1
	        if (n == 0 || n == 1) {
	            String[] result = {""};
	            return result;
	        }

	        // Get the last digit of the number
	        int lastDigit = n % 10;

	        // Recursively find all possible strings for the remaining number
	        String[] remaining = keypad(n / 10);

	        // Get the characters corresponding to the last digit
	        String keypadChars = KEYPAD[lastDigit];

	        // Create an array to store the result
	        String[] result = new String[keypadChars.length() * remaining.length];
	        int k = 0;

	        // For each character corresponding to the last digit
	        for (int i = 0; i < keypadChars.length(); i++) {
	            // For each string obtained from the remaining number
	            for (int j = 0; j < remaining.length; j++) {
	                // Append the current character to each string
	                result[k] = remaining[j] + keypadChars.charAt(i);
	                k++;
	            }
	        }

	        return result;
	    }
	    
	    public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int input = s.nextInt();
			String output[] = keypad(input);
			for(int i = 0; i < output.length; i++) {
				System.out.println(output[i]);
			}
}}
