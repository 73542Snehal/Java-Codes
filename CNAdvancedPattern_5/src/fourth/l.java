package fourth;
/*
1357
3571
5713
7135

*/
import java.util.Scanner;

public class l {

	public static void main(String[] args) {
		
			Scanner sc =new Scanner(System.in);
			   System.out.println("Enter n");
			   int n = sc.nextInt();
		int i = 1; //current row
		while(i<=n) {
		int valueToPrint = (2*i)-1;
		int maxValue = (2*n)-1;
		int j=1; //current colmns
		while(j<=n) {
		System.out.print(valueToPrint);
		valueToPrint = valueToPrint + 2;
		if(valueToPrint > maxValue) {
		valueToPrint = 1;
		}
		j=j+1;
		}
		System.out.println();
		i=i+1;
		}
	}

}
