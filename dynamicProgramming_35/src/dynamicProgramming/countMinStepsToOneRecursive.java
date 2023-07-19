package dynamicProgramming;

import java.util.Scanner;

public class countMinStepsToOneRecursive {
	
	public static int countMinStepsToOneRecursive(int n) {
		if(n==1) {
			return 0;
		}
		 
		int ans1 = countMinStepsToOneRecursive(n-1);
		
		int ans2 = Integer.MAX_VALUE;
		if((n%2) == 0) {
			ans2 = countMinStepsToOneRecursive(n/2);
		}
		
		int ans3 = Integer.MAX_VALUE;
		if((n%3) == 0) {
			ans3 = countMinStepsToOneRecursive(n/3);
		}
		
		int finalAns = Math.min(ans1, Math.min(ans2, ans3))+1;
		return finalAns;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int ans = countMinStepsToOneRecursive(n);
		System.out.println(ans);
	}
}
