package recursion;

import java.util.Scanner;

//check if given array is sorted or not
public class checkArraySorted {
	
	//better approach
	   public static boolean isSortedBetter(int a[],int si){
	        if(si==a.length-1){
	            return true;
	        }
	        if(a[si]>a[si+1]){
	            return false;
	        }
	        boolean isSmallArraySorted=isSortedBetter(a,si+1);
	        return isSmallArraySorted;
	    }
	
	/*  public static boolean isSorted(int a[]){
	        if(a.length==1){
	            return true;
	        }
	        if(a[0]>a[1]){
	            return false;
	        }
	        int smallArray[]=new int[a.length-1];
	        for(int i=1;i<a.length;i++){
	            smallArray[i-1]=a[i];
	        }
	        boolean isSmallArraySorted=isSorted(smallArray);
	        return isSmallArraySorted;
	    }*/
	  
	   public static int[] takeInput(){
	        Scanner s=new Scanner(System.in);
	        int n=s.nextInt();
	        int[]arr=new int[n];
	        for(int i=0;i<n;i++){
	            System.out.println("Enter element at "+i+"th index");
	            arr[i]=s.nextInt();
	        }
	        return arr;
	        
	    }
	   
		public static void main(String[] args) {
			
			int[] arr =takeInput();
			//boolean  ans =isSorted(arr);
			boolean  ans =isSortedBetter(arr,0);
			System.out.println(ans);
		}

}
