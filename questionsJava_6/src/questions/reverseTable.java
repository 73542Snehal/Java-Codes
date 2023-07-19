package questions;
//print reverse of a table
import java.util.Scanner;

public class reverseTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		
		for(int i=10; i>=1; i--) {
			System.out.print(n*i+" ");
		}

	}

}
