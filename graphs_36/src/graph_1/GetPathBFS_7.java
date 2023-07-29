package graph_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*Get Path - BFS
Send Feedback
Given an undirected graph G(V, E) and two vertices v1 and v2 (as integers), find and print the path from v1 to v2 (if exists). Print nothing if there is no path between v1 and v2.
Find the path using BFS and print the shortest path available.
Note:
1. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1. 
2. E is the number of edges present in graph G.
3. Print the path in reverse order. That is, print v2 first, then intermediate vertices and v1 at last.
4. Save the input graph in Adjacency Matrix.
Input Format :
The first line of input contains two integers, that denote the value of V and E.
Each of the following E lines contains two integers, that denote that there exists an edge between vertex a and b.
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
Sample Input 1 :
4 4
0 1
0 3
1 2
2 3
1 3
Sample Output 1 :
3 0 1
Sample Input 2 :
6 3
5 3
0 1
3 4
0 3
Sample Output 2 :*/

import java.util.*;
public class GetPathBFS_7 {

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

	public static ArrayList<Integer> getPathbfs(int adjMatrix[][],int s, int e) {
		Queue<Integer> pendingVertices = new LinkedList<>();
		HashMap<Integer,Integer> map = new HashMap<>();
		boolean visited[] = new boolean[adjMatrix.length];
		visited[s] = true;
		pendingVertices.add(s);

		map.put(s, -1);
		boolean pathFound = false;

		while(!pendingVertices.isEmpty()) {
			int currentVertex =  pendingVertices .poll();


			for(int i=0; i<adjMatrix.length; i++) {
				if(adjMatrix[currentVertex][i] == 1 && !visited[i]) {
					pendingVertices.add(i);
					visited[i] =true;
					map.put(i, currentVertex);
					if(i==e) {
						//pathfound
						 pathFound = true;
						break;
					}
				}
			}
		}
		if( pathFound) {
			ArrayList<Integer> path = new ArrayList<Integer>();
			int currentVertex = e;
			while(currentVertex !=-1) {
			path.add(currentVertex);
			int parent = map.get(currentVertex);
			currentVertex = parent;
			}
			return path;
		}else {
			return null;
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
		
		int source = sc.nextInt(); 
		int end = sc.nextInt(); 
		ArrayList<Integer> path = getPathbfs(adjMatrix,source,end);
		
		for(Integer i:path) {
			System.out.print(i+" ");
		}
	}
}

/*import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class Solution {

    public static void bfs(int adjMatrix[][]) {
        Queue<Integer> pendingVertices = new LinkedList<>();
        boolean visited[] = new boolean[adjMatrix.length];
        visited[0] = true;
        pendingVertices.add(0);

        while (!pendingVertices.isEmpty()) {
            int currentVertex = pendingVertices.poll();
            System.out.print(currentVertex + " ");

            for (int i = 0; i < adjMatrix.length; i++) {
                if (adjMatrix[currentVertex][i] == 1 && !visited[i]) {
                    // i is an unvisited neighbor of the current vertex
                    pendingVertices.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static ArrayList<Integer> getPathBFS(int adjMatrix[][], int s, int e) {
        Queue<Integer> pendingVertices = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean visited[] = new boolean[adjMatrix.length];
        visited[s] = true;
        pendingVertices.add(s);

        map.put(s, -1);
        boolean pathFound = false;

        while (!pendingVertices.isEmpty()) {
            int currentVertex = pendingVertices.poll();

            for (int i = 0; i < adjMatrix.length; i++) {
                if (adjMatrix[currentVertex][i] == 1 && !visited[i]) {
                    pendingVertices.add(i);
                    visited[i] = true;
                    map.put(i, currentVertex);
                    if (i == e) {
                        // path found
                        pathFound = true;
                        break;
                    }
                }
            }
        }
        if (pathFound) {
            ArrayList<Integer> path = new ArrayList<Integer>();
            int currentVertex = e;
            while (currentVertex != -1) {
                path.add(currentVertex);
                int parent = map.get(currentVertex);
                currentVertex = parent;
            }

            // Using Stack to reverse the order of the path
            Stack<Integer> stack = new Stack<>();
            for (int i = path.size() - 1; i >= 0; i--) {
                stack.push(path.get(i));
            }
            path.clear();
            while (!stack.isEmpty()) {
                path.add(stack.pop());
            }

            return path;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // no of vertices
        int e = sc.nextInt(); // no of edges

        int adjMatrix[][] = new int[n][n];

        // take input of vertices and marking the edges as 1
        for (int i = 0; i < e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }

        int source = sc.nextInt();
        int end = sc.nextInt();
        ArrayList<Integer> path = getPathBFS(adjMatrix, source, end);

        if (path != null) {
            for (int i = 0; i < path.size(); i++) {
                System.out.print(path.get(i) + " ");
            }
        }
    }
}
*/
