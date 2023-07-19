package fourth;
/*
   1
  232
 34543
4567654
 */
import java.util.Scanner;

public class g {

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
				int p=i;
				int num = 1;
				while(num<=i) {
					System.out.print(p);
					p++;
					num++;
				}
				//p=p-2;
				int rp=p-2;
				while(rp>=i) {
					System.out.print(rp);
					
					rp--;
					
				}
				System.out.println();
				i++;
			}
			
//			for(int i=1;i<=n;i++) {
//				int p=i;
//				for(int j=1;j<=n-i;j++) {
//					
//					System.out.print(" ");
//				}
//				for(int k=1;k<=i;k++) {
//					System.out.print(p);
//					p++;
//				}
//				p=p-2;
//				
//				 for (int d=1; d<=i-1; d++) {
//		                System.out.print(p);
//		                p--;
//		            }
//				System.out.println();
//				
//			}
//			
			
		

	}

}
