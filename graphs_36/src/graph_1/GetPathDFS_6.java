package graph_1;
/*Get Path - DFS
Send Feedback
Given an undirected graph G(V, E) and two vertices v1 and v2(as integers), find and print the path from v1 to v2 (if exists). Print nothing if there is no path between v1 and v2.
Find the path using DFS and print the first path that you encountered.
Note:
1. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1. 
2. E is the number of edges present in graph G.
3. Print the path in reverse order. That is, print v2 first, then intermediate vertices and v1 at last.
4. Save the input graph in Adjacency Matrix.
Input Format :
The first line of input contains two integers, that denote the value of V and E.
Each of the following E lines contains two integers, that denote that there exists an edge between vertex 'a' and 'b'.
The following line contain two integers, that denote the value of v1 and v2.
Output Format :
Print the path from v1 to v2 in reverse order.
Constraints :
2 <= V <= 1000
1 <= E <= (V * (V - 1)) / 2
0 <= a <= V - 1
0 <= b <= V - 1
0 <= v1 <= 2^31 - 1
0 <= v2 <= 2^31 - 1
Time Limit: 1 second
Sample Input 1:
4 4
0 1
0 3
1 2
2 3
1 3
Sample Output 1:
3 0 1
Sample Input 2:
6 3
5 3
0 1
3 4
0 3
Sample Output 2:*/

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetPathDFS_6 {
    static boolean hasPathDFS(int[][] adjMatrix, int v1, int v2, boolean[] visited, ArrayList<Integer> path) {
	        if (v1 == v2) {
	            path.add(v1);
	            return true;
	        }

	        visited[v1] = true;
	        for (int i = 0; i < adjMatrix.length; i++) {
	            if (adjMatrix[v1][i] == 1 && !visited[i]) {
	                if (hasPathDFS(adjMatrix, i, v2, visited, path)) {
	                    path.add(v1);
	                    return true;
	                }
	            }
	        }

	        return false;
	    }

	    public static void main(String[] args) throws NumberFormatException, IOException {

	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String[] ve = br.readLine().split(" ");
	        int V = Integer.parseInt(ve[0]);
	        int E = Integer.parseInt(ve[1]);

	        int[][] adjMatrix = new int[V][V];
	        for (int i = 0; i < E; i++) {
	            String[] edge = br.readLine().split(" ");
	            int a = Integer.parseInt(edge[0]);
	            int b = Integer.parseInt(edge[1]);
	            adjMatrix[a][b] = 1;
	            adjMatrix[b][a] = 1;
	        }

	        String[] v1v2 = br.readLine().split(" ");
	        int v1 = Integer.parseInt(v1v2[0]);
	        int v2 = Integer.parseInt(v1v2[1]);

	        boolean[] visited = new boolean[V];
	        ArrayList<Integer> path = new ArrayList<>();

	        if (hasPathDFS(adjMatrix, v1, v2, visited, path)) {
	            for (int vertex : path) {
	                System.out.print(vertex + " ");
	            }
	        }
	    }
	}

