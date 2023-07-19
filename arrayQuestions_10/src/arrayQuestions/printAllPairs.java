package arrayQuestions;
//print all possible pairs

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