package queueUsingArray;

public class QueueObject {

	public static void main(String[] args) {
		QueueUsingArray queue = new QueueUsingArray();
		
		int[] arr = {10,20,30,40};
		
		for(int elem : arr) {
			try {
				queue.enqueue(elem);
			} catch (QueueFullException e) {
				//we are not going to reach here
				
			}
		}
		
		while(!queue.isEmpty()) {
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				//we are not going to reach here
			}
		}
		
		}
	}

