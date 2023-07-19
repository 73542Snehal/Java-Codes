package third;
/*
 A
 BB
 CCC
 */
import java.util.Scanner;

public class o {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n");
	int n = sc.nextInt();
	
	int i=1;
	while(i<=n) {
		char ch = (char)('A'+i-1);
		int j=1;
		while(j<=i) {
			System.out.print(ch);
			j++;
		}
		System.out.println();
		i++;
	}
	
//	for(int i=1;i<=n;i++) {
//		char ch = (char)('A'+i-1);
//		for(int j=1;j<=i;j++) {
//			
//			System.out.print(ch);
//			
//		}
//		System.out.println();
//	}
}}
