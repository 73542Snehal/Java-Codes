package advancedQue_2;
/*Return subset of an array
Send Feedback
Given an integer array (of length n), find and return all the subsets of input array.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.


Note :
The order of subsets are not important.


Input format :

Line 1 : Size of array

Line 2 : Array elements (separated by space)

Sample Input:
3
15 20 12
Sample Output:
[] (this just represents an empty array, don't worry about the square brackets)
12 
20 
20 12 
15 
15 12 
15 20 
15 20 12 */
import java.util.*;

public class Returnsubsetofanarray {

	public static int[][] subsets(int input[]) {
		  List<List<Integer>> subsets = new ArrayList<>();
		        generateSubsets(input, 0, new ArrayList<>(), subsets);

		        int[][] result = new int[subsets.size()][];
		        for (int i = 0; i < subsets.size(); i++) {
		            List<Integer> subset = subsets.get(i);
		            result[i] = new int[subset.size()];
		            for (int j = 0; j < subset.size(); j++) {
		                result[i][j] = subset.get(j);
		            }
		        }

		        return result;
		    }

		    private static void generateSubsets(int[] input, int index, List<Integer> current, List<List<Integer>> subsets) {
		        if (index == input.length) {
		            subsets.add(new ArrayList<>(current));
		            return;
		        }

		        // Exclude the current element
		        generateSubsets(input, index + 1, current, subsets);

		        // Include the current element
		        current.add(input[index]);
		        generateSubsets(input, index + 1, current, subsets);
		        current.remove(current.size() - 1);
		    }
}
/*public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int output[][] = solution.subsets(input);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}*/
