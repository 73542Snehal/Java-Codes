package questions_4;

import java.util.Scanner;
/*Bubble Sort (Iterative) Linked List
Send Feedback
Given a singly linked list of integers, sort it using 'Bubble Sort.'
Note :
No need to print the list, it has already been taken care. Only return the new head to the list.
Input format :
The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output format :
For each test case/query, print the elements of the sorted singly linked list.

Output for every test case will be printed in a seperate line.
Constraints :
0 <= M <= 10^3
Where M is the size of the singly linked list.

Time Limit: 1sec
Sample Input 1 :
10 9 8 7 6 5 4 3 -1
Sample Output 1 :
 3 4 5 6 7 8 9 10 
 Sample Input 2 :
10 -5 9 90 5 67 1 89 -1
Sample Output 2 :
-5 1 5 9 10 67 89 90 */
public class BubbleSortLL {

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
	
	public static Node<Integer> bubbleSort(Node<Integer> head) {
		 if(head==null || head.next==null)
		        return head;
		        //Write your code here
		        for(int i=0;i<lengthLL(head)-1;i++){
		           Node<Integer> prev = null;
		            Node<Integer> curr = head;
		            Node<Integer> next = curr.next;

		            while(curr.next != null){
		                if(curr.data > curr.next.data){
		                    if(prev == null){
		                        curr.next = next.next;
		                        next.next = curr;
		                        prev = next;
		                        head = prev;
		                    }else{
		                        next = curr.next;
		                        curr.next = next.next;
		                        prev.next = next;
		                        next.next = curr;
		                        prev = next;
		                    }
		                }else{
		                    prev = curr;
		                    curr = curr.next;
		                }
		            }
		        }
		        return head;
		    }
		    
		    private static int lengthLL(Node<Integer> head){
		        int count = 1;
		        while(head.next != null){
		            head = head.next;
		            count++;
		        }
		        return count;
		    }

	public static void main(String[] args) {

		Node<Integer> head = takeInput();

    	head = bubbleSort(head);
    	print(head);


	}
}
