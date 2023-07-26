package Questions;
/*Maximum Square Matrix With All Zeros
Send Feedback
Given an NxM matrix that contains only 0s and 1s, find out the size of the maximum square sub-matrix with all 0s. You need to return the size of the square matrix with all 0s.
Input format :
The first line of the test case contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively.

Second-line onwards, the next 'N' lines or rows represent the ith row values.

Each of the ith rows constitutes column values separated by a single space (Either 0 or 1).
Output Format:
Print the size of maximum square sub-matrix.
 Constraints :
0 <= N <= 10^4
0 <= M <= 10^4

Time Limit: 1 sec
Sample Input 1:
3 3
1 1 0
1 1 1
1 1 1
Sample Output 1:
1
Sample Input 2:
4 4
0 0 0 0
0 0 0 0
0 0 0 0
0 0 0 0
Sample Output 2:
4*/
public class MaximumSquareMatrixWithAllZeros {
	public static int findMaxSquareWithAllZeros(int[][] input){
        if (input == null || input.length == 0 || input[0].length == 0) {
        return 0; // Return 0 when the input array is empty or has no rows/columns
    }
 
        int n = input.length;
        int m = input[0].length;
        int[][] dp = new int[n][m];
        int maxSize = 0;
        boolean allZeros = true;

        // Check if the entire matrix is filled with zeros
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (input[i][j] != 0) {
                    allZeros = false;
                    break;
                }
            }
            if (!allZeros) {
                break;
            }
        }

        if (allZeros) {
            return Math.min(n, m); // The size of the square is the smaller dimension
        }

        // Initialize dp array for non-empty matrix
        for (int i = 0; i < n; i++) {
            dp[i][0] = input[i][0];
            maxSize = Math.max(maxSize, dp[i][0]);
        }

        for (int j = 0; j < m; j++) {
            dp[0][j] = input[0][j];
            maxSize = Math.max(maxSize, dp[0][j]);
        }

        // Fill the dp array using dynamic programming approach
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (input[i][j] == 0) {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                    maxSize = Math.max(maxSize, dp[i][j]);
                }
            }
        }

        return maxSize;
    }
}

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int[][] takeInput() throws IOException {

        String[] nm;
        nm = br.readLine().split("\\s");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
		int arr[][]=new int[n][m];

        if (n == 0) {
            return arr;
        }
        

		String[] strNums;
        for (int i = 0; i < n; ++i) {            
            strNums = br.readLine().split("\\s");
            for (int j = 0; j < m; ++j){
                arr[i][j] = Integer.parseInt(strNums[j]);
            }
            
        }

        return arr;
    }

	public static void main(String[] args) throws IOException {

        int[][] arr = takeInput();
		System.out.println(Solution.findMaxSquareWithAllZeros(arr));
	}
}*/
