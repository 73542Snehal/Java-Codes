package questions;
/*Check Max-Heap
Send Feedback
Given an array of integers, check whether it represents max-heap or not. Return true if the given array represents max-heap, else return false.
Input Format:
The first line of input contains an integer, that denotes the value of the size of the array. Let us denote it with the symbol N.
The following line contains N space separated integers, that denote the value of the elements of the array.
Output Format :
The first and only line of output contains true if it represents max-heap and false if it is not a max-heap.
Constraints:
1 <= N <= 10^5
1 <= Ai <= 10^5
Time Limit: 1 sec
Sample Input 1:
8
42 20 18 6 14 11 9 4
Sample Output 1:
true*/
import java.util.*;

public class CheckMaxHeap {

	public static boolean checkMaxHeap(int[] arr) {
	    int n = arr.length;

	    // Start checking from the parent of the last element
	    int parent = (n - 1) / 2;

	    for (int i = parent; i >= 0; i--) {
	        int leftChild = 2 * i + 1;
	        int rightChild = 2 * i + 2;

	        // Check if left child exists and is greater than parent
	        if (leftChild < n && arr[leftChild] > arr[i]) {
	            return false;
	        }

	        // Check if right child exists and is greater than parent
	        if (rightChild < n && arr[rightChild] > arr[i]) {
	            return false;
	        }
	    }

	    return true;
	}
	
	 static Scanner s = new Scanner(System.in);
		public static void main(String[] args) {

	        int n = s.nextInt();
			int input[] = new int[n];
			for(int j = 0; j < n; j++) {
				input[j] = s.nextInt();
			}

			System.out.println(checkMaxHeap(input));
		}
}
