package searchingSorting;

import java.util.Scanner;

public class mergeSort_6 {
	 
	    public static void mergeSort(int a[]){
	        if(a.length<=1){
	            return;
	        }
	        int b[]=new int[a.length/2];
	        int c[]=new int[a.length-b.length];
	        for(int i=0;i<a.length/2;i++){
	            b[i]=a[i];
	        }
	        for(int i=a.length/2;i<a.length;i++){
	            c[i-a.length/2]=a[i];
	        }
	        mergeSort(b);
	        mergeSort(c);
	        merge(b,c,a);
	    }
	    
	    public static void merge(int[]s1,int[]s2,int[]d){
	        int i=0;
	        int j=0;
	        int k=0;
	        while(i<s1.length && j<s2.length){
	            if(s1[i]<=s2[j]){
	                d[k]=s1[i];
	                i++;
	                k++;
	            }else{
	                d[k]=s2[j];
	                k++;
	                j++;
	            }
	        }
	        if(i<s1.length){
	            while(i<s1.length){
	                d[k]=s1[i];
	                i++;
	                k++;
	            }
	        }
	        if(j<s2.length){
	            while(j<s2.length){
	                d[k]=s2[j];
	                k++;
	                j++;
	            }
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
	    
	    public static void printArray(int[]arr){
			int n=arr.length;
			for(int i=0;i<n;i++){
				System.out.println(arr[i]);
			}
		}
	    
	    public static void main(String[] args){
	        
	    	  Scanner s=new Scanner(System.in);
	    	int[] arr =takeInput();
	    	
	       mergeSort(arr);
	       printArray(arr);
	   
	    }
}
