package javaFullTest;
/*Jumping Numbers
Send Feedback
Given a number x, print all the jumping numbers below or equal to x. A number is called a jumping number if for a number all the adjacent digits differ by 1. All single digit numbers are also jumping numbers.
Eg. 432345, 32, 543, 989, 12, 21 are jumping numbers whereas 843, 485, 9348 are not.
Input Format :
An integer x.
Output Format :
All the jumping numbers smaller than or equal to x, separated by space and generated in increasing order of most significant digit.
Input Constraints :
1 <= x <= 10^5
Sample Input 1 :
10
Sample Output 1 :
0 1 10 2 3 4 5 6 7 8 9
Sample Input 2 :
50
Sample Output 2 :
0 1 12 10 2 23 21 3 34 32 4 45 43 5 6 7 8 9*/
import java.util.*;
public class jumpingNumbers {
	
	
	    static void dfs(long num, long limit) {
	        Queue<Long> queue = new LinkedList<>();
	        queue.add(num);

	        while (!queue.isEmpty()) {
	            long current = queue.poll();
	            if (current <= limit) {
	                System.out.print(current + " ");

	                int lastDigit = (int) (current % 10);
	                if (lastDigit == 0) {
	                    queue.add(current * 10 + 1);
	                } else if (lastDigit == 9) {
	                    queue.add(current * 10 + 8);
	                } else {
	                    queue.add(current * 10 + lastDigit + 1);
	                    queue.add(current * 10 + lastDigit - 1);
	                }
	            }
	        }
	    }

	    public static void showJumpingNos(int X) {
	        System.out.print(0 + " ");
	        for (long i = 1L; i <= 9; i++) {
	            dfs(i, X);
	        }
	    }
	
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int x = s.nextInt();
   showJumpingNos(x);

}
}
