package questions_2; 

import java.util.*;

public class LargestNode {
	
	public static int largestNode(Node<Integer> root) {
		
		if(root == null) {
			return 0;
		}
		
		int leftNodeLargest = largestNode(root.left);
		int rightNodeLargest = largestNode(root.right);
		
		return Math.max(root.data, Math.max(leftNodeLargest, rightNodeLargest));
	}
	
	
	public static Node<Integer> takeInput(boolean isRoot, int parentData, boolean isLeft){
		if(isRoot) {
			System.out.println("Enter root data: ");
		}else {
			if(isLeft) {
				System.out.println("Enter left child of "+parentData);
			}else {
				System.out.println("Enter right child of "+parentData);
			}
		}
		
		Scanner sc = new Scanner(System.in);
		int rootData = sc.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		
		Node<Integer> root = new Node<Integer>(rootData);
		Node<Integer> leftChild = takeInput(false,rootData,true);
		Node<Integer> rightChild = takeInput(false,rootData,false);
		
		root.left = leftChild;
		root.right = rightChild;
		
		return root;
		
	}

	public static void main(String[] args) {

		Node<Integer> root = takeInput(true, 0 , true);
		int ans = largestNode(root);
		System.out.println("Largest node is: "+ ans);
		
	}
}
