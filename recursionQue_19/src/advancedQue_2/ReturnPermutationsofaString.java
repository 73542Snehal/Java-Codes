package advancedQue_2;
/*Return Permutations of a String
Send Feedback
Given a string, find and return all the possible permutations of the input string.
Note :
The order of permutations are not important.
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

public class ReturnPermutationsofaString {
	 public static String[] permutationOfString(String input) {
	        List<String> permutations = new ArrayList<>();
	        generatePermutations(input.toCharArray(), 0, permutations);

	        String[] result = new String[permutations.size()];
	        for (int i = 0; i < permutations.size(); i++) {
	            result[i] = permutations.get(i);
	        }

	        return result;
	    }

	    private static void generatePermutations(char[] input, int index, List<String> permutations) {
	        if (index == input.length) {
	            permutations.add(new String(input));
	            return;
	        }

	        for (int i = index; i < input.length; i++) {
	            swap(input, index, i);
	            generatePermutations(input, index + 1, permutations);
	            swap(input, index, i); // backtrack
	        }
	    }

	    private static void swap(char[] input, int i, int j) {
	        char temp = input[i];
	        input[i] = input[j];
	        input[j] = temp;
	    }
}
/*	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String output[] = solution.permutationOfString(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}*/
