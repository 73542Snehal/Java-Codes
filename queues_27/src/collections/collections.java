package collections;
//queues in collection frame work is interface which has LL as class
import java.util.*;

public class collections {
	public static void main(String[] args) {
		 Queue<Integer> queue = new LinkedList<Integer>();
		 queue.add(10);//to add elements in queue
		 queue.add(20);
		System.out.println("Peek " + queue.peek());//to see front element
		System.out.println("Poll " + queue.poll());//queue.remove(); to delete front element
		System.out.println("Size " + queue.size());//to check size
		System.out.println("Empty " + queue.isEmpty());//to check empty or not
		
	
		 
	}
}
