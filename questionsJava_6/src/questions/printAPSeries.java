package questions;

import java.util.Scanner;

public class printAPSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter firstTerm lastTerm difference ");
		
		int firstTerm = sc.nextInt();
		int noOfTerms = sc.nextInt();
		int difference = sc.nextInt();
		
		int currentTerm = firstTerm;
		
		for(int i = 0; i<noOfTerms;i++) {
			System.out.print(currentTerm + " ");
            currentTerm = currentTerm + difference;   		
		}

	}

}
