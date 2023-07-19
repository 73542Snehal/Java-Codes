package arrayList;

import java.util.ArrayList;

public class printArrayList {
	public static void main(String[] args) {


		ArrayList<Integer> arr = new ArrayList<>();


		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);

		//for loop
		System.out.println("For loop");
		for(int i=0;i<arr.size();i++) {//here i is index of array list
			System.out.print(arr.get(i)+" ");
		}


		//for each loop
		System.out.println('\n'+"For each loop");
		for(int i : arr) {//here i is element of array list
			System.out.print(i+" ");
		}
	}
}
