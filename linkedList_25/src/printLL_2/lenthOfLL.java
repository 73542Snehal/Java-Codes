package printLL_2;

public class lenthOfLL {
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

	//function to print LL of linked list
	public static int Length(Node<Integer> head) {
		int count = 0;
		Node<Integer> temp = head;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		
		return count;
	}

	public static void main(String[] args) {

		Node<Integer> head = createLL();
		int ans =Length(head);
		System.out.println(ans);
	}
}


