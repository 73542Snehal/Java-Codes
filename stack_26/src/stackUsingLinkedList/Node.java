package stackUsingLinkedList;
//if we want to create generic node class

public class Node<T>{

	T data;
	Node<T> next;
	
	Node(T data){
		this.data = data;
		
	}
}
