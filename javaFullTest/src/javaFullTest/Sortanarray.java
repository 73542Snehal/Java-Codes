package javaFullTest;
/*Sort an array
Send Feedback
Given an array A[] of integers, sort the array according to frequency of elements. That is elements that have higher frequency come first. If frequencies of two elements are same, then smaller number comes first.
Input Format:
The first line contains a single integer N denoting the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array. 
Output Format:
Print the soted array seperated by a space.
Example:
Input:
6
1 2 2 2 3 3
Output:
2 2 2 3 3 1*/

import java.util.*;

public class Sortanarray {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int n = scanner.nextInt();
	        int[] arr = new int[n];

	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        sortByFrequency(arr);

	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }

	    public static void sortByFrequency(int[] arr) {
	        Map<Integer, Integer> frequencyMap = new HashMap<>();
	        for (int num : arr) {
	            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
	        }

	        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
	            @Override
	            public int compare(Integer a, Integer b) {
	                if (frequencyMap.get(a).equals(frequencyMap.get(b))) {
	                    return a - b;
	                }
	                return frequencyMap.get(b) - frequencyMap.get(a);
	            }
	        });

	        for (int num : frequencyMap.keySet()) {
	            pq.offer(num);
	        }

	        int index = 0;
	        while (!pq.isEmpty()) {
	            int num = pq.poll();
	            int frequency = frequencyMap.get(num);
	            for (int i = 0; i < frequency; i++) {
	                arr[index] = num;
	                index++;
	            }
	        }
	    }
	}


