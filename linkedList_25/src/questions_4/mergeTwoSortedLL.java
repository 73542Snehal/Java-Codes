package questions_4;

import java.util.Scanner;

public class mergeTwoSortedLL {
	public static Node<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		Node<Integer> head = null;

		while (data != -1) {
			Node<Integer> currentNode = new Node<Integer>(data);
			if(head == null) {
				head = currentNode;
			}else {
				Node<Integer> tail = head;
				while(tail.next != null) {
					tail = tail.next;
				}
				tail.next = currentNode;
			}
			data = sc.nextInt();
		}

		return head;
	}

	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}

	}



	  public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2){
		  if(head1 == null){
	            return head2;
	        }
	        if(head2 == null){
	            return head1;
	        }
	      Node<Integer> t1= head1, t2= head2;
	      Node<Integer> head= null, tail=null;
	      if(t1.data<= t2.data){
	          head=t1;
	          tail=t1;
	          t1=t1.next;
	      }else{
	        head= t2;
	        tail=t2;
	        t2=t2.next;
	      }
	      while(t1 != null && t2!= null){
	        if(t1.data <= t2.data){
	          tail.next= t1;
	          tail=t1;
	          t1= t1.next;
	        }else{
	        tail.next= t2;
	        tail=t2;
	        t2= t2.next;
	        }
	      }
	      if(t1!= null){
	        tail.next= t1;
	      }else{
	        tail.next=t2;
	      }
	      return head;


	        }



	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node<Integer> head1 = takeInput();
		Node<Integer> head2 = takeInput();
		Node<Integer> newhead  = merge(head1,head2);

		print(newhead);


	}
}

