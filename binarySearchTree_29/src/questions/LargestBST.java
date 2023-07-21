package questions;
/*Largest BST
Send Feedback
Given a Binary tree, find the largest BST subtree. That is, 
you need to find the BST with maximum height in the given binary tree. You have to return the height of largest BST.
Note :
The binary tree will be consisting of only unique elements.
Input format :
The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.
Output format:
The first and only line of output contains the height of the largest BST.
Constraints:
Time Limit: 1 second
Sample Input 1:
5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1
Sample Output 1:
2*/
public class LargestBST {
/*class BSTReturn {
    public int min;
    public int max;
    public int height;
    public boolean isBST;
}
public class Solution {




    public static BSTReturn helper(BinaryTreeNode<Integer> root) {
        if (root == null) {
            BSTReturn ans = new BSTReturn();
            ans.min = Integer.MAX_VALUE;
            ans.max = Integer.MIN_VALUE;
            ans.height = 0;
            ans.isBST = true;
            return ans;
        }

        BSTReturn left = helper(root.left);
        BSTReturn right = helper(root.right);

        if (!(left.isBST && left.max < root.data)) {
            left.isBST = false;
        }

        if (!(right.isBST && right.min > root.data)) {
            right.isBST = false;
        }

        if (!left.isBST || !right.isBST || root.data > right.min || root.data < left.max) {
            if (left.height > right.height) {
                left.isBST = false;
                return left;
            } else {
                right.isBST = false;
                return right;
            }
        }

        BSTReturn ans = new BSTReturn();
        ans.isBST = true;
        ans.min = Math.min(Math.min(left.min, root.data), right.min);
        ans.max = Math.max(Math.max(left.max, root.data), right.max);
        ans.height = Math.max(left.height, right.height) + 1;
        return ans;
    }

    public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
        return helper(root).height;
    }}
*/
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

class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}
}

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static BinaryTreeNode<Integer> takeInput() throws IOException {
		st = new StringTokenizer(br.readLine());
		int rootData = Integer.parseInt(st.nextToken());
		if (rootData == -1) {
			return null;
		}
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<BinaryTreeNode<Integer>>();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);

		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> currentNode;
			try {
				currentNode = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				return null;
			}
			int leftChildData = Integer.parseInt(st.nextToken());
			if (leftChildData != -1) {
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftChildData);
				currentNode.left = leftChild;
				pendingNodes.enqueue(leftChild);
			}
			int rightChildData = Integer.parseInt(st.nextToken());
			if (rightChildData != -1) {
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightChildData);
				currentNode.right = rightChild;
				pendingNodes.enqueue(rightChild);
			}
		}
		return root;
	}
	
	public static void main(String[] args) throws IOException {
		BinaryTreeNode<Integer> root = takeInput();
		System.out.println(Solution.largestBSTSubtree(root));
	}

}*/
