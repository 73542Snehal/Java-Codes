package array;

public class a {

	public static void main(String[] args) {
		
		int arr[] = new int[10];
		arr[0]=5;
		arr[1]=4;
		
		System.out.println(arr[0]);//5
		System.out.println(arr[1]);//4
		System.out.println(arr[3]);//0 by default array values initializes with int=zero, char = NULL,double=0.0
		System.out.println(arr[-1]);//Index -1 out of bounds for length 10
		System.out.println(arr[10]);//out of bounds for length 10
		System.out.println(arr[11]);//out of bounds for length 10
		
		
		boolean ar[] = new boolean[5];
		System.out.println(ar[0]);
		//Whenever an boolean array is created, all elements are initialised to false.
		
		

	}

}
