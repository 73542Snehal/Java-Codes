package DijkstrasAlgorithm_5;
/*Code : Dijkstra's Algorithm
Send Feedback
Given an undirected, connected and weighted graph G(V, E) with V number of vertices (which are numbered from 0 to V-1) and E number of edges.
Find and print the shortest distance from the source vertex (i.e. Vertex 0) to all other vertices (including source vertex also) using Dijkstra's Algorithm.
Input Format :
Line 1: Two Integers V and E (separated by space)
Next E lines : Three integers ei, ej and wi, denoting that there exists an edge between vertex ei and vertex ej with weight wi (separated by space)
Output Format :
For each vertex, print its vertex number and its distance from source, in a separate line. The vertex number and its distance needs to be separated by a single space.
Note : Order of vertices in output doesn't matter.
Constraints :
2 <= V, E <= 10^5
Time Limit: 1 sec
Sample Input 1 :
4 4
0 1 3
0 3 5
1 2 1
2 3 8
Input Graph

Sample Output 1 :
0 0
1 3
2 4
3 5


Input Graph*/
import java.util.Scanner;

public class DijkstrasAlgorithm {
	
	public static int findminVertex(boolean[] visited, int[] distance) {
		int minVertex = -1;
		for(int i=0; i<visited.length; i++) {
			if(!visited[i] && (minVertex == -1 || distance[i] < distance[minVertex])) {
				minVertex = i;
			}
		}  
		return minVertex;
	}
	
	public static void dijkstras(int[][] adjMatrix) {
		int n = adjMatrix.length;
		boolean visited[] = new boolean[n];
		int distance[] = new int[n];
		distance[0] = 0;
		for(int i=1; i<n; i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		for(int i=1; i<n-1; i++) {
			int minVertex = findminVertex(visited,distance);
			visited[minVertex] = true;
			for(int j=0; j<n; j++) {
				if(adjMatrix[minVertex][j]>0 && !visited[j] && adjMatrix[minVertex][j] < Integer.MAX_VALUE) {
				//j is unvisited neighbor of minvertex
				//calculate distance to reach j from source via minvertex
					
				int newDistance = distance[minVertex] + adjMatrix[minVertex][j];
				if(newDistance < distance[j]) {
					distance[j] = newDistance;
				}
				}
			}
		}
		//print distance values for all vertices
		 for(int i=0; i<n; i++) {
				 System.out.println(i+" "+distance[i]);
		 }
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); //no of vertices
		int e = sc.nextInt(); //no of edges

		int adjMatrix[][] = new int[n][n];
		  
		for(int i=0; i<e; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int weight = sc.nextInt();
			adjMatrix[v1][v2] = weight;
			adjMatrix[v2][v1] = weight;
		}
		
		dijkstras(adjMatrix);
	}
}
/*
Input:
5 8
0 1 4
0 2 8
1 2 2
1 3 6
1 4 8
2 3 3
2 4 5
3 4 7
Output:
0 0
1 4
2 6
3 9
4 11
 
 */
