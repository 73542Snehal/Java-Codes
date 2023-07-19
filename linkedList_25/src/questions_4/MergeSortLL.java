package questions_4;

import java.util.Scanner;

/*Merge Sort LL
Send Feedback
 Given a singly linked list of integers, sort it using 'Merge Sort.'
Note :
No need to print the list, it has already been taken care. Only return the new head to the list.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output format :
For each test case/query, print the elements of the sorted singly linked list.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Where M is the size of the singly linked list.

Time Limit: 1sec
Sample Input 1 :
1
10 9 8 7 6 5 4 3 -1
Sample Output 1 :
 3 4 5 6 7 8 9 10 
 Sample Input 2 :
2
-1
10 -5 9 90 5 67 1 89 -1
Sample Output 2 :
-5 1 5 9 10 67 89 90 */
public class MergeSortLL {
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


	
	private static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2) {
        Node<Integer> dummy = new Node<>(0);
        Node<Integer> tail = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }

        // Append the remaining nodes, if any
        if (head1 != null) {
            tail.next = head1;
        } else {
            tail.next = head2;
        }

        return dummy.next;
    }

    // Function to perform merge sort on a linked list
    public static Node<Integer> mergeSort(Node<Integer> head) {
        // Base case: If the list is empty or contains only one element, it is already sorted
        if (head == null || head.next == null) {
            return head;
        }

        // Split the list into two halves
        Node<Integer> slow = head;
        Node<Integer> fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node<Integer> secondHalf = slow.next;
        slow.next = null;

        // Recursively sort the two halves
        Node<Integer> sortedFirstHalf = mergeSort(head);
        Node<Integer> sortedSecondHalf = mergeSort(secondHalf);

        // Merge the sorted halves
        return merge(sortedFirstHalf, sortedSecondHalf);
    }


	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node<Integer> head = takeInput();

		Node<Integer> newhead  = mergeSort(head);

		print(newhead);


	}
}

