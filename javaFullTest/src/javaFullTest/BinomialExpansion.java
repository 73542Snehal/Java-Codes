package javaFullTest;
/*Binomial Expansion
Send Feedback
Given three integers A, X, and n, the task is to print terms of below binomial expression series.
(A+X)^n = a0*X^0 + a1*X^1 +….+an*X^n.
So at each position find the value of the general term and print that term(Print a0,a1x,a2x^2,....,an*x^n).
Input Format:
3 space seperated integers-> A,X,n.
Output Format:
The output is the terms of the binomial expression series.
Sample input:
 1 2 6
Sample Output:
1 12 60 160 240 192 64*/

import java.util.*;

public class BinomialExpansion {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int A = scanner.nextInt();
	        int X = scanner.nextInt();
	        int n = scanner.nextInt();
	        
	        printBinomialExpansion(A, X, n);
	    }
	    
	    public static void printBinomialExpansion(int A, int X, int n) {
	        for (int i = 0; i <= n; i++) {
	            int coefficient = binomialCoefficient(n, i);
	            int term = coefficient * (int)Math.pow(A, n - i) * (int)Math.pow(X, i);
	            System.out.print(term + " ");
	        }
	    }
	    
	    public static int binomialCoefficient(int n, int k) {
	        if (k == 0 || k == n) {
	            return 1;
	        }
	        
	        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
	    }
}
