package third;
/*
E
DE
CDE
BCDE
ABCDE
*/
import java.util.Scanner;

public class p {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		
		int i=1;;
		while(i<=n) {
			char ch = (char)('A'+n-i);
			int j=1;
			while(j<=i) {
				char ch1 = (char)(ch+j-1);
				System.out.print(ch1);
				
				
				j++;
			}
			System.out.println();
			
			i++;
		}
		
		
//		int i=n;
//		while(i>=1) {
//			char ch =(char)('A'+i-1);
//			int j=n-i+1;
//			while(j>=1) {
//				
//				System.out.print(ch);
//				ch++;
//				j--;
//			}
//			System.out.println();
//			i--;
//		}
    		

//		for (int i = n; i >= 1; i--) 
//		{
//			for (int j = i; j <= n; j++)
//			{
//				char ch = (char)('A'+j-1);
//				System.out.print(ch);
//			}
//			System.out.println();
//		}
		}}