package skillTestJava;
/*Maximum Subarray Sum
This problem was asked by Amazon.
Given an array of numbers, find the maximum sum of any contiguous subarray of the array.
For example, given the array [34, -50, 42, 14, -5, 86], the maximum sum would be 137, since we would take elements 42, 14, -5, and 86.
Given the array [-5, -1, -8, -9], the maximum sum would be -1.
Follow up: Do this in O(N) time.
Input Format:
The first line of input contains size of array, which is denoted by N and second line of input contains N space separated integers.
Output Format:
The first and only line of output should print the maximum subarray sum, as described in the description.*/
import java.util.*;
public class MaximumSubarraySum {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int[] array = new int[N];
	        
	        for (int i = 0; i < N; i++) {
	            array[i] = sc.nextInt();
	        }
	        
	        int maxSum = array[0];
	        int currentSum = array[0];
	        
	        for (int i = 1; i < N; i++) {
	            currentSum = Math.max(array[i], currentSum + array[i]);
	            maxSum = Math.max(maxSum, currentSum);
	        }
	        
	        System.out.println(maxSum);
	    }
	}
