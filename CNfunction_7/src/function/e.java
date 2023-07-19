package function;
//print even numbers

import java.util.Scanner;

public class e {

	public static void printEvenNo() {
		for(int i=2; i<=100; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	
	public static void print(int start,int end) {
		
		if(start % 2 !=0) {
			start++;
		}
		for(int i =start; i<=end;i+=2) {
			
			System.out.print(i+" ");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		printEvenNo();
		
		print(2,100);
	}

}
