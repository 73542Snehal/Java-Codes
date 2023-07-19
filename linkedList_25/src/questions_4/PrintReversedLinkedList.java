package questions_4;

import java.util.Scanner;

/*Print Reversed Linked List
Send Feedback
You have been given a singly linked list of integers. Write a function to print the list in a reverse order.
To explain it further, you need to start printing the data from the tail and move towards the head of the list, printing the head data at the end.
Note :
You can’t change any of the pointers in the linked list, just print the linked list in the reverse order.
 Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
Output format :
For each test case, print the singly linked list of integers in a reverse fashion, in a row, separated by a single space.

Output for every test case will be printed in a seperate line.
 Constraints :
1 <= t <= 10^2
0 <= M <= 10^3


Time Limit: 1sec

Where 'M' is the size of the singly linked list.
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
Sample Input 1 :
1
1 2 3 4 5 -1
Sample Output 1 :
5 4 3 2 1
Sample Input 2 :
2
1 2 3 -1
10 20 30 40 50 -1
Sample Output 2 :
3 2 1
50 40 30 20 10*/
public class PrintReversedLinkedList {
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


	//function to print in order recursively
	public static void printLL(Node<Integer> head) {

		if(head == null) {
			return;
		}

		System.out.print(head.data+" ");
		printReverse(head.next);
		System.out.println();

	}
	//function to print in reverse recursively
	public static void printReverse(Node<Integer> head) {

		if(head == null) {
			return;
		}

		printReverse(head.next);
		System.out.print(head.data+" ");
	}

	public static void main(String[] args) {

		Node<Integer> head = takeInput();
		printLL(head);
		printReverse(head);


	}}
