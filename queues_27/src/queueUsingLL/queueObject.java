package queueUsingLL;

public class queueObject {
	
	public static void main(String[] args) {
		
	
	queueUsingLL<Integer> queue = new queueUsingLL<>();
	
	int arr[] = {10,20,30,40,50};
	
	for(int elem : arr) {
			queue.enqueue(elem);
	
	}
	
	while(!queue.isEmpty()) {
		try {
			System.out.println(queue.dequeue());
		} catch (QueueEmptyException e) {
			//we are not going to reach here
		}
	}
	
	}}
