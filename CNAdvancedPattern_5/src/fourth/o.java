package fourth;

import java.util.Scanner;

/*Rectangular numbers
Send Feedback
Print the following pattern for the given number of rows.
Pattern for N = 4
4444444
4333334
4322234
4321234
4322234
4333334  
4444444
Input format : N (Total no. of rows)

Output format : Pattern in N lines

Sample Input :
3
Sample Output :
33333
32223
32123
32223
33333*/
public class o {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    
	       for (int i = n; i >= 1; i--) {
	            for (int j = n; j >= i; j--) {
	                System.out.print(j);
	            }
	            for (int j = 1; j <= 2 * i - 2; j++) {
	                System.out.print(i);
	            }
	            for (int j = i + 1; j <= n; j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	        
	        // Print lower half of the pattern
	        for (int i = 2; i <= n; i++) {
	            for (int j = n; j >= i; j--) {
	                System.out.print(j);
	            }
	            for (int j = 1; j <= 2 * i - 2; j++) {
	                System.out.print(i);
	            }
	            for (int j = i + 1; j <= n; j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	    }
	}

