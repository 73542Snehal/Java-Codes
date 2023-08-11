package javaFullTest;
/*Merge Two BSTs
Send Feedback
Given two binary search trees ,merge the two given balanced BSTs into a balanced binary search tree.
Note: You just have to return the root of the balanced BST.
Give solution of O(m+n) time complexity.
Input format :
Line 1 :  Elements in level order form of first tree (separated by space)
(If any node does not have left or right child, take -1 in its place)
Line 2: Elements in level order form of second tree (separated by space)
(If any node does not have left or right child, take -1 in its place)
Output Format :
Print the inorder form of new BST
Sample Input 1:
2 1 3 -1 -1 -1 -1
4 -1 -1
Sample Output 1:
 1 2 3 4 */
import java.util.*;
public class MergeTwoBSTs {
}
/*


import java.util.Scanner;

class QueueEmptyException extends Exception {
}

class Queue<T> {

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
	public void setRight(BinaryTreeNode<T> root)
	{
		right=root;
		
	}
	public void setLeft(BinaryTreeNode<T> root)
	{
		left=root;
		
	}
}

public class runner {

	static Scanner s = new Scanner(System.in);
	

	public static BinaryTreeNode<Integer> takeInput() {
		Queue<BinaryTreeNode<Integer>> pendingNodes = new Queue<BinaryTreeNode<Integer>>(); // we
																							// can
																							// skip
																							// writing
																							// again
																							// inside
																							// <>
																							// after
																							// java
																							// version
																							// 1.7
		
		int rootData = s.nextInt();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);

		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> currentNode;
			try {
				currentNode = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				return null;
			}
			int leftChildData = s.nextInt();
			if (leftChildData != -1) {
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(
						leftChildData);
				currentNode.left = leftChild;
				pendingNodes.enqueue(leftChild);
			}
			int rightChildData = s.nextInt();
			if (rightChildData != -1) {
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(
						rightChildData);
				currentNode.right = rightChild;
				pendingNodes.enqueue(rightChild);
			}
		}
	
		return root;
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root1 = takeInput();
		BinaryTreeNode<Integer> root2 = takeInput();

		

		solution.printMergeTrees(root1,root2);
		
		
	}

}
*/

/*public class solution {
    static void printMergeTrees(BinaryTreeNode<Integer> root1, BinaryTreeNode<Integer> root2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        inOrderTraversal(root1, arr1);
        inOrderTraversal(root2, arr2);

        ArrayList<Integer> mergedArr = mergeSortedArrays(arr1, arr2);

        for (int num : mergedArr) {
            System.out.print(num + " ");
        }
    }

    static void inOrderTraversal(BinaryTreeNode<Integer> root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left, arr);
        arr.add(root.data);
        inOrderTraversal(root.right, arr);
    }

    static ArrayList<Integer> mergeSortedArrays(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        ArrayList<Integer> mergedArr = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                mergedArr.add(arr1.get(i));
                i++;
            } else {
                mergedArr.add(arr2.get(j));
                j++;
            }
        }

        while (i < arr1.size()) {
            mergedArr.add(arr1.get(i));
            i++;
        }

        while (j < arr2.size()) {
            mergedArr.add(arr2.get(j));
            j++;
        }

        return mergedArr;
    }

    public static void main(String[] args) {
        // Example usage
        BinaryTreeNode<Integer> root1 = new BinaryTreeNode<>(2);
        root1.left = new BinaryTreeNode<>(1);
        root1.right = new BinaryTreeNode<>(3);

        BinaryTreeNode<Integer> root2 = new BinaryTreeNode<>(4);

        printMergeTrees(root1, root2);
    }
}
*/