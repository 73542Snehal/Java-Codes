package advancedQue_2;
/*Print Subset Sum to K
Send Feedback
Given an array A and an integer K, print all subsets of A which sum to K.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.


Note :
The order of subsets are not important. Just print them in different lines.


Input format :
Line 1 : Size of input array
Line 2 : Array elements separated by space
Line 3 : K 
Sample Input:
9 
5 12 3 17 1 18 15 3 17 
6
Sample Output:
3 3
5 1*/
import java.util.*;

public class PrintSubsetSumtoK {

	public static void printSubsetsSumTok(int input[], int k) {
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets(input, 0, new ArrayList<>(), subsets, k);

        for (List<Integer> subset : subsets) {
            for (int num : subset) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static void generateSubsets(int[] input, int index, List<Integer> current, List<List<Integer>> subsets, int k) {
        if (index == input.length) {
            int sum = 0;
            for (int num : current) {
                sum += num;
            }
            if (sum == k) {
                subsets.add(new ArrayList<>(current));
            }
            return;
        }

        // Exclude the current element
        generateSubsets(input, index + 1, current, subsets, k);

        // Include the current element
        current.add(input[index]);
        generateSubsets(input, index + 1, current, subsets, k);
        current.remove(current.size() - 1);
    }
}

/*static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int k = s.nextInt();
		solution.printSubsetsSumTok(input, k);
	}*/
