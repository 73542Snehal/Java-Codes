package printLL_2;
import java.util.*;

public class ithnode {

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
	public static void print(Node<Integer> head,int index) {

		Node<Integer> temp = head;
		int count = 0;
		while(temp != null) {
			if(count == index) {
				System.out.println(count);
				return;
			}
			count++;
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		Node<Integer> head = createLL();
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		print(head,index);


	}
}
