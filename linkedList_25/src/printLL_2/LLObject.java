package printLL_2;
import java.util.*;;

public class LLObject {

	//function for creating linked list
	public static Node<Integer> createLL() {
		Node<Integer> n1 = new Node<>(10);//create node
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);

		n1.next = n2;//store address of next node
		System.out.println("n1 "+n1+"   Data "+n1.data+"   Next"+n1.next);
		n2.next = n3;
		System.out.println("n2 "+n2+"   Data "+n2.data+"   Next"+n2.next);
		n3.next = n4;
		System.out.println("n3 "+n3+"   Data "+n3.data+"   Next"+n3.next);
		System.out.println("n4 "+n4+"   Data "+n4.data+"   Next"+n4.next);
		return n1;//return first node
	}

	//function to print
	public static void print(Node<Integer> head) {
		System.out.println("*************************************************");
		System.out.println(head.data);//10
		System.out.println(head.next);//address of next node
		System.out.println(head.next.data);//20
		System.out.println(head.next.next.data);//30
		System.out.println(head.next.next.next.data);//40

	}

	public static void main(String[] args) {

		Node<Integer> head = createLL();
		print(head);

	}
}
