package binaryTree_1;

import java.util.*;

public class takeInput_2 {

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


	public static void printTree(Node<Integer> root) {
		if(root == null) {
			return;
		}

		System.out.print(root.data + ":");

		if(root.left != null) {
			System.out.print("L"+root.left.data+",");
		}
		if(root.right != null) {
			System.out.print("R"+root.right.data);
		}
		System.out.println();

		printTree(root.left);
		printTree(root.right);
	}


	public static void main(String[] args) {

		Node<Integer> root = takeInput(true, 0 , true);
		printTree(root);

	}
}
