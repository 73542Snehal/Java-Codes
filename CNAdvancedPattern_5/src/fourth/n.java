package fourth;
/*Number Star Pattern
Send Feedback
Print the following pattern for given number of rows.
Input format :

Line 1 : N (Total number of rows)

Sample Input :
   5
Sample Output :
1234554321
1234**4321
123****321
12******21
1********1*/
import java.util.Scanner;

public class n {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i=1;
		while(i<=n) {

			int j=1;
			while(j<=n-i+1) {
				System.out.print(j);
				j++;
			}
			
			int star=1;
			while(star<=i-1) {
				System.out.print("*");
				star++;
			}
			
			int stars=i-1;
			while(stars>=1) {
				System.out.print("*");
				stars--;
			}
			
			int k=n-i+1;
			while(k>=1) {
				System.out.print(k);
				k--;
			}

			System.out.println();
			i++;
		}
	}
}
