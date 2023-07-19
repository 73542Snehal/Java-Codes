package arrayList;

import java.util.*;

public class basic {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();//syntax
	    //ArrayList<Integer> arr1 = new ArrayList<>(20);//if we want to give default capacity for array list
		
		arr.add(10);//add 10 at index 0
		arr.add(20);//add 20 at index 1
		arr.add(30);//add 30 at index 2
		arr.add(40);
		arr.add(1,80);//add 80 at index 1
		arr.remove(0);//remove element at index zero
		
		Integer k = 40;//if want to remove particular object
		arr.remove(k);
		
		arr.set(0, 100);//set zero at index zero // this will not affect array list size
		
		System.out.println(arr.size());//to get size of array list
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));//to print element at index 1
		System.out.println(arr.get(2));//80 is added at 1st index so 20 and 30 will shift by 1 position
			
	}
}
