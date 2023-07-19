package sixthCNForLoop;

import java.util.Scanner;

/*Print the following pattern for given number of rows.
Input format :
Integer N (Total number of rows)
Output Format :
Pattern in N lines
Sample Input :
   5
Sample Output :
 5432*
 543*1
 54*21
 5*321
 *4321
 */
public class o {

	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				int p = n-j+1;
				if(p==i) {
					System.out.print("*");
				}else
				System.out.print(p);
				p++;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
/*		int i=1;

		while(i<=n) {

			int j=n;
			while(j>=1) {
				System.out.print(j);
				if(i==j) {
					System.out.print("*");
				}
				j--;
			}
			System.out.println();
			i++;
		}*/
