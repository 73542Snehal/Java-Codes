package advancedQue_2;
/*Print Permutations of a String
Send Feedback
Given a string, find and print all the possible permutations of the input string.
Note :
The order of permutations are not important. Just print them in different lines.
Sample Input :
abc
Sample Output :
abc
acb
bac
bca
cab
cba*/
import java.util.*;

public class PrintPermutationsofaString {

	 public static void permutations(String input) {
	        generatePermutations(input.toCharArray(), 0);
	    }

	    private static void generatePermutations(char[] input, int index) {
	        if (index == input.length - 1) {
	            System.out.println(new String(input));
	            return;
	        }

	        for (int i = index; i < input.length; i++) {
	            swap(input, index, i);
	            generatePermutations(input, index + 1);
	            swap(input, index, i); // backtrack
	        }
	    }

	    private static void swap(char[] input, int i, int j) {
	        char temp = input[i];
	        input[i] = input[j];
	        input[j] = temp;
	    }
	        
	    	public static void main(String[] args) {
	    		Scanner s = new Scanner(System.in);
	    		String input = s.nextLine();
	    		permutations(input);
	    	}
}
