package questions;

import java.util.Scanner;

//check Alphabet or not
public class checkAlphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter char");
		char ch = sc.next().charAt(0);
		
		if(ch >= 'A' && ch <='Z' || ch >= 'a' && ch <= 'z') {
			System.out.println("Alphabet");
		}else {
			System.out.println("Not");
		}

	}

}
