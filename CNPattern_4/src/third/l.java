package third;
/*
ABCD
ABCD
ABCD
ABCD*/
import java.util.Scanner;

public class l {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n");
	int n = sc.nextInt();
	
	int i=1;
	while(i<=n) {
		int j=1;
		while(j<=n) {
			char ch = (char)('A'+j-1);
			System.out.print(ch);
			
			j++;
		}
		System.out.println();
		i++;
	}
	
//	for(int i=1;i<=n;i++) {
//		for(int j=1;j<=n;j++) {
//			char ch = (char)('A'+j-1);
//			System.out.print(ch);
//		}
//		System.out.println();
//	}
}}
