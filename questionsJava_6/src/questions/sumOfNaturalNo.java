package questions;
//sum of natural no
import java.util.Scanner;
public class sumOfNaturalNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter n");
		n=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=n;i++) {
			
			sum = sum +i;
		}
		System.out.println(sum);

	}

}
