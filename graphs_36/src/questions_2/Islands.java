package questions_2;
/*Islands
Send Feedback
An island is a small piece of land surrounded by water . A group of islands is said to be connected if we can reach from any given island to any other island in the same group . Given V islands (numbered from 0 to V-1) and E connections or edges between islands. Can you count the number of connected groups of islands.
Input Format :
The first line of input contains two integers, that denote the value of V and E.
Each of the following E lines contains two integers, that denote that there exists an edge between vertex a and b. 
Output Format :
Print the count the number of connected groups of islands
Constraints :
0 <= V <= 1000
0 <= E <= (V * (V-1)) / 2
0 <= a <= V - 1
0 <= b <= V - 1
Time Limit: 1 second
Sample Input 1:
5 8
0 1
0 4
1 2
2 0
2 4
3 0
3 2
4 3
Sample Output 1:
1 */
public class Islands {
	 public static int numConnected(int[][] edges, int n) {
	        boolean[] visited = new boolean[n];
	        int count = 0;

	        for (int i = 0; i < n; i++) {
	            if (!visited[i]) {
	                dfs(i, edges, visited);
	                count++;
	            }
	        }

	        return count;
	    }

	    public static void dfs(int vertex, int[][] edges, boolean[] visited) {
	        visited[vertex] = true;

	        for (int neighbor = 0; neighbor < edges.length; neighbor++) {
	            if (edges[vertex][neighbor] == 1 && !visited[neighbor]) {
	                dfs(neighbor, edges, visited);
	            }
	        }
	    }
	}
/*import java.util.Scanner;
import java.io.IOException;

public class Runner {

    static Scanner sc = new Scanner(System.in);

    public static int[][] takeInput() throws IOException {
		String[] strNums;
        strNums = sc.nextLine().split("\\s");
        int n = Integer.parseInt(strNums[0]);
        int e = Integer.parseInt(strNums[1]);

        int[][] edges = new int[n][n];
        int firstvertex, secondvertex;

        for (int i = 0; i < e; i++) {
            String[] strNums1;
            strNums1 = sc.nextLine().split("\\s");
            firstvertex = Integer.parseInt(strNums1[0]);
            secondvertex = Integer.parseInt(strNums1[1]);
            edges[firstvertex][secondvertex] = 1;
            edges[secondvertex][firstvertex] = 1;
        }
        return edges;
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        int [][]edges = takeInput();
        
        int ans = Solution.numConnected(edges, edges.length);
        System.out.println(ans);
		
	}
}*/