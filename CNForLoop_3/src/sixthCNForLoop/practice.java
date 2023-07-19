package sixthCNForLoop;
import java.util.Scanner;
public class practice {

		public static int[] takein() {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int arr[] = new int[n];

	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	return arr;
}

public static int search(int[] arr,int x) {

	for(int i=0;i<arr.length;i++) {
		if(arr[i]==x) {
			return i;
		}			
	}
	return -1;
}
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	int arr[]=takein();
	System.out.println("enter no to search");
	int x =sc.nextInt();
	int sum = search(arr,x);

	System.out.println("no found at index="+sum);
}
}