package questions_4;

import java.util.Scanner;

public class FindNodeinLinkedList {
	
public static Node<Integer> takeInput() {
		
		Scanner sc= new Scanner(System.in);
		int data = sc.nextInt();//keep taking numbers input till user enter -1
		
		Node<Integer> head = null;
		
		while(data != -1) {
			
			Node<Integer> currentNode = new Node<Integer>(data);
			if(head == null) {
				head = currentNode;//make this node as head node
			}else {
				Node<Integer> tail = head;
				while(tail.next != null) {
					tail = tail.next;//tail will refer to last node
				}
				tail.next = currentNode;//connect current node after last node
			}
			data = sc.nextInt();
		}
		return head;
	}

	//function to print
	public static void print(Node<Integer> head) {

		Node<Integer> temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static int findNode(Node<Integer> head, int n) {
		   int index = 0;
		   Node<Integer> temp = head;
     while (temp!= null) {
         if (temp.data == n) {
             return index;
         }
         temp = temp.next;
         index++;
     }
     return -1;
 }

	public static void main(String[] args) {

		
		Scanner sc= new Scanner(System.in);
		Node<Integer> head = takeInput();
		int element = sc.nextInt();
		int ans = findNode(head,element);
		System.out.println(ans);
		//print(head);


	}}