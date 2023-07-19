package recursionQue;
/*Minimum Count
Send Feedback
Given an integer N, find and return the count of minimum numbers, sum of whose squares is equal to N.
That is, if N is 4, then we can represent it as : {1^2 + 1^2 + 1^2 + 1^2} and {2^2}. Output will be 1, as 1 is the minimum count of numbers required.
Note : x^y represents x raise to the power y.
Input Format :
Integer N
Output Format :
Required minimum count
Constraints :
1 <= N <= 50
Sample Input 1 :
12
Sample Output 1 :
3
Sample Output 1 Explanation :
12 can be represented as :
1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1
1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 2^2
1^1 + 1^1 + 1^1 + 1^1 + 2^2 + 2^2
2^2 + 2^2 + 2^2
As we can see, the output should be 3.
Sample Input 2 :
9
Sample Output 2 :
1*/

import java.util.*;

public class MinimumCount {

	public static int minCount(int N){
		  if (N == 0) {
	            return 0;
	        }

	        int minCount = Integer.MAX_VALUE;

	        for (int i = 1; i * i <= N; i++) {
	            int currentCount = 1 + minCount(N - i * i);
	            if (currentCount < minCount) {
	                minCount = currentCount;
	            }
	        }

	        return minCount;
	    }
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
			int num = s.nextInt();
			System.out.println(minCount(num));
	}

}
