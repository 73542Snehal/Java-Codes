package Questions;
/*Edit Distance
Send Feedback
You are given two strings S and T of lengths M and N, respectively. Find the 'Edit Distance' between the strings.
Edit Distance of two strings is the minimum number of steps required to make one string equal to the other. In order to do so, you can perform the following three operations:
1. Delete a character
2. Replace a character with another one
3. Insert a character
Note :
Strings don't contain spaces in between.
 Input format :
The first line of input contains the string S of length M.

The second line of the input contains the String T of length N.
Output format :
Print the minimum 'Edit Distance' between the strings.
Constraints :
0 <= M <= 10 ^ 3
0 <= N <= 10 ^ 3

Time Limit: 1 sec
Sample Input 1 :
abc
dc
Sample Output 1 :
2
 Explanation to the Sample Input 1 :
 In 2 operations we can make string T to look like string S.
First, insert character 'a' to string T, which makes it "adc".

And secondly, replace the character 'd' of string T with 'b' from the string S. This would make string T as "abc" which is also string S. 

Hence, the minimum distance.
Sample Input 2 :
whgtdwhgtdg
aswcfg
Sample Output 2 :
9*/

import java.util.*;

public class EditDistance {

	public static int editDistance(String s, String t) {
		int m = s.length();
		int n = t.length();

		// Create a 2D array to store the edit distances for subproblems
		int[][] dp = new int[m + 1][n + 1];

		// Initialize the first row and first column with base cases
		for (int i = 0; i <= m; i++) {
			dp[i][0] = i;
		}
		for (int j = 0; j <= n; j++) {
			dp[0][j] = j;
		}

		// Fill the dp array using dynamic programming approach
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (s.charAt(i - 1) == t.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1];
				} else {
					dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
				}
			}
		}

		return dp[m][n];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();


		System.out.println(editDistance(s, t));
	}

}
