package questions_2;
/*Largest Piece
Send Feedback
It's Gary's birthday today and he has ordered his favourite square cake consisting of '0's and '1's . But Gary wants the biggest piece of '1's and no '0's . A piece of cake is defined as a part which consist of only '1's, and all '1's share an edge with each other on the cake. Given the size of cake N and the cake, can you find the count of '1's in the biggest piece of '1's for Gary ?
Input Format :
The first line of input contains an integer, that denotes the value of N. 
Each of the following N lines contain N space separated integers.
Output Format :
Print the count of '1's in the biggest piece of '1's, according to the description in the task.
Constraints :
1 <= N <= 1000
Time Limit: 1 sec
Sample Input 1:
2
1 1
0 1
Sample Output 1:
3*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestPiece {
	
	static int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
	   public static int dfs(String[] edge, int n) {
	        int maxPiece = 0;
	        boolean[][] visited = new boolean[n][n];
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (edge[i].charAt(j) == '1' && !visited[i][j]) {
	                    int currentPiece = explorePiece(edge, n, i, j, visited);
	                    maxPiece = Math.max(maxPiece, currentPiece);
	                }
	            }
	        }
	        return maxPiece;
	    }
	    
	    public static int explorePiece(String[] edge, int n, int row, int col, boolean[][] visited) {
	        if (row < 0 || row >= n || col < 0 || col >= n || edge[row].charAt(col) == '0' || visited[row][col]) {
	            return 0;
	        }
	        
	        visited[row][col] = true;
	        int size = 1;
	        
	        for (int[] d : dir) {
	            int newRow = row + d[0];
	            int newCol = col + d[1];
	            size += explorePiece(edge, n, newRow, newCol, visited);
	        }
	        
	        return size;
	    }
	
}
	
	/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static String[] takeInput() throws IOException {
        int n = Integer.parseInt(br.readLine().trim());
        

        String[] edge = new String[n];
        for (int i = 0; i < n; i++) {
            edge[i] = br.readLine().replaceAll("\\s", "");
        }
        return edge;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        String[] edge = takeInput();
        int ans = Solution.dfs(edge,edge.length);
        System.out.println(ans);   
    }	
}*/
