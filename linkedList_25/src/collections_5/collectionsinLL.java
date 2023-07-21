package collections_5;
//LL collection framework is a collection of all the functions in LL that we can use directly

import java.util.LinkedList;//import this to use all the functions

public class collectionsinLL {
	   public static void main(String[] args){
	        LinkedList<Integer> list= new LinkedList<>();//LL used here is by default doubly LL
	        list.add(10);
	        list.add(20);
	        list.add(30);
	        list.add(1,100);
	        list.addFirst(80);
	        list.set(0,60);
	        list.remove();

	        //to print the LL
	        for(int i=0;i<list.size();i++){
	            System.out.println(list.get(i));
	        }
	    }
	}
