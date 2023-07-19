package testquestions;
/*Move To Last
Send Feedback
Given a linked list and a key in it, the task is to move all occurrences of given key to end of linked list, keeping order of all other elements same.
Return the updated head of LL.
Input Format :
Line 1 : Elements of the linked list ending with -1 (-1 not included)
Line 2 : Key n, Element which has to shifted
Output Format :
Updated linked list
Constraints :
1 <= size of list <= 100
Sample Input 1:
1 2 2 3 4 5 -1
2
Sample Output 1:
1 3 4 5 2 2 
Sample Input 2:
1 1 2 3 4 -1
1
Sample Output 2:
2 3 4 1 1*/
public class MoveToLast {

}

/*
 * public class Solution {


	public static Node<Integer> func(Node<Integer> head,int n) {
   

 if (head==null || head.next==null) return head;
        Node<Integer> prev = null,curr= head,tail = head;
        while (tail.next!=null) {
            tail=tail.next;
        }
        Node<Integer> oldTail = tail;
        while (curr.next!=oldTail){
            if (curr.data==n){
                tail.next= new Node<>(n);
                tail= tail.next;
                if (prev==null){
                    curr = curr.next;
                    head = curr;
                }else {
                    prev.next = prev.next.next;
                    curr = prev.next;
                }
            }else {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }

}


*/

//main code
/*import java.util.Scanner;

class Node<T> {
	public T data;
	public Node<T> next;
	public Node(T data) {
		this.data=data;
	}
}

public class Runner {

	static Scanner s=new Scanner(System.in);
	
	public static Node<Integer> createlist() {
		Node<Integer> head = null;
		Node<Integer> rear = null;
		int data = s.nextInt();
		while(data != -1) {
			Node<Integer> newnode = new Node<Integer>(data);
			if(head == null) {
				head = newnode;
				rear = head;
			}
			else {
				rear.next = newnode;
				rear = rear.next;
			}
			data = s.nextInt();
		}
		return head;
	}

	public static void print(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		Node<Integer> head1 = createlist();
		int n = s.nextInt();
		print(Solution.func(head1,n));
	}

}
*/
