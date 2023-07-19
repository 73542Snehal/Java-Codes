package recursion;
/*Number of Digits
Send Feedback
You have been given a number 'n'. Return the number of digits present in 'n' .
Input Format :
Integer n
Output Format :
Count of digits
Constraints :
1 <= n <= 10^6
Sample Input 1 :
 156
Sample Output 1 :
3
Sample Input 2 :
 7
Sample Output 2 :
1*/

import java.util.*;

public class NumberofDigits {
	

	public static int count(int n){
		
		if(n/10==0) {
			return 1;
		}
		
		
		int countN = count(n/10);
		int ans = 1 + countN;
		
		return ans;
		
}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(count(n));
	}
}
