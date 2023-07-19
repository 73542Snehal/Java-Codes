package questions;

import java.util.Scanner;

public class ArithmaticProgression {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter firstTerm lastTerm difference ");
		
		int firstTerm = sc.nextInt();
		int lastTerm = sc.nextInt();
		int difference = sc.nextInt();
		
		int AP = firstTerm +(lastTerm -1) * difference;
		
		System.out.println(AP);
		
	}
	}

