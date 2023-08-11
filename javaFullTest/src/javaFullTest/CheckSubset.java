package javaFullTest;
/*Check Subset
Send Feedback
Given two integer arrays. Check if second array is a subset of first array.
Input format :
Line 1 : Integer N1 
Line 2 : N1 integers separated be a single space
Line 1 : Integer N2 
Line 2 : N2 integers separated be a single space
Output Format :
 Boolean
Constraints :
 0 <= N1 <= 10^4
 0 <= N2 <= 10^4
Sample Input :
15
3 6 5 8 15 1 14 18 7 9 14 9 3 12 8 
4
18 6 9 8
Sample Output :
true*/
import java.util.*;
public class CheckSubset {
	public static boolean CheckSubset(int[] arr1, int n, int[] arr2, int m) {
        int i = 0, j = 0;
 
        Arrays.sort(arr1); // sorts arr1
        Arrays.sort(arr2); // sorts arr2
 
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] == arr2[j]) {
                i++;
                j++;
            } else if (arr1[i] > arr2[j]) {
                return false;
            }
        }
 
        if (j < m) {
            return false;
        }
        return true;
    }
	 
	static Scanner s  = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = s.nextInt();
		} 
		n = s.nextInt();
		int arr1[] = new int[n];
		for(int i=0;i<n;i++){
			arr1[i] = s.nextInt();
		} 
		System.out.println(CheckSubset(arr,arr.length,arr1,arr1.length));
	}
}

