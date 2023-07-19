package testquestions;
/*Rotten Oranges
Send Feedback
You are given a 2D array of integers of size N * M. Each of the cell contains either of these 3 integers: 0, 1, 2. The integer 2 denotes a rotten orange, 1 denotes a fresh orange and 0 denotes an empty cell.
Each rotten orange can rot fresh oranges in 4 adjacent cells in 1 unit of time. The 4 cells are left, right, top and bottom cell.
For a given matrix, find the minimum units of time in which all oranges become rot. Return -1, if it is not possible.
Input Format:
The first line of input contains 2 space separated integers, N and M, that denotes size of given 2D array.
The following N lines contains M space separated integers, that denotes the value of cells of given 2D array.
Constraints:
Value of N and M lies in the range: [1, 10000].
Value of each cell in 2D array can be either 0, 1 or 2.
Output Format:
Print the required integer, as described in the problem description.   
Sample Input 1:
3 5
2 1 0 2 1
1 0 1 2 1
1 0 0 2 1
Sample Output 1:
2
Explanation:
 In the first unit of time, fresh oranges at coordinates: (0, 1), (0, 4), (1, 0), (1, 2), (1, 4), (2, 4).
 In the second unit of time, fresh orange at coordinate: (2, 0) gets rot. Hence, in 2 units of time, all the fresh oranges become rot.
Sample Input 2:
3 5
2 1 0 2 1
1 0 1 0 1
1 0 0 0 2
Sample Output 2:
-1
Explanation:
It is impossible to rot the fresh orange at (1, 2).  */
import java.util.*;

public class RottenOranges {
	static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static int rottenOranges(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int freshOranges = 0;

        // Find the initial rotten oranges and count the fresh oranges
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }

        // If there are no fresh oranges, return 0
        if (freshOranges == 0) {
            return 0;
        }

        int time = -1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean flag = false; // Flag to indicate if any fresh oranges were rotten in this round

            while (size-- > 0) {
                int[] orange = queue.poll();
                int x = orange[0];
                int y = orange[1];

                // Check adjacent cells
                for (int i = 0; i < 4; i++) {
                    int newX = x + dx[i];
                    int newY = y + dy[i];

                    // Check if the adjacent cell is a valid position
                    if (newX >= 0 && newX < rows && newY >= 0 && newY < cols && grid[newX][newY] == 1) {
                        grid[newX][newY] = 2; // Mark the fresh orange as rotten
                        queue.offer(new int[]{newX, newY}); // Enqueue the rotten orange
                        freshOranges--; // Decrement the count of fresh oranges
                        flag = true;
                    }
                }
            }

            time++;

            // If no fresh oranges were rotten in this round, exit the loop
            if (!flag) {
                break;
            }
        }

        // If there are still fresh oranges remaining, it is not possible to rot them all
        if (freshOranges > 0) {
            return -1;
        }

        return time;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the 2D array
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] grid = new int[rows][cols];

        // Read the elements of the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        // Call the rottenOranges method to get the result
        int result = rottenOranges(grid);

        // Print the result
        System.out.println(result);

        scanner.close();
    }}
