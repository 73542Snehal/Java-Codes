package graph_1;
/*BFS
Send Feedback
Given an undirected and disconnected graph G(V, E), print its BFS traversal.
Note:
1. Here you need to consider that you need to print BFS path starting from vertex 0 only. 
2. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1. 
3. E is the number of edges present in graph G.
4. Take graph input in the adjacency matrix.
5. Handle for Disconnected Graphs as well
Input Format :
The first line of input contains two integers, that denote the value of V and E.
Each of the following E lines contains space separated two integers, that denote that there exists an edge between vertex a and b.
Output Format :
Print the BFS Traversal, as described in the task.
Constraints :
0 <= V <= 1000
0 <= E <= (V * (V - 1)) / 2
0 <= a <= V - 1
0 <= b <= V - 1
Time Limit: 1 second
Sample Input 1:
4 4
0 1
0 3
1 2
2 3
Sample Output 1:
0 1 3 2*/
import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class bfsQuestion_4 {
	
	    public static void bfsTraversal(int[][] graph, int V) {
	        boolean[] visited = new boolean[V];
	        Queue<Integer> queue = new LinkedList<>();

	        for (int startVertex = 0; startVertex < V; startVertex++) {
	            if (!visited[startVertex]) {
	                queue.add(startVertex);
	                visited[startVertex] = true;

	                while (!queue.isEmpty()) {
	                    int currentVertex = queue.poll();
	                    System.out.print(currentVertex + " ");

	                    // Traverse all adjacent vertices of the current vertex
	                    for (int i = 0; i < V; i++) {
	                        if (graph[currentVertex][i] == 1 && !visited[i]) {
	                            queue.add(i);
	                            visited[i] = true;
	                        }
	                    }
	                }
	            }
	        }
	    }

	    public static void main(String[] args) throws IOException {
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

	        bfsTraversal(graph, V);
	    }
	}


