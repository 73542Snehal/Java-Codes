package questions;
//fibonacci series
import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		
		int firstTerm = 0,secondTerm=1;
		int nextTerm = firstTerm + secondTerm;
		
		System.out.print(firstTerm+" " );
		System.out.print(secondTerm+" " );
		
		for(int i=3;i<=n;i++) {
			
			System.out.print(nextTerm+" " );
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			nextTerm = firstTerm + secondTerm;	
			
		}
	}
}
