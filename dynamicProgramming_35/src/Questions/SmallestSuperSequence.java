package Questions;
/*Smallest Super-Sequence
Send Feedback
 Given two strings S and T with lengths M and N. Find and return the length of their shortest 'Super Sequence'.
 The shortest 'Super Sequence' of two strings is defined as the smallest string possible that will have both the given strings as its subsequences.
Note :
If the two strings do not have any common characters, then return the sum of the lengths of the two strings. 
Input Format:
The first only line of input contains a string, that denotes the value of string S. The following line contains a string, that denotes the value of string T.
Output Format:
Length of the smallest super-sequence of given two strings. 
Constraints :
0 <= M <= 10 ^ 3
0 <= N <= 10 ^ 3

Time Limit: 1 sec
Sample Input 1 :
ab
ac
Sample Output 1 :
3
Explanation of Sample Output 1 :
Their smallest super sequence can be "abc" which has length = 3.
Sample Input 2 :
pqqrpt
qerepct
Sample Output 2 :
9*/
public class SmallestSuperSequence {

	public static int smallestSuperSequence(String S, String T) {

		   int M = S.length();
		        int N = T.length();

		        // Create a dp array to store the lengths of the shortest super-sequences
		        int[][] dp = new int[M + 1][N + 1];

		        // Base cases: When one of the strings is empty, the super-sequence is the other string itself
		        for (int i = 0; i <= M; i++) {
		            dp[i][0] = i;
		        }
		        for (int j = 0; j <= N; j++) {
		            dp[0][j] = j;
		        }

		        // Fill the dp array using dynamic programming approach
		        for (int i = 1; i <= M; i++) {
		            for (int j = 1; j <= N; j++) {
		                if (S.charAt(i - 1) == T.charAt(j - 1)) {
		                    dp[i][j] = 1 + dp[i - 1][j - 1];
		                } else {
		                    dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1]);
		                }
		            }
		        }

		        // The length of the shortest super-sequence is stored in dp[M][N]
		        return dp[M][N];
		    }

		    public static void main(String[] args) {
		        // Sample Input 1
		        String S1 = "ab";
		        String T1 = "ac";
		        System.out.println(smallestSuperSequence(S1, T1)); // Output: 3

		        // Sample Input 2
		        String S2 = "pqqrpt";
		        String T2 = "qerepct";
		        System.out.println(smallestSuperSequence(S2, T2)); // Output: 9
		    }
}

/*public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException  {
		String str1 = br.readLine();
		String str2 = br.readLine();
		int min_len = Solution.smallestSuperSequence(str1, str2);
		System.out.print(min_len);
	}*/
