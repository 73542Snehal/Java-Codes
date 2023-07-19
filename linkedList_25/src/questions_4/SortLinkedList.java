package questions_4;

public class SortLinkedList {
/*

	 Following is the class structure of the Node class:

	 class Node {
	     public int data;
	     public Node next;

	     Node()
	     {
	         this.data = 0;
	         this.next = null;
	     }
	     Node(int data)
	     {
	         this.data = data;
	         this.next = null;
	     }
	     Node(int data, Node next)
	     {
	         this.data = data;
	         this.next = next;
	     }
	 }
*/
	

	   
	 /*    
	 public static Node sortList(Node head) {
	    if (head == null || head.next == null) {
	        return head;
	    }

	    // Separate the linked list into two halves
	    Node firstHalf = head;
	    Node secondHalf = splitList(head);

	    // Recursively sort the two halves
	    firstHalf = sortList(firstHalf);
	    secondHalf = sortList(secondHalf);

	    // Merge the sorted halves
	    return mergeLists(firstHalf, secondHalf);
	}

	private static Node splitList(Node head) {
	    Node slow = head;
	    Node fast = head;
	    Node prev = null;

	    while (fast != null && fast.next != null) {
	        prev = slow;
	        slow = slow.next;
	        fast = fast.next.next;
	    }

	    // Disconnect the two halves
	    if (prev != null) {
	        prev.next = null;
	    }

	    return slow;
	}

	private static Node mergeLists(Node list1, Node list2) {
	    Node dummy = new Node();
	    Node curr = dummy;

	    while (list1 != null && list2 != null) {
	        if (list1.data <= list2.data) {
	            curr.next = list1;
	            list1 = list1.next;
	        } else {
	            curr.next = list2;
	            list2 = list2.next;
	        }
	        curr = curr.next;
	    }

	    // Append the remaining nodes
	    if (list1 != null) {
	        curr.next = list1;
	    }

	    if (list2 != null) {
	        curr.next = list2;
	    }

	    return dummy.next;
	}}*/
/*main code
 * import java.io.*;
import java.util.*;

class Node {
    public int data;
    public Node next;

    Node()
    {
        this.data = 0;
        this.next = null;
    }
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
};

public class Runner {
    public static class FastReader {

        BufferedReader br;
        StringTokenizer root;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (root == null || !root.hasMoreTokens()) {
                try {
                    root = new StringTokenizer(br.readLine(), " ");
                } catch (Exception r) {
                    r.printStackTrace();
                }
            }
            return root.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    public static FastReader sc = new FastReader();

    private static int t ;
    private static int []n;
    private static Node[] head;

    private static void takeInput() {
        t = 1;
        n = new int[t];
        head = new Node[t];
        for(int i = 0; i < t; i++) {
            n[i] = sc.nextInt();
            Node temp = null;
            while(n[i]-- > 0){
                Node newNode = new Node(sc.nextInt());
                if(temp == null) {
                    head[i] = newNode;
                    temp = newNode;
                } else {
                    temp.next = newNode;
                    temp = temp.next;
                }
            }
        }
    }

    private static void execute() {
        for(int i = 0; i < t; i++) {
            Solution.sortList(head[i]);
        }
    }

    private static void executeAndPrintOutput() {
        for(int i = 0; i < t; i++){
            Node ans = Solution.sortList(head[i]);
            printList(ans);
        }
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        takeInput();
        executeAndPrintOutput();
        out.close();
    }
}*/
	
}
