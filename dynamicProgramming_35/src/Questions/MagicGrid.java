package Questions;
/*Magic Grid
Send Feedback
You are given a magic grid A with R rows and C columns. In the cells of the grid, you will either get magic juice, which increases your strength by |A[i][j]| points, or poison, which takes away |A[i][j]| strength points. If at any point of the journey, the strength points become less than or equal to zero, then you will die.
You have to start from the top-left corner cell (1,1) and reach at the bottom-right corner cell (R,C). From a cell (i,j), you can only move either one cell down or right i.e., to cell (i+1,j) or cell (i,j+1) and you can not move outside the magic grid. You have to find the minimum number of strength points with which you will be able to reach the destination cell.
Input format:
The first line contains the number of test cases T. T cases follow. Each test case consists of R C in the first line followed by the description of the grid in R lines, each containing C integers. Rows are numbered 1 to R from top to bottom and columns are numbered 1 to C from left to right. Cells with A[i][j] < 0 contain poison, others contain magic juice.
Output format:
Output T lines, one for each case containing the minimum strength you should start with from the cell (1,1) to have a positive strength through out his journey to the cell (R,C).
Constraints:
1 ≤ T ≤ 5
2 ≤ R, C ≤ 500
-10^3 ≤ A[i][j] ≤ 10^3
A[1][1] = A[R][C] = 0
Time Limit: 1 second
Sample Input 1:
3
2 3
0 1 -3
1 -2 0
2 2
0 1
2 0
3 4
0 -2 -3 1
-1 4 0 -2
1 -2 -3 0
Sample Output 1:
2
1
2*/
public class MagicGrid {

    public static int getMinimumStrength(int[][] grid) {
        int rows = grid.length;
          int cols = grid[0].length;

          int[][] dp = new int[rows][cols];

          // Initialize the bottom-right cell's value to 1 (minimum required strength to survive there)
          dp[rows - 1][cols - 1] = 1;

          // Calculate minimum strength required for the last row (bottom row)
          for (int j = cols - 2; j >= 0; j--) {
              dp[rows - 1][j] = Math.max(dp[rows - 1][j + 1] - grid[rows - 1][j + 1], 1);
          }

          // Calculate minimum strength required for the last column (rightmost column)
          for (int i = rows - 2; i >= 0; i--) {
              dp[i][cols - 1] = Math.max(dp[i + 1][cols - 1] - grid[i + 1][cols - 1], 1);
          }

          // Calculate minimum strength required for remaining cells using dynamic programming
          for (int i = rows - 2; i >= 0; i--) {
              for (int j = cols - 2; j >= 0; j--) {
                  int requiredRight = Math.max(dp[i][j + 1] - grid[i][j + 1], 1);
                  int requiredDown = Math.max(dp[i + 1][j] - grid[i + 1][j], 1);
                  dp[i][j] = Math.min(requiredRight, requiredDown);
              }
          }

          // Minimum strength required to reach the bottom-right cell from the top-left cell
          return Math.max(dp[0][0] - grid[0][0], 1);
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

        int t = Integer.parseInt(br.readLine().trim());
        while (t!=0){
            int[][] grid = takeInput();
            System.out.println(Solution.getMinimumStrength(grid));
            t--;
        }

	}
}*/
