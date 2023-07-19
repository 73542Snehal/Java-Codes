package printLL_2;
//Increment linked list by 1
public class increment {
	
	public static Node<Integer> createLL() {
		Node<Integer> n1 = new Node<>(10);//create node
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;

		return n1;
	}

	//function to print
	public static void print(Node<Integer> head) {

		Node<Integer> temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	//function to increment
	public static void Increment(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			temp.data++;
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		Node<Integer> head = createLL();
		Increment(head);
		print(head);


	}
}


