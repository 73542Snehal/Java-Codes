package queueUsingLL;
//time complexity of all the functions in queue is O(1)
public class queueUsingLL<T> {
	
	private Node<T> front;
	private Node<T> rear;
	int size;
	
	public queueUsingLL() {
		front = null;
		rear = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void enqueue(T element) {
		Node<T> newNode = new Node<T>(element);
		size++;
		if(front == null) {
			front = newNode;
			rear = newNode;
		}else {
			rear.next = newNode;
			rear = newNode;
		}
	}
	
	public T front() throws QueueEmptyException {
		if(front == null) {
			throw new QueueEmptyException();
		}
		return front.data;
	}
	
	public T dequeue() throws QueueEmptyException {
		if(front == null) {
			throw new QueueEmptyException();
		}
		T temp = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		size--;
		return temp;
	}
}
