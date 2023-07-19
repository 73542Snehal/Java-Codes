package questions_4;

import java.util.Scanner;

/*Even after Odd Linked List
Send Feedback
For a given singly linked list of integers, arrange the elements such that all the even numbers are placed after the odd numbers. The relative order of the odd and even terms should remain unchanged.
Note :
No need to print the list, it has already been taken care. Only return the new head to the list.
Input format:
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains the elements of the singly linked list separated by a single space. 
 Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output format:
For each test case/query, print the elements of the updated singly linked list.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Where M is the size of the singly linked list.

Time Limit: 1sec
Sample Input 1 :
1
1 4 5 2 -1
Sample Output 1 :
1 5 4 2 
Sample Input 2 :
2
1 11 3 6 8 0 9 -1
10 20 30 40 -1
Sample Output 2 :
1 11 3 9 6 8 0
10 20 30 40*/
public class EvenafterOddLL {
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

	//code
	public static Node<Integer> evenAfterOdd(Node<Integer> head) {
		Node<Integer>current=head;
		Node<Integer>evenHead=null;
		Node<Integer>oddHead=null;
		Node<Integer>evenTail=null;
		Node<Integer>oddTail=null;
		if(head == null|| head.next == null){
			return head;
		}
		while(current!=null)
		{
			if(current.data%2==0)
			{
				if(evenHead==null)
				{
					evenHead=evenTail=current;
				}
				else
				{
					evenTail.next=current;
					evenTail=current;
				}
			}
			else
			{
				if(oddHead==null)
				{
					oddHead=oddTail=current;
				}
				else
				{
					oddTail.next=current;
					oddTail=current;
				}
			}
			current=current.next;
		}
		if(oddHead == null){
			oddHead = oddTail = evenHead;
		}else if(evenHead!=null){
			oddTail.next=evenHead;
			evenTail.next=null;
		}
		return oddHead;
	}

	public static void main(String[] args) {

		Node<Integer> head = takeInput();
		Node<Integer> ans = evenAfterOdd(head);
		print(ans);


	}
}
