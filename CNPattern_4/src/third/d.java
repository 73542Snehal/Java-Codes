package third;
/*
4321
4321
4321
4321*/
import java.util.Scanner;

public class d {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n");
	int n = sc.nextInt();
	
	int i=1;
	while(i<=n) {
		int j=n;
		while(j>=1) {
			System.out.print(j);
			j--;
		}
		System.out.println();
		i++;
	}
	
//	for(int i=1;i<=n;i++) {
//		for(int j=1;j<=n;j++) {
//			System.out.print(n-j+1);
//		}
//		System.out.println();
//	}
}}
