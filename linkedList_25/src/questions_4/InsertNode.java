package questions_4;

import java.util.*;

public class InsertNode {

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

		public static Node<Integer> insertNode(Node<Integer> head,int element,int position) {

			Node<Integer> nodeToInsert = new Node<Integer>(element);
		
			if(position==0){	
				nodeToInsert.next= head;
				return nodeToInsert;
				
			}else{
				int count = 0;
				Node<Integer> prev = head;
				while(count<position-1 && prev != null) {
					count++;
					prev = prev.next;
				}
				if(prev != null) {
				nodeToInsert.next = prev.next;
				prev.next = nodeToInsert;
				}
				return head;
			}		
		}
		
		//recursive method
		public static Node<Integer> insertNodeRecursive(Node<Integer> head,int element,int position) {
			
			if(head == null && position > 0) {
				return head;
			}
			if(position ==0 ){
				Node<Integer> newNode = new Node<Integer>(element);
				newNode.next = head;
				return newNode;
			}else {
				head.next = insertNodeRecursive(head.next,element,position-1);
				return head;
			}
		}


		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			Node<Integer> head = takeInput();
			int element = sc.nextInt();
			int position = sc.nextInt();
			head = insertNode(head,element,position);
			print(head);
		//recursion
			//head = insertNodeRecursive(head,element,position);
			//print(head);
		}
	}
