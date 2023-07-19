package hashMap;
/*Pair Sum to 0
Send Feedback
Given a random integer array A of size N. Find and print the count of pair of elements in the array which sum up to 0.
Note: Array A can contain duplicate elements as well.
Input format:
The first line of input contains an integer, that denotes the value of the size of the array. Let us denote it with the symbol N.
The following line contains N space separated integers, that denote the value of the elements of the array.
Output format :
The first and only line of output contains the count of pair of elements in the array which sum up to 0. 
Constraints :
0 <= N <= 10^4
Time Limit: 1 sec
Sample Input 1:
5
2 1 -2 2 3
Sample Output 1:
2
Explanation
(2,-2) , (-2,2) will result in 0 , so the answer for the above problem is 2.*/

import java.util.*;

public class PairSumto0 {
	public static int PairSum(int[] input, int size) {
		if (size==0)
	            return 0;
	        
	        HashMap<Integer,Integer> map = new HashMap<>();
	        for(int key:input)
	        {	
	            if(map.containsKey(key))
	        	{
	            	map.put(key,map.get(key)+1);
	        	}
	            else
	            {
	                map.put(key,1);
	            }   
	        }
	        /*
	        for (Integer i: map.keySet())
	        {
	            System.out.println(i + ": " + map.get(i));
	        }
	        System.out.println();
	        */
	        int countPairs=0;
	        for (Integer i: map.keySet())
	        {
	            if (map.containsKey(-i) && i!=0)
	            {
	                //System.out.println("Found the negative of " + i);
	            	countPairs=countPairs+(map.get(i)*map.get(-i));   
	                //System.out.println("Current count of pairs: "+countPairs);
	                //map.remove(i);
	            }
	            //System.out.println();
	        }
	        countPairs=countPairs/2;
	        if (map.containsKey(0))
	        {
	            int val=map.get(0);
	            countPairs=countPairs+(val*(val-1))/2;
	        }
	        return countPairs;
		}
}

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }
        
		String[] strNums;
		strNums = br.readLine().split("\\s");
		
        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {


        int[] arr = takeInput();
        System.out.print(Solution.PairSum(arr,arr.length));


    }
}*/
