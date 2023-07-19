package questions_2;

import java.util.*;

public class RemoveLeafNodes {
	
	public static Node<Integer> RemoveLeafNodes(Node<Integer> root) {
		
		 if(root.left==null && root.right==null) {
	          return null;
	          }
	      root.left = RemoveLeafNodes(root.left);
	      root.right = RemoveLeafNodes(root.right);
	      return root;
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
	
	public static void printTreeDetailed(Node<Integer> root) {
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
		
		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}

	public static void main(String[] args) {

		Node<Integer> root = takeInput(true, 0 , true);
		Node<Integer> newTree = RemoveLeafNodes(root);
		printTreeDetailed(newTree);
		
	}
}
