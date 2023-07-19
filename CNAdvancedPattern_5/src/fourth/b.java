package fourth;
/*
  1
  12
 123
1234 
 */
import java.util.Scanner;

public class b {

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
				
				int num =1;
				while(num<=i) {
					System.out.print(num);
					
					num++;
				}
				System.out.println();
				i++;
			}
			
//			for(int i=1;i<=n;i++) {
//				for(int j=1;j<=n-i;j++) {
//					System.out.print(" ");
//				}
//				for(int k=1;k<=i;k++) {
//					System.out.print(k);
//				}
//				System.out.println();
//			}
			
			
		

	}

}
