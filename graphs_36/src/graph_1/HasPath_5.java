package graph_1;
/*Has Path?
Send Feedback
Given an undirected graph G(V, E) and two vertices v1 and v2 (as integers), check if there exists any path between them or not. Print true if the path exists and false otherwise.
Note:
1. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1. 
2. E is the number of edges present in graph G.
Input Format :
The first line of input contains two integers, that denote the value of V and E.
Each of the following E lines contains two integers, that denote that there exists an edge between vertex 'a' and 'b'.
The following line contain two integers, that denote the value of v1 and v2.
Output Format :
The first and only line of output contains true, if there is a path between v1 and v2 and false otherwise.
Constraints :
0 <= V <= 1000
0 <= E <= 1000
0 <= a <= V - 1
0 <= b <= V - 1
0 <= v1 <= V - 1
0 <= v2 <= V - 1
Time Limit: 1 second
Sample Input 1 :
4 4
0 1
0 3
1 2
2 3
1 3
Sample Output 1 :
true
Sample Input 2 :
6 3
5 3
0 1
3 4
0 3
Sample Output 2 :
false*/
import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class HasPath_5 {

	    // Function to check if there is a path between v1 and v2 using BFS
	    public static boolean hasPath(int[][] graph, int V, int v1, int v2) {
	        boolean[] visited = new boolean[V];
	        Queue<Integer> queue = new LinkedList<>();

	        // Start BFS from vertex v1
	        queue.add(v1);
	        visited[v1] = true;

	        while (!queue.isEmpty()) {
	            int currentVertex = queue.poll();

	            // If v2 is reached, there is a path
	            if (currentVertex == v2) {
	                return true;
	            }

	            // Traverse all adjacent vertices of the current vertex
	            for (int i = 0; i < V; i++) {
	                if (graph[currentVertex][i] == 1 && !visited[i]) {
	                    queue.add(i);
	                    visited[i] = true;
	                }
	            }
	        }

	        // If no path is found from v1 to v2
	        return false;
	    }

	    public static void main(String[] args) throws NumberFormatException, IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String[] VE = br.readLine().split(" ");
	        int V = Integer.parseInt(VE[0]); // Number of vertices
	        int E = Integer.parseInt(VE[1]); // Number of edges

	        int[][] graph = new int[V][V];

	        for (int i = 0; i < E; i++) {
	            String[] edgeInput = br.readLine().split(" ");
	            int a = Integer.parseInt(edgeInput[0]);
	            int b = Integer.parseInt(edgeInput[1]);
	            graph[a][b] = 1;
	            graph[b][a] = 1; // Since it's an undirected graph
	        }

	        String[] vertices = br.readLine().split(" ");
	        int v1 = Integer.parseInt(vertices[0]); // Vertex 1
	        int v2 = Integer.parseInt(vertices[1]); // Vertex 2

	        boolean hasPath = hasPath(graph, V, v1, v2);
	        System.out.println(hasPath);
	    }
	}

