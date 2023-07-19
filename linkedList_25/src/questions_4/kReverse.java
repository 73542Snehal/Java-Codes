package questions_4;

import java.util.Scanner;
/*kReverse
Send Feedback
Given a singly linked list of integers, reverse the nodes of the linked list 'k' at a time and return its modified list.
 'k' is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of 'k,' then left-out nodes, in the end, should be reversed as well.
Example :
Given this linked list: 1 -> 2 -> 3 -> 4 -> 5

For k = 2, you should return: 2 -> 1 -> 4 -> 3 -> 5

For k = 3, you should return: 3 -> 2 -> 1 -> 5 -> 4
 Note :
No need to print the list, it has already been taken care. Only return the new head to the list.
 Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains the elements of the singly linked list separated by a single space.

The second line of input contains a single integer depicting the value of 'k'.
 Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output format :
For each test case/query, print the elements of the updated singly linked list.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Where M is the size of the singly linked list.
0 <= k <= M

Time Limit:  1sec
Sample Input 1 :
1
1 2 3 4 5 6 7 8 9 10 -1
4
Sample Output 1 :
4 3 2 1 8 7 6 5 10 9
Sample Input 2 :
2
1 2 3 4 5 -1
0
10 20 30 40 -1
4
Sample Output 2 :
1 2 3 4 5 
40 30 20 10 */
public class kReverse {
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
	public static Node<Integer> kReverse(Node<Integer> head, int k) {
        if (k <= 1 || head == null || head.next == null) {
            return head;
        }

        Node<Integer> current = head;
        Node<Integer> next = null;
        Node<Integer> prev = null;

        int count = 0;

        // Reverse first 'k' nodes of the linked list
        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        // If there are more nodes, recursively reverse the next group of 'k' nodes
        if (next != null) {
            head.next = kReverse(next, k);
        }

        // 'prev' is now the new head of the reversed group
        return prev;
    }

	public static void main(String[] args) {

		Node<Integer> head = takeInput();
		Scanner sc= new Scanner(System.in);
		int k = sc.nextInt();
	    Node<Integer> newHead = kReverse(head, k);
        print(newHead);


	}
}