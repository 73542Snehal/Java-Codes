package questions;
/*Longest Consecutive Sequence
Send Feedback
You are given an array of unique integers that contain numbers in random order. 
You have to find the longest possible sequence of consecutive numbers using the numbers from given array.
You need to return the output array which contains starting and ending element.
 If the length of the longest possible sequence is one, then the output array must contain only single element.
Note:
1. Best solution takes O(n) time.
2. If two sequences are of equal length, then return the sequence starting with the number whose occurrence is earlier in the array.
Input format:
The first line of input contains an integer, that denotes the value of the size of the array. Let us denote it with the symbol n.
The following line contains n space separated integers, that denote the value of the elements of the array.
Output format:
The first and only line of output contains starting and ending element of the longest consecutive sequence. If the length of  the longest consecutive sequence is 1, then just print the starting element.
Constraints :
0 <= n <= 10^6
Time Limit: 1 sec
Sample Input 1 :
13
2 12 9 16 10 5 3 20 25 11 1 8 6 
Sample Output 1 :
8 12 
Sample Input 2 :
7
3 7 2 1 9 8 41
Sample Output 2 :
7 9
Explanation: Sequence should be of consecutive numbers. 
Here we have 2 sequences with same length i.e. [1, 2, 3] and [7, 8, 9], 
but we should select [7, 8, 9] because the starting point of [7, 8, 9] comes first in input array and therefore, 
the output will be 7 9, as we have to print starting and ending element of the longest consecutive sequence.
Sample Input 3 :
7
15 24 23 12 19 11 16
Sample Output 3 :
15 16*/
import java.util.*;

public class LongestConsecutiveSequence {
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
	     HashSet<Integer> set = new HashSet<>();
	        ArrayList<Integer> result = new ArrayList<>();

	        // Add all the elements of the array to the set
	        for (int num : arr) {
	            set.add(num);
	        }

	        int maxLength = 0;
	        int start = 0;

	        // Iterate over each element in the array
	        for (int num : arr) {
	            // Check if the current number is the start of a sequence
	            if (!set.contains(num - 1)) {
	                int currentNum = num;
	                int currentLength = 1;

	                // Find the length of the consecutive sequence
	                while (set.contains(currentNum + 1)) {
	                    currentNum++;
	                    currentLength++;
	                }

	                // Update the maxLength and start if a longer sequence is found
	                if (currentLength > maxLength) {
	                    maxLength = currentLength;
	                    start = num;
	                }
	            }
	        }

	        // Add the start and end elements of the longest consecutive sequence to the result array
	        result.add(start);
	        result.add(start + maxLength - 1);

	        return result;
	    }
	
}
/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }
        
		String[] strNums;
		strNums = br.readLine().split("\\s");
		
        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }

    public static void printArray(ArrayList<Integer> arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {


        int[] arr = takeInput();
        ArrayList<Integer> ans = Solution.longestConsecutiveIncreasingSequence(arr);
        printArray(ans);

    }
}*/
