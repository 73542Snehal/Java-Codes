package skillTestJava;
/*Number Star Pattern
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
import java.util.*;

public class Pattern {
	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            for (int k = 1; k <= 2 * (N - i); k++) {
                System.out.print("*");
            }
            
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
}
