package searchingSorting;

import java.util.Scanner;

public class quickSort_7 {

 
    public static void quickSort(int a[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pivotIndex=partition(a,si,ei);
        quickSort(a,si,pivotIndex-1);
        quickSort(a,pivotIndex+1,ei);
    }
    
    public static int partition(int a[],int si,int ei){
        int pivotElement=a[si];
        int smallerNumCount=0;
        for(int i=si+1;i<=ei;i++){
            if(a[i]<pivotElement){
                smallerNumCount++;
            }
        }
        int temp=a[si+smallerNumCount];
        a[si+smallerNumCount]=pivotElement;
        a[si]=temp;
        int i=si;
        int j=ei;
        while(i<j){
            if(a[i]<pivotElement){
                i++;
            }else if(a[j]>=pivotElement){
                j--;
            }else{
                 temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
        return si+smallerNumCount;
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
			System.out.print(arr[i]+" ");
		}
	}
    
    public static void main(String[] args){
        
    	  Scanner s=new Scanner(System.in);
    	int[] arr =takeInput();
    	
       quickSort(arr,0,arr.length-1);
       printArray(arr);
   
    }
}
