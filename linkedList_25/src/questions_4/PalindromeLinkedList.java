package questions_4;

import java.util.Scanner;

/*Palindrome Linked List
Send Feedback
You have been given a head to a singly linked list of integers. Write a function check to whether the list given is a 'Palindrome' or not.
 Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First and the only line of each test case or query contains the the elements of the singly linked list separated by a single space.
 Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
 Output format :
For each test case, the only line of output that print 'true' if the list is Palindrome or 'false' otherwise.
 Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Time Limit: 1sec

Where 'M' is the size of the singly linked list.
Sample Input 1 :
1
9 2 3 3 2 9 -1
Sample Output 1 :
true
Sample Input 2 :
2
0 2 3 2 5 -1
-1
Sample Output 2 :
false
true
Explanation for the Sample Input 2 :
For the first query, it is pretty intuitive that the the given list is not a palindrome, hence the output is 'false'.

For the second query, the list is empty. An empty list is always a palindrome , hence the output is 'true'.*/
public class PalindromeLinkedList {

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

	public static boolean isPalindrome(Node<Integer> head) {
		if (head == null || head.next == null) {
	        // An empty list or a single node is considered a palindrome
	        return true;
	    }
	    
	    Node<Integer> slow = head;
	    Node<Integer> fast = head;
	    Node<Integer> prev = null;
	    
	    // Find the middle node and reverse the second half
	    while (fast != null && fast.next != null) {
	        fast = fast.next.next;
	        Node<Integer> next = slow.next;
	        slow.next = prev;
	        prev = slow;
	        slow = next;
	    }
	    
	    // If the length of the list is odd, move the slow pointer to the next node
	    if (fast != null) {
	        slow = slow.next;
	    }
	    
	    // Compare the first half with the reversed second half
	    while (slow != null) {
	        if (!slow.data.equals(prev.data)) {
	            return false;
	        }
	        slow = slow.next;
	        prev = prev.next;
	    }
	    
	    return true;
	}
		

	

	public static void main(String[] args) {

		Node<Integer> head = takeInput();
		boolean ans= isPalindrome(head);
		System.out.println(ans);

	}
}
