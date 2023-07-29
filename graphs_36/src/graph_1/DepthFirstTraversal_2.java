package graph_1;
//Depth First Traversal
import java.util.*;

public class DepthFirstTraversal_2 {
	
	
public static void dfsHelper(int adjMatrix[][],int currentVertex,boolean visited[]) {
		visited[currentVertex] = true;
		System.out.print(currentVertex+" ");
		
		for(int i=0; i<adjMatrix.length; i++) {
			if(adjMatrix[currentVertex][i] == 1 && visited[i] == false) {
				//i is neighbour of current vertex
				dfsHelper(adjMatrix,i,visited);
			}
		}
	}
	
	public static void dfs(int adjMatrix[][]) {
		boolean visited[] = new boolean[adjMatrix.length];
		for(int i=0; i<adjMatrix.length; i++) {
			if(!visited[i]) {
		dfsHelper( adjMatrix,i,visited);
		System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); //no of vertices
		int e = sc.nextInt(); //no of edges

		int adjMatrix[][] = new int[n][n];

		//take input of vertices and marking the edges as 1
		for(int i=0; i<e; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();

			adjMatrix[v1][v2] = 1;
			adjMatrix[v2][v1] = 1;
		}
	
		dfs(adjMatrix);
			
		}
		/*
Input:
4 3
0 1
0 3
1 
2
output:
0 1 2 3 

//diconnected graph
 * 
6 5
0 1
0 2
1 3
2 3
4 5
output:
0 1 3 2 
4 5 
		 */


	}

