package advancedRecursionQue;
import java.util.*;

/*Print Keypad Combinations Code
Send Feedback
Given an integer n, using phone keypad find out and print all the possible strings that can be made using digits of input n.
Note :
The order of strings are not important. Just print different strings in new lines.
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
public class printKeypad {
	
	private static final String[] KEYPAD_MAPPING = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };



	public static void printKeypad(int input) {
		printKeypadHelper(input, "");
	}

	private static void printKeypadHelper(int input, String output) {
		// Base case: if input number becomes 0, print the generated string
		if (input == 0) {
			System.out.println(output);
			return;
		}

		// Get the last digit of the input number
		int lastDigit = input % 10;

		// Get the corresponding characters for the current digit
		String characters = KEYPAD_MAPPING[lastDigit];

		// Iterate through each character and append it to the output string
		for (int i = 0; i < characters.length(); i++) {
			char c = characters.charAt(i);
			printKeypadHelper(input / 10, c + output);
		}
	}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		printKeypad(input);
	}
}
/*public class Keypad {
public static String getOptions(int digit) {
if(digit == 2) {
return "abc";
}
if(digit == 3) {
return "def";
}
if(digit == 4) {
return "ghi";
}
if(digit == 5) {
return "jkl";
}
if(digit == 6) {
return "mno";
}
if(digit == 7) {
return "pqrs";
}
if(digit == 8) {
return "tuv";
}
return "wxyz";
}
public static void printKeypadCombinations(int input, String stringSoFar) {
if(input == 0) {
System.out.println(stringSoFar);
return;
}
int lastDigit = input % 10;
String optionsLastDigits = getOptions(lastDigit);
for(int i=0; i<optionsLastDigits.length(); i++) {
printKeypadCombinations(smallInput, optionsLastDigit.charAt(i) + stringSoFar);
}
}
public static void main(Sting[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Enter Number");
int input = s.nextInt();
printKeypadCombinations(input, "");
}
}*/