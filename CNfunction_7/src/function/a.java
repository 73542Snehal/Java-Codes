package function;
//calculate ncr = n factorial / r factorial *(n-r)factorial
//basic code
import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		//nfactorial
		int factN =1;
		for(int i=1;i<=n;i++) {
			factN = factN * i;
		}
		
		//rFactorial
		int factR =1;
		for(int i=1;i<=r;i++) {
			factR = factR * i;
		}
		
		//n-r Factorial
		int factNR =1;
		for(int i=1;i<=n-r;i++) {
			factNR = factNR * i;
		}
		
		//calculate ncr
		int ncr = factN/(factR*factNR);
		
		System.out.println(ncr);
		
		

	}

}
