//power

package first;
import java.util.Scanner;

public class que8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x , y;
		x=sc.nextInt();
		y=sc.nextInt();
		//System.out.print((int)Math.pow(x,y));
		
		int pow=1;
		
		while(y>0) {
			pow = pow*x;
			y--;
		}
		System.out.println(pow);
	}
}
