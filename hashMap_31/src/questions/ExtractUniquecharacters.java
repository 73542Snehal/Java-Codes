package questions;
/*Extract Unique characters
Send Feedback
Given a string S, you need to remove all the duplicates. That means, the output string should contain each character only once. The respective order of characters should remain same, as in the input string.
Input format:
The first and only line of input contains a string, that denotes the value of S.
Output format :
The first and only line of output contains the updated string, as described in the task.
Constraints :
0 <= Length of S <= 10^8
Time Limit: 1 sec
Sample Input 1 :
ababacd
Sample Output 1 :
abcd
Sample Input 2 :
abcde
Sample Output 2 :
abcde*/
import java.util.*;

public class ExtractUniquecharacters {

	public static String uniqueChar(String str){
		 StringBuilder result = new StringBuilder();
	        HashMap<Character, Boolean> visited = new HashMap<>();

	        for (int i = 0; i < str.length(); i++) {
	            char currentChar = str.charAt(i);
	            if (!visited.containsKey(currentChar)) {
	                visited.put(currentChar, true);
	                result.append(currentChar);
	            }
	        }

	        return result.toString();
	    }
}

/* static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static String takeInput() throws IOException {
        String str = br.readLine(); 
        return str;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {


        String str = takeInput();
        System.out.print(Solution.uniqueChar(str));


    }*/
