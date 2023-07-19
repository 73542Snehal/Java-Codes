package questions;
//area of a square = side*side
import java.util.Scanner;

public class areaOfSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int side;
		System.out.println("enter side");
		side = sc.nextInt();
		
		int area = side*side;
		System.out.println(area);
	}

}
