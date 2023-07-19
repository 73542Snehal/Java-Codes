package fourth;
/*
   *
  ***
 *****
*******
 */
import java.util.Scanner;

public class f {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter n");
			int n = sc.nextInt();
			
			int i=1;
			while(i<=n) {
				int spaces = 1;
				while(spaces<=n-i) {
					System.out.print(" ");
					spaces++;
				}
				
				int stars=1;
				while(stars<=i) {
					System.out.print("*");
					stars++;
				}
				
				int rp =i-1;
				while(rp>=1) {
					System.out.print("*");
					rp--;
				}
				System.out.println();
				i++;
			}
			
//			for(int i=1;i<=n;i++) {
//				for(int j=1;j<=n-i;j++) {
//					System.out.print(" ");
//				}
//				for(int k=1;k<=i;k++) {
//					System.out.print("*");
//				}
//				
//				for(int d=i-1;d>=1;d--) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//			
			
		

	}

}
