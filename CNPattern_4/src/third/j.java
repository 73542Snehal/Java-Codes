package third;
/*
1
21
321
4321
 */
import java.util.Scanner;

public class j {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		
		int i=1;
		while(i<=n) {
			int p=i;
			int j=1;
			while(j<=i) {
				System.out.print(p);
				p--;
				j++;
			}
			System.out.println();
			i++;
		}
		
//		for(int i=1;i<=n;i++) {
//			int p=i;
//			for(int j=1;j<=i;j++) {
//				
//				System.out.print(p);
//				p--;
//			}
//			System.out.println();
//		}

	}

}
