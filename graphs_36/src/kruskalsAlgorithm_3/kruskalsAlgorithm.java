package kruskalsAlgorithm_3;
/*Code : Kruskal's Algorithm
Send Feedback
Given an undirected, connected and weighted graph G(V, E) with V number of vertices (which are numbered from 0 to V-1) and E number of edges.
Find and print the Minimum Spanning Tree (MST) using Kruskal's algorithm.
For printing MST follow the steps -
1. In one line, print an edge which is part of MST in the format - 
v1 v2 w
where, v1 and v2 are the vertices of the edge which is included in MST and whose weight is w. And v1  <= v2 i.e. print the smaller vertex first while printing an edge.
2. Print V-1 edges in above format in different lines.
Note : Order of different edges doesn't matter.
Input Format :
Line 1: Two Integers V and E (separated by space)
Next E lines : Three integers ei, ej and wi, denoting that there exists an edge between vertex ei and vertex ej with weight wi (separated by space)
Output Format :
Print the MST, as described in the task.
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
1 2 1
0 1 3
0 3 5
Input Graph*/
import java.util.*;

class Edge implements Comparable<Edge>{

	int v1;
	int v2; 
	int weight;

	Edge(int v1,int v2, int weight){
		this.v1 = v1;
		this.v2 = v2;
		this.weight = weight;   
	}

	@Override
	public int compareTo(Edge o) {
		return this.weight - o.weight;
	}	
}

public class kruskalsAlgorithm {
	
	public static int findParent(int v, int parent[]) {
		if(v == parent[v]) {
			return v;
		}
		
		return findParent(parent[v], parent);
	}
	
	public static Edge[] kruskalsAlgoritm(Edge[] edges,int n) {
		Arrays.sort(edges);
		Edge mst[]= new Edge[n-1];
		int parent[] = new int[n];
		for(int j=0; j<n; j++) {
			parent[j] = j;
		}
		
		int count = 0, i=0;
		while(count !=  n-1) {
			Edge currentEdge = edges[i++];
			int v1Parent = findParent(currentEdge.v1,parent);
			int v2Parent = findParent(currentEdge.v2,parent);
			
			if(v1Parent != v2Parent) {
				//including current edge
				mst[count] = currentEdge;
				count++;
				parent[v1Parent] = v2Parent;
			}
		}
		
		return mst;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int e = sc.nextInt();

		Edge edges[] = new Edge[e];

		for(int i=0; i<e; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int weight = sc.nextInt();

			Edge edge = new Edge(v1,v2,weight);

			edges[i] = edge;
		}

		Edge mst[] = kruskalsAlgoritm(edges,n);
		
		for(int i=0;i<mst.length;i++) {
			if(mst[i].v1 < mst[i].v2) {
				System.out.println(mst[i].v1 +" "+ mst[i].v2+ " "+mst[i].weight);
			}else {
				System.out.println(mst[i].v2 + " " +mst[i].v1+ " "+mst[i].weight);
			}
		}
	}
}
/*
 Input:
6 11
0 1 1
0 2 5
0 3 4
1 3 3
2 3 10
2 4 8
3 5 6
3 4 7
4 5 2
1 2 6
2 5 9

Output:
0 1 1
4 5 2
1 3 3
0 2 5
3 5 6
 */
 