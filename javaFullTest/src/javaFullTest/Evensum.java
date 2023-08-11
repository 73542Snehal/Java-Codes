package javaFullTest;
/*Even sum
Send Feedback
We are given an array of length N.We have to remove an element from the array, such that the sum of resultant array is even.
Find the possible number of ways to convert the array sum even by removing one element from the array.
Input Format:
First line contains the integer N denoting the size of the array.
Next line contains N spaced integers denoting the array elements.
(Note:All elements are distinct)
Output Format:
Print the possible number of ways for even array sum.
Constraints:
1 <= N <= 10^7
-10^9 <= arr[i] <= 10^9
Sample Input 1:
4
1 3 2 5
Sample Output 1:
3
Explanation:
 Removing 1,3 or 5 would result in even sum of the array.*/

import java.util.*;

public class Evensum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int ways = 0;
        
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                if (j != i) {
                    sum += arr[j];
                }
            }
            if (sum % 2 == 0) {
                ways++;
            }
        }
        
        System.out.println(ways);
    }
}
