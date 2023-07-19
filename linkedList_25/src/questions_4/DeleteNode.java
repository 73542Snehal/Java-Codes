package questions_4;

import java.util.Scanner;

public class DeleteNode {
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
		
		public static Node<Integer>deleteNode(Node<Integer> head,int position){
			if(head == null) {
				return head;
			}
			if(position == 0) {
				return head.next;
			}
			
			int count =0;
			Node<Integer> currentHead = head;
			while(currentHead != null && count<(position-1)) {
				currentHead = currentHead.next;
				count++;
			}
			
			if(currentHead == null || currentHead.next == null) {
				return head;
			}
			
			currentHead.next = currentHead.next.next;
			return head;
		}
		
		//recursion
		
		public static Node<Integer> deleteNodeRec(Node<Integer> head, int position) {
		   	if(head == null && position > 0) {
						return head;
					
				}
				if(position==0)
				{ 
					if(head==null) 
						return head;
					else
						return head.next;
				}
				Node<Integer>next=deleteNodeRec(head.next, position-1);
				head.next=next;
				return head;
			}

		

		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			Node<Integer> head = takeInput();
			
			int position = sc.nextInt();
			head = deleteNode(head,position);
			//recursion
			//head= deleteNodeRec(head,position);
			print(head);
			
			
		}
}
