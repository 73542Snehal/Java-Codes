package fourth;
/*
 
  *
 ***
*****
 ***
  *
  Print the following pattern for the given number of rows.
Note: N is always odd.


Pattern for N = 5
 
  */



import java.util.Scanner;

public class h {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		
		int n1=(n+1)/2;
		int n2 =n/2;
		
		int i=1;
		while(i<=n1) {
			
			int spaces = 1;
			while(spaces<=n1-i) {
				System.out.print(" ");
				spaces++;
			}
			
			int j=1;
			while(j<=2*i-1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
		 i=n2;
		while(i>=1) {
			
			int spaces = 1;
			while(spaces<=n2-i+1) {
				System.out.print(" ");
				spaces++;
			}
			
			int j=1;
			while(j<=2*i-1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i--;
		}
        
        
//        for (int i = 1; i <= (n + 1) / 2; i++) {
//            for (int j = 1; j <= (n + 1) / 2 - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= 2 * i - 1; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//      
//        for (int i = (n - 1) / 2; i >= 1; i--) {
//            for (int j = 1; j <= (n + 1) / 2 - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= 2 * i - 1; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}


