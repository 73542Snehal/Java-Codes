package function;
//function to print sum

import java.util.Scanner;

public class d {
	
	public static int sum(int a, int b) {
		int sum = a+b;
		return sum;//return a+b;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int answ = sum(a,b);
		System.out.println(answ);

		int ans = sum(10,15);
		System.out.println(ans);

	}

}
