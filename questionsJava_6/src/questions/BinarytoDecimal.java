package questions;
import java.util.Scanner;
public class BinarytoDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		String n=sc.next();
		
		int decimal=Integer.parseInt(n,2);  
		System.out.println(decimal); 

	}

}
