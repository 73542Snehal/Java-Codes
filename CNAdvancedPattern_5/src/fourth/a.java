package fourth;
/*
    *
   **
  ***
 ****
  */
import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter n");
			int n = sc.nextInt();
			
			int i=1;
			while(i<=n) {
				
				int space =1;
				while(space<=n-i) {
					System.out.print(" ");
					space++;
				}
				
				int star =1;
				while (star<=i) {
					System.out.print("*");
					star++;
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
//				System.out.println();
//			}
			
			
		

	}

}
