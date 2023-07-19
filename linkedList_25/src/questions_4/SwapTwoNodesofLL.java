package questions_4;

import java.util.Scanner;

/*Swap Two Nodes of Linked List
Send Feedback
You have been given a singly linked list of integers along with two integers, 'i,' and 'j.' Swap the nodes that are present at the 'i-th' and 'j-th' positions.
Note :
Remember, the nodes themselves must be swapped and not the datas.

No need to print the list, it has already been taken care. Only return the new head to the list.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains the elements of the singly linked list separated by a single space.

The second line of input contains two integer values 'i,' and 'j,' respectively. A single space will separate them.
 Remember/consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output format :
For each test case/query, print the elements of the updated singly linked list.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Where M is the size of the singly linked list.
0 <= i < M
0 <= j < M

Time Limit: 1sec
Sample Input 1 :
1
3 4 5 2 6 1 9 -1
3 4
Sample Output 1 :
3 4 5 6 2 1 9 
 Sample Input 2 :
2
10 20 30 40 -1
1 2
70 80 90 25 65 85 90 -1
0 6
 Sample Output 2 :
10 30 20 40 
90 80 90 25 65 85 70 */
public class SwapTwoNodesofLL {
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
	public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
        if (head == null || i == j) {
           return head;
       }
	Node<Integer> temp=head,prev=null,c1=null,c2=null,p1=null,p2=null;
       int pos=0;
       while(temp!=null)
       {
           if(pos==i)
           {
               p1=prev;
               c1=temp;
           }
else if(pos==j)
{
   p2=prev;
   c2=temp;
}
           prev=temp;
           temp=temp.next;
           pos++;
       }
       if(p1!=null)
       {
           p1.next=c2;
       }
       else{
           head=c2;
       }
       if(p2!=null){
           p2.next=c1;
       }
       else{
           head=c1;
       }
       Node<Integer> temp1=c2.next;
       c2.next=c1.next;
       c1.next=temp1;
       return head;
   }

	public static void main(String[] args) {

		Node<Integer> head = takeInput();
		Scanner sc= new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		  Node<Integer> newHead =swapNodes(head, i, j);
          print(newHead);

	}
}
