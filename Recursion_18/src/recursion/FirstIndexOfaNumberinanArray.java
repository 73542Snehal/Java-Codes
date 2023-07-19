package recursion;
/*First Index Of a Number in an Array - Question
Send Feedback
Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
First index means, the index of first occurrence of x in the input array.
Do this recursively. Indexing in the array starts from 0.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
first index or -1
Constraints :
1 <= N <= 10^3
Sample Input :
4
9 8 10 8
8
Sample Output :
1*/

import java.util.*;

public class FirstIndexOfaNumberinanArray {

	 public static int firstIndex(int a[],int x){
	        if(a.length==0){
	            return -1;
	        }
	        if(a[0]==x){
	            return 0;
	        }
	        int smallArray[]=new int[a.length-1];
	        for(int i=1;i<a.length;i++){
	            smallArray[i-1]=a[i];
	        }
	        int fi=firstIndex(smallArray,x);
	        if(fi==-1){
	            return -1;
	        }else{
	            return fi+1;
	        }
	        
	        
	    }
	    /*public static int firstIndexBetter(int a[],int x,int si){
	        if(si==a.length){
	            return -1;
	        }
	        if(a[si]==x){
	            return si;
	        }
	        int k=firstIndexBetter(a,x,si+1);
	        return k;
	    }*/
	    
static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(firstIndex(input, x));
	}
}

