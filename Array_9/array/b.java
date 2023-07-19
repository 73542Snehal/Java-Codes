package array;
//input output of an array

import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter size of an array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+i+"th element");
			arr[i] = sc.nextInt();
			
		}
		
		for(int i=0; i<n; i++) {
			System.out.println("Array element at "+i+" is: "+arr[i]);
		}
		
	}

}
