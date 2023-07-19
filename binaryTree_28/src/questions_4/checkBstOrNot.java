package questions_4;

import java.util.*;

public class checkBstOrNot {
	
	   public static boolean isBST(BinaryTreeNode<Integer> root, int minrange, int maxrange){
		   
	          if(root==null){
	              return true;
	          }
	       
	          if(root.data < minrange || root.data > maxrange) {
	        	  return false;
	          }
	          
	          boolean isleftwithinRange = isBST(root.left,minrange, root.data-1);
	          boolean isrightwithinRange = isBST(root.right,root.data,maxrange);
	          
	          return isleftwithinRange && isrightwithinRange ;

	      }
	
	public static BinaryTreeNode<Integer> takeInput(boolean isRoot, int parentData, boolean isLeft){
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
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild = takeInput(false,rootData,true);
		BinaryTreeNode<Integer> rightChild = takeInput(false,rootData,false);
		
		root.left = leftChild;
		root.right = rightChild;
		
		return root;
		
	}

	public static void main(String[] args) {

		BinaryTreeNode<Integer> root = takeInput(true, 0 , true);
		boolean ans = isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
		 System.out.println(ans);

	}}
