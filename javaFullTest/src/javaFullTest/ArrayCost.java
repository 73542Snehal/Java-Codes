package javaFullTest;
/*Array Cost
Send Feedback
Given an array arr of N integers, we have to remove the elements from the array such that removal of each ith indexed element costs us the arr[i].
For removal of two elements from the array, we get to remove one element for free but the free element should be less than the two costing elements.
The task is to find the minimum cost to remove all the elements from the array.
Input Format:
The first line of input contains the integer N.
Each of the following N lines contains a single integer Ai, the array elements 
Constraints:
1 ≤ N ≤ 100000
1 ≤ Ai ≤ 100000
Time limit : 1 sec
Output Format:
The first and only line of output must contain the required minimal price .
Sample Input 1:
4
3
2
3
2 
Sample Output 1:
8
Sample Input 2:
6
6
4
5
5
5
5
Sample Output 2:
21
Explanation:
Clarification of the first example: First remove 3, 3 and 2 for free, cost=6. Now only 2 is left, so the total cost=3+3+2=8
Clarification of the second example: First remove 6,5 and get 5 to remove for free.Then remove 5,5 and get to remove 4 for free.So total cost=6+5+5+5=21.*/
import java.util.*;

public class ArrayCost {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int N = scanner.nextInt();
	        int[] arr = new int[N];
	        
	        for (int i = 0; i < N; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        
	        Arrays.sort(arr); // Sort in ascending order
	        
	        long totalCost = 0;
	        
	        for (int i = N - 1; i >= 0; i--) {
	            totalCost += arr[i];
	            if ((N - i) % 3 == 0) {
	                totalCost -= arr[i];
	            }
	        }
	        
	        System.out.println(totalCost);
	    }
	}

