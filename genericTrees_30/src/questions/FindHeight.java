package questions;
/*Code : Find Height
Send Feedback
Given a generic tree, find and return the height of given tree. The height of a tree is defined as the longest distance from root node to any of the leaf node. Assume the height of a tree with a single node is 1.
Input Format:
The first line of input contains data of the nodes of the tree in level order form. The order is: data for root node, number of children to root node, data of each of child nodes and so on and so forth for each node. The data of the nodes of the tree is separated by space.  

For the above tree, height will be 3 as the leaf nodes which are present at longest distance are 40, 50.(10->20->40) or (10->20->50).
Output Format :
The first and only line of output prints the height of the given generic tree.
Constraints:
Time Limit: 1 sec
Sample Input 1:
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 1:
3*/
public class FindHeight {


	/*	TreeNode structure 
	 * 
	 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/

//	public static int getHeight(TreeNode<Integer> root){
	
    public static int getHeight(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        int maxChildHeight = 0;

        for (TreeNode<Integer> child : root.children) {
            int childHeight = getHeight(child);
            if (childHeight > maxChildHeight) {
                maxChildHeight = childHeight;
            }
        }

        return 1 + maxChildHeight;
    }
}

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class QueueEmptyException extends Exception {
}

class QueueUsingLL<T> {

	class Node<T> {
		T data;
		Node<T> next;

		Node(T data) {
			this.data = data;
		}
	}

	private Node<T> head;
	private Node<T> tail;
	private int size = 0;

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	public T front() throws QueueEmptyException {
		if (size == 0) {
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}

		return head.data;
	}

	public void enqueue(T element) {
		Node<T> newNode = new Node<T>(element);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}

		size++;
	}

	public T dequeue() throws QueueEmptyException {
		if (head == null) {
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		if (head == tail) {
			tail = null;
		}
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
}

class TreeNode<T> {
	T data;
	ArrayList<TreeNode<T>> children;

	TreeNode(T data) {
		this.data = data;
		children = new ArrayList<TreeNode<T>>();
	}
}

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
	static StringTokenizer st;

	public static TreeNode<Integer> takeInputLevelWise() throws IOException {
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>(); // Queue of node that are
		// entered themselves
		// but their children
		// aren't added yet
		st = new StringTokenizer(br.readLine());
		int rootData = Integer.parseInt(st.nextToken());
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while (!pendingNodes.isEmpty()) {
			TreeNode<Integer> currentNode;
			try {
				currentNode = pendingNodes.dequeue();
				int numChild = Integer.parseInt(st.nextToken());
				for (int i = 0; i < numChild; i++) {
					int currentChild = Integer.parseInt(st.nextToken());
					TreeNode<Integer> childNode = new TreeNode<Integer>(currentChild);
					pendingNodes.enqueue(childNode);
					currentNode.children.add(childNode);
				}
			} catch (QueueEmptyException e) {
			}
		}
		return root;
	}

	public static void main(String[] args) throws IOException {
		TreeNode<Integer> root = takeInputLevelWise();
		System.out.println(Solution.getHeight(root));

	}

}*/
