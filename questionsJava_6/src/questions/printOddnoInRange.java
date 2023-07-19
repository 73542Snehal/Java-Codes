package questions;
//print all odd no from given range
import java.util.Scanner;

public class printOddnoInRange {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter s and e");
			
			int s,e;
			s=sc.nextInt();
			e=sc.nextInt();
			
			for(int i=s;i<=e;i++) {
				if(i%2 != 0) {
					System.out.print(i+" ");
				}
			}

	}

}
