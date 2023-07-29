package questions_2;
/*Coding Ninjas
Send Feedback
Given a NxM matrix containing Uppercase English Alphabets only. Your task is to tell if there is a path in the given matrix which makes the sentence “CODINGNINJA” .
There is a path from any cell to all its neighbouring cells. For a particular cell, neighbouring cells are those cells that share an edge or a corner with the cell.
Input Format :
The first line of input contains two space separated integers N and M, where N is number of rows and M is the number of columns in the matrix. 
Each of the following N lines contain M characters. Please note that characters are not space separated.
Output Format :
Print 1 if there is a path which makes the sentence “CODINGNINJA” else print 0.
Constraints :
1 <= N <= 1000
1 <= M <= 1000
Time Limit: 1 second
Sample Input 1:
2 11
CXDXNXNXNXA
XOXIXGXIXJX
Sample Output 1:
1*/
public class CodingNinjas {

	    int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
	    int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1 };

	    boolean dfs(char[][] matrix, int row, int col, String target, int index) {
	        if (index == target.length()) {
	            return true;
	        }

	        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length || matrix[row][col] != target.charAt(index)) {
	            return false;
	        }

	        char original = matrix[row][col];
	        matrix[row][col] = '#'; // Mark the cell as visited

	        for (int i = 0; i < 8; i++) {
	            if (dfs(matrix, row + dx[i], col + dy[i], target, index + 1)) {
	                matrix[row][col] = original; // Restore the cell value before backtracking
	                return true;
	            }
	        }

	        matrix[row][col] = original; // Restore the cell value after backtracking
	        return false;
	    }

	    int solve(String[] Graph, int N, int M) {
	        char[][] matrix = new char[N][M];

	        for (int i = 0; i < N; i++) {
	            matrix[i] = Graph[i].toCharArray();
	        }

	        String target = "CODINGNINJA";

	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < M; j++) {
	                if (matrix[i][j] == 'C' && dfs(matrix, i, j, target, 0)) {
	                    return 1; // Found a path, return 1
	                }
	            }
	        }

	        return 0; // No path found, return 0
	    }
	}
/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static String[] takeInput() throws IOException {
		String[] strNums;
        strNums = br.readLine().split("\\s");
        int size = 2;
        int[] input = new int[size];
        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }


		String[] Graph = new String[input[0]];
		
        for (int i = 0; i < input[0]; ++i) {
            Graph[i] = br.readLine();
        }

        return Graph;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {


        String[] Graph = takeInput();
        System.out.println(new Solution().solve(Graph,Graph.length,Graph[0].length()));


    }
}*/
