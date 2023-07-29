package graph_1;
//breadth first traversal
import java.util.*;


public class breadthfirsttraversal_3 {
	
	public static void bfs(int adjMatrix[][]) {
		Queue<Integer> pendingVertices = new LinkedList<>();
		boolean visited[] = new boolean[adjMatrix.length];
		visited[0] = true;
		pendingVertices.add(0);
		
		 for (int startVertex = 0; startVertex < adjMatrix.length; startVertex++) {
	            if (!visited[startVertex]) {
	                pendingVertices.add(startVertex);
	                visited[startVertex] = true;
	                
		while(!pendingVertices.isEmpty()) {
			int currentVertex =  pendingVertices .poll();
			System.out.print(currentVertex+" ");
			
			for(int i=0; i<adjMatrix.length; i++) {
				if(adjMatrix[currentVertex][i] == 1 && !visited[i]) {
					//i is a unvisited neighbor of current vertex
					pendingVertices.add(i);
					visited[i] =true;
				}
			}
		}
	            
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
		bfs(adjMatrix);
	}
	
	/*
Input:
5 4
0 2
0 3
2 1
3 4
Output:
0 2 3 1 4  

disconnected graph
6 5
0 1
0 2
1 3
2 3
4 5
output:
0 1 2 3 4 5
	 */
}
