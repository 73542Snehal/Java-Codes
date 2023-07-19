package dynamicProgramming;

import java.util.*;

public class FibonacciNo {

	//dynamic programming code
	//time and space complexity O(n)
	public static int fibDp(int n,int dp[]) {

		if(n==0 || n==1) {
			return n;
		}
		
		int ans1,ans2;
		
		if(dp[n-1] == -1) {
			ans1= fibDp(n-1,dp);
			dp[n-1] = ans1;
		}else {
			ans1 = dp[n-1];
		}
		
		if(dp[n-2] == -1) {
			ans2= fibDp(n-2,dp);
			dp[n-2] = ans2;
		}else {
			ans2 = dp[n-2];
		}
		
		int finalAnsDp = ans1+ans2;
		return finalAnsDp;
	}


		//normal fib function time complexity is O(2^n)
		public static int fib(int n) {

			if(n==0 || n==1) {
				return n;
			}

			int ans1= fib(n-1);
			int ans2 = fib(n-2);

			int finalAns = ans1+ans2;
			return finalAns;
		}


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter n");
			int n = sc.nextInt();

			int dp[] = new int[n+1];
			
			for(int i=0; i<dp.length; i++) {
				dp[i] = -1;
			}

			//int ans = fib(n);

			int ansDp = fibDp(n,dp);
			//dp[n] = ansDp;
			System.out.println(ansDp);
		}
	}
