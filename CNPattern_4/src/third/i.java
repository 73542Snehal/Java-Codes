package third;
/*
*
**
***
****
 */
import java.util.Scanner;

public class i {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		
		int i=1;
		while(i<=n) {
			
			int j=1;
			while(j<=i) {
				System.out.print("*");
			j++;
			}
			System.out.println();
			i++;
		}
//		String ch = "*";
//		for(int i=1;i<=n;i++) {
//			
//			for(int j=1;j<=i;j++) {
//				System.out.print(ch);
//			
//			}
//			System.out.println();
//		}

	}

}
