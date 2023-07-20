package arrayQuestions;
//print all possible pairs
//input
//4
// 1 2 3 4
//(1,2)(1,3)(1,4)(2,3)(2,4)(3,4)
import java.util.Scanner;

public class printAllPairs {
	
	public static int[] takeinput() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		 return arr;		
	}

		public static void printAllPairs(int[] arr){
		    int n=arr.length;
		    for(int i=0;i<n-1;i++){
		        for(int j=i+1;j<n;j++){
		            System.out.print("("+arr[i]+","+arr[j]+")");
		        }
		    }
		}

		    
		public static void main(String args[]) {
		    int[] arr=takeinput();
		    printAllPairs(arr);
		    }
		}