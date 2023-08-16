package skillTestJava;
/*Matrix Gym
Ninja has put on some extra weight during lockdown. He has decided to join a gym to shed this extra weight off. He joined the Matrix Gym, where the trainer has planned an elaborate exercise for him. It is upto Ninja to decide how many calories he wants to burn during his workout, whereas the trainer designs the exercise. The basic idea of each day remains the same. Ninja has to perform his exercise by crossing his Matrix Gym, which is a 2-D Grid consisting of hurdle cells (represented by “ # ”) and clear cells (represented by “ . “ ). He has to avoid the hurdles, and by entering each clear cell he burns 5 calories. He begins from the top-left corner of the grid. It is given that starting position has no hurdle. He has to reach the bottom-right cell which is also hurdle free. You have to find out if a path exists through which Ninja can burn his decided amount of calories. Ninja can take only one step at a time. Also, when Ninja is standing at (i, j), he can move to (i, j+1) and (i+1, j) only (right and bottom cells). If such a path is possible, print “Yes”, otherwise print “No”. If more than one path is present in the gym through which the calories can be burnt, find the path which burns the maximum calories, and print the extra amount of calories burnt by Ninja.
Input Format:
The first line of input contains an integer N which denotes the number of rows in the grid. 
The following line of input contains N space separated strings deciding the structure of hurdle and clear cells in the grid
The third line contains the number of calories to be burnt.
Constraints:
1 <= N <= 10^5
1 <= calories <= 10^5
Output Format:
For each query, you have to print “Yes” along with additional calories burnt (if any) if the path is found, otherwise you have to print “No”.
Sample Input 1:
3
..## #.## #...
15
Sample Output 1:
Yes 10
Explanation:
For the given input the grid formed is [ ‘..##’ , ‘#.##’ , ‘#...’ ]
For this grid, Ninja can easily travel from cell (0,0) which is his starting point, till cell (2,3) which is his end point, and burn 25 calories in the process.
He had decided to burn 15 calories. Hence additional calories burnt are 25-15 = 10
Sample Input 2:
4
...## .#..# .##.# ..#..
30
Sample Output 2:
Yes 5
Explanation:
For the given input the grid formed is [ ‘...##’ , ‘.#..#’ , ‘.##.#’ , ‘..#..’ ]. 
For this grid, Ninja can easily travel from cell (0,0) which is his starting point, till cell (3,4) which is his end point, and burn 25 calories in the process.
He had decided to burn 15 calories. Hence additional calories burnt are 35-30 = 5
Sample Input 3:
4
...## .#..# .##.# ..#..
35
Sample Output 3:
Yes 
Explanation:
For the given input the grid formed is [ ‘...##’ , ‘.#..#’ , ‘.##.#’ , ‘..#..’ ]
For this grid, Ninja can easily travel from cell (0,0) which is his starting point, till cell (3,4) which is his end point, and burn 25 calories in the process.
He had decided to burn 15 calories. Hence additional calories burnt are 35-35 = 0*/
public class MatrixGym {

}
/*import java.util.Scanner;
import java.util.InputMismatchException;

class Solution {
 public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // Read the number of rows
            int n = scanner.nextInt();
            scanner.nextLine();

            // Read the grid
            String[] grid = new String[n];
            for (int i = 0; i < n; i++) {
                grid[i] = scanner.next();
            }

            // Read the target calories
            int targetCalories = scanner.nextInt();

            // Find the path and print the result
            String result = findPath(grid, targetCalories);
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input format");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static String findPath(String[] grid, int targetCalories) {
        int n = grid.length;
        int m = grid[0].length();

        // Create a 2D grid to store the maximum calories burned at each cell
        int[][] maxCalories = new int[n][m];

        // Initialize the first cell with 0 calories burned
        maxCalories[0][0] = 0;

        // Calculate the maximum calories burned for each cell
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Skip the first cell (0, 0)
                if (i == 0 && j == 0) {
                    continue;
                }

                // If the current cell is a hurdle, set the max calories burned to 0
                if (grid[i].charAt(j) == '#') {
                    maxCalories[i][j] = 0;
                } else {
                    // Calculate the max calories burned by adding the max of the cell above and left
                    maxCalories[i][j] = Math.max(
                            i > 0 ? maxCalories[i - 1][j] : 0,
                            j > 0 ? maxCalories[i][j - 1] : 0
                    ) + 5;
                }
            }
        }

        // Check if the maximum calories burned at the bottom-right cell is >= target calories
        if (maxCalories[n - 1][m - 1] >= targetCalories) {
            int extraCalories = maxCalories[n - 1][m - 1] - targetCalories;
    if(extraCalories > 0){
                  return "Yes " + extraCalories;
    }else{
        return "Yes";
    }
  
        } else {
            return "No";
        }
    }
}*/