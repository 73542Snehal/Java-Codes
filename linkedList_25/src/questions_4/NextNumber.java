package questions_4;

import java.util.Scanner;
/*Next Number
Send Feedback
Given a large number represented in the form of a linked list. Write code to increment the number by 1 in-place(i.e. without using extra space).
Note: You don't need to print the elements, just update the elements and return the head of updated LL.
Input Constraints:
1 <= Length of Linked List <=10^6.
Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Output Format :
Line 1: Updated linked list elements 
Sample Input 1 :
3 9 2 5 -1
Sample Output 1 :
3 9 2 6
Sample Input 2 :
9 9 9 -1
Sample Output 1 :
1 0 0 0 */
public class NextNumber {

	
	public static Node<Integer> nextLargeNumber(Node<Integer> head) {
		   
		 Node<Integer> dummy = new Node<>(0);
	    dummy.next = head;

	    Node<Integer> lastNonNine = dummy;
	    Node<Integer> curr = head;

	    while (curr != null) {
	        if (curr.data != 9) {
	            lastNonNine = curr;
	        }
	        curr = curr.next;
	    }

	    lastNonNine.data += 1;
	    curr = lastNonNine.next;

	    while (curr != null) {
	        curr.data = 0;
	        curr = curr.next;
	    }

	    if (dummy.data == 1) {
	        return dummy;
	    } else {
	        return dummy.next;
	    }
	}
	
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
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		Node<Integer> head = takeInput();
		head = nextLargeNumber(head);
		print(head);


	}
}
	
	

