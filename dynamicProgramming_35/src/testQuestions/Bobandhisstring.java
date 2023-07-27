package testQuestions;
/*Bob and his string
Send Feedback
King Bob is in playful mood today. He started playing with string S. As he was playing, a weird question came in his mind. He wondered what is the maximum number of characters, between any two same characters in the string. He needs your help in solving this question. Can you help him solve this question?
Note: String S is composed of lowercase letters of the Latin alphabet. If there are no two same characters in the string, print -1.
Input Format:
The first line of input contains one integer T, denoting the number of test cases. 
Each of the next T line contains one string S.
Constraints:
1 < T < 10
1 < |S| < 100000, where S determines the length of the string.
String is composed of lowercase alphabets ranging from a to z.
Time limit : 1 sec
Output Format:
For each test case, output the maximum number of characters between any two same characters in the string. If there are no two same characters in the string, print -1. 
Print answer for each test case in a new line.
Sample Input 1:
2
aba
babcddc
Sample Output 1:
1
2
Explanation:
1) For string = aba
There is only one character between 2 occurrences of a.

2) For string = babcddc
There is one character between 2 occurrences of b, and 2 characters between 2 occurrences of c. So the answer is 2.*/

	import java.util.Scanner;

	public class Bobandhisstring {


		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int t = scanner.nextInt();
		        scanner.nextLine(); // Consume the newline after integer input

		        for (int i = 0; i < t; i++) {
		            String s = scanner.nextLine().trim(); // Trim the input string to remove leading/trailing spaces
		            int result = findMaxDistanceBetweenSameCharacters(s);
		            System.out.println(result);
		        }

		        scanner.close();
		    }

		    private static int findMaxDistanceBetweenSameCharacters(String s) {
		        int maxDistance = -1;
		        int[] lastIndex = new int[26]; // To store the last index of each character (assuming all lowercase letters)

		        for (int i = 0; i < 26; i++) {
		            lastIndex[i] = -1; // Initialize the lastIndex array
		        }

		        for (int i = 0; i < s.length(); i++) {
		            char ch = s.charAt(i);
		            int index = ch - 'a'; // Map character to an index from 0 to 25

		            if (lastIndex[index] != -1) {
		                int distance = i - lastIndex[index] - 1;
		                maxDistance = Math.max(maxDistance, distance);
		            } else {
		                lastIndex[index] = i;
		            }
		        }

		        return maxDistance;
		    }
		}
