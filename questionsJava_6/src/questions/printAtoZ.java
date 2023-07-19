package questions;
//Print to A to Z
import java.util.Scanner;

public class printAtoZ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i='A';i<='Z'; i++) {
			System.out.print((char)(i)+" ");
		}

	}

}
