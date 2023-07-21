package questions_4;
/*Delete every N nodes
Send Feedback
You have been given a singly linked list of integers along with two integers, 'M,' and 'N.' 
Traverse the linked list such that you retain the 'M' nodes, then delete the next 'N' nodes. 
Continue the same until the end of the linked list.
To put it in other words, in the given linked list, you need to delete N nodes after every M nodes.
Note :
No need to print the list, it has already been taken care. Only return the new head to the list.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains the elements of the singly linked list separated by a single space.

The second line of input contains two integer values 'M,' and 'N,' respectively. A single space will separate them.
 Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output format :
For each test case/query, print the elements of the updated singly linked list.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t <= 10^2
0 <= P <= 10^5
Where P is the size of the singly linked list.
0 <= M <= 10^5
0 <= N <= 10^5 

Time Limit: 1sec
Sample Input 1 :
1
1 2 3 4 5 6 7 8 -1
2 2
Sample Output 1 :
1 2 5 6
Sample Input 2 :
2
10 20 30 40 50 60 -1
0 1
1 2 3 4 5 6 7 8 -1
2 3
Sample Output 2 :
1 2 6 7
Explanation of Sample Input 2 :
For the first query, we delete one node after every zero elements hence removing all the items of the list. Therefore, nothing got printed.

For the second query, we delete three nodes after every two nodes, resulting in the final list, 1 -> 2 -> 6 -> 7.*/
import java.util.Scanner;

public class deleteEveryNnodes {
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
	public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
		 if(head==null)
		            return head;
		        if(M==0)
		            return null;
		        if(N==0)
		            return head;
		        Node<Integer> curr=head,t;
		        int count;
		        while(curr!=null)
		        {
		        for(count=1;count<M && curr!=null;count++)
		        {
		            curr=curr.next;
		        }
		        if(curr==null)
		            return head;
		        t=curr.next;
		        for(count=1;count<=N && t!=null;count++)
		        {
		            t=t.next;
		        }
		        curr.next=t;
		        curr=t;}
		        return head;

		    }

	public static void main(String[] args) {

		Node<Integer> head = takeInput();
		Scanner sc= new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		Node<Integer> newHead = skipMdeleteN(head, m, n);
        print(newHead);


	}
}
