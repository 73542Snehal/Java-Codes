package recursion;
//sum of n natural no
import java.util.*;

public class sumofnaturalno {
	
	public static int sum(int n) {
		if(n==0) {
			return 0;
		}
		
		int sumN = sum(n-1);
		int sumt = n + sumN;
		
		return sumt;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = sum(n);
		System.out.println(ans);
		

	}

}
