package fourth;
/*
****
***
**
*
 */
import java.util.Scanner;

public class c {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter n");
			int n = sc.nextInt();
			
			int i=1;
			while(i<=n) {
				
				int stars=1;
				while(stars<=n-i+1) {
					System.out.print("*");
					stars++;
				}
				
				int spaces =1;
				while(spaces<=i-1) {
					System.out.print(" ");
					spaces++;
				}
				
				
				System.out.println();
				i++;
			}
			

//			for(int i=1;i<=n;i++) {
//				for(int j=1;j<=n-i+1;j++) {
//					System.out.print("*");
//				}
//			
//				System.out.println();
//			}
//			
			
		

	}

}
