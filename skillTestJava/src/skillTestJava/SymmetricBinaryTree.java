package skillTestJava;
/*Symmetric Binary Tree
Given a binary tree, check whether it is symmetric around its center at every level. That means, return true if the given binary tree and its mirror is exactly same. Otherwise return false.
Input Format :
Nodes in level order form (separated by space). If any node does not have left or right child, take -1 in its place. 
Output Format :
Return true or false.
Constraints :
1 <= Number of Nodes <= 10^5
Sample Input 1 :
1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
Sample Output 1 :
false
Sample Input 2 :
1 2 2 3 4 4 3 -1 -1 -1 -1 -1 -1 -1 -1
Sample Output 2 :
true
Sample Input 3 :
1 2 2 -1 3 -1 3 -1 -1 -1 -1
Sample Output 3 :
false*/
public class SymmetricBinaryTree {
/* public static boolean isSymmetric(BinaryTreeNode<Integer> root){
        if (root == null) {
            return true; 
        }
        
        return isSymmetricHelper(root.left, root.right);
    }
    
    private static boolean isSymmetricHelper(BinaryTreeNode<Integer> left, BinaryTreeNode<Integer> right) {
        if (left == null && right == null) {
            return true; 
        }
        if (left == null || right == null) {
            return false; 
        }
        

        return (left.data.equals(right.data)) && 
               isSymmetricHelper(left.left, right.right) && 
               isSymmetricHelper(left.right, right.left);
    }*/
}

/*import java.util.ArrayList;
import java.util.Scanner;

class QueueEmptyException extends Exception {
}

class Queue<T> {

	class Node<T> {
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
		}
	}

	private Node<T> head;
	private Node<T> tail;
	private int size = 0;

	public int size(){
		return size;
	}

	public boolean isEmpty(){
		if(size == 0){
			return true;
		}
		return false;
	}

	public T front() throws QueueEmptyException{
		if(size == 0){
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}

		return head.data;
	}

	public void enqueue(T element){
		Node<T> newNode = new Node<T>(element);

		if(head == null){
			head = newNode;
			tail = newNode;
		}
		else{
			tail.next = newNode;
			tail = newNode;
		}

		size++;
	}

	public T dequeue() throws QueueEmptyException{
		if(head == null){
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		if(head == tail){
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

public class Runner {
	static Scanner s = new Scanner(System.in);

	public static BinaryTreeNode<Integer> takeInput(){
		Queue<BinaryTreeNode<Integer>>  pendingNodes = new Queue<BinaryTreeNode<Integer>>(); // we can skip writing again inside <> after java version 1.7 
		int rootData = s.nextInt();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);

		while(!pendingNodes.isEmpty()){
			BinaryTreeNode<Integer> currentNode;
			try {
				currentNode = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				return null;
			}
			int leftChildData = s.nextInt();
			if(leftChildData != -1){
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftChildData);
				currentNode.left = leftChild;
				pendingNodes.enqueue(leftChild);
			}
			int rightChildData = s.nextInt();
			if(rightChildData != -1){
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightChildData);
				currentNode.right = rightChild;
				pendingNodes.enqueue(rightChild);
			}
		}
		return root;
	}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInput();
		System.out.println(Solution.isSymmetric(root));
	}
}
*/
