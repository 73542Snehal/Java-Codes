package third;
/*
ABCD
BCDE
CDEF
DEFG*/
import java.util.Scanner;

public class m {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n");
	int n = sc.nextInt();
	
	int i=1;
	while(i<=n) {
		char ch = (char)('A'+i-1);
		int j=1;
		while(j<=n) {
			
			System.out.print(ch);
			ch++;
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






















