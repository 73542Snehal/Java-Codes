package questions;
//find ascii value of a character
import java.util.Scanner;

public class asciiValueOfCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("enter character");
		ch = sc.next().charAt(0);
		
		System.out.println((int)(ch));
		

	}

}
