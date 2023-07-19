package recursion;

import java.util.Scanner;

public class binarySearchUsingRecursion {

    public static int binarySearch(int a[],int si,int ei,int x){
        if(si>ei){
            return -1;
        }
        int midIndex=(si+ei)/2;
        if(a[midIndex]==x){
            return midIndex;
        }else if(a[midIndex]<x){
            return binarySearch(a,midIndex+1,ei,x);
        }else{
            return binarySearch(a,si,midIndex-1,x);
        }
    }
    
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
    public static void main(String[] args){
    
    	  Scanner s=new Scanner(System.in);
    	int[] arr =takeInput();
    	System.out.println("Enter key to search: ");
    	int x = s.nextInt();
      int ans = binarySearch(arr,0,arr.length-1,x);
      System.out.println(ans);
    }
}

