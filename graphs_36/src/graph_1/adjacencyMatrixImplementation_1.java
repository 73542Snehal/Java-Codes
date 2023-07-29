package graph_1;

import java.util.*;

public class adjacencyMatrixImplementation_1 {

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
		
		//print matrix
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(adjMatrix[i][j]+" ");
			}
			System.out.println();
		}
		
		/*
Input:
4 5
0 1
0 2
3 0
1 3
2 3
output:
0 1 1 1 
1 0 0 1 
1 0 0 1 
1 1 1 0 
		*/
		
		
	}
}
