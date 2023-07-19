package fourth;
/*
   1
  121
 12321
1234321
 */
import java.util.Scanner;

public class e {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter n");
			int n = sc.nextInt();
			
			int i=1;
			while(i<=n) {
				
				int spaces =1;
				while(spaces<=n-i) {
					System.out.print(" ");
					spaces++;
				}
				
				int j=1;
				while(j<=i) {
					System.out.print(j);
					j++;
				}
				
				int rightPart = i-1;
				
				while(rightPart>=1) {
					System.out.print(rightPart);
					rightPart--;
				}
				System.out.println();
				i++;
			}
			
//			for(int i=1;i<=n;i++) {
//				
//				for(int j=1;j<=n-i;j++) {
//					System.out.print(" ");
//				}
//				for(int k=1;k<=i;k++) {
//					System.out.print(k);
//				}
//				
//				for(int d=i-1;d>=1;d--) {
//					System.out.print(d);
//				}
//				System.out.println();
//			}
			
			
		

	}

}
