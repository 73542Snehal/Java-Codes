package BalancedTree_3;

import java.util.Scanner;

public class balancedTree {
	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft){
        if(isRoot){
            System.out.println("Enter root data");
        }
        else{
            if(isLeft){
              System.out.println("Enter left child of "+ parentData);
            }
            else{
              System.out.println("Enter right child of"+ parentData);
            }
        }
        Scanner s= new Scanner(System.in);
        int rootData = s.nextInt();

        if(rootData==-1){
            return null;
        }

        BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild= takeTreeInputBetter(false, rootData, true);
        BinaryTreeNode<Integer> rightChild= takeTreeInputBetter(false, rootData, false);
        root.left= leftChild;
        root.right= rightChild;
        return root;

    }

	public static int height(BinaryTreeNode<Integer> root) {
        if(root==null) {
          return 0;
          }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        return 1+ Math.max(leftHeight, rightHeight);
      }

      //bad time complexity Worst case:- O(n2), avg case:- O(nlogn)
      public static boolean isBalanced(BinaryTreeNode<Integer> root) {
          if(root==null) {
              return true;
            }
          int leftHeight=height(root.left);
          int rightHeight=height(root.right);
          if(Math.abs(leftHeight - rightHeight) >1){
              return false;
              }
          boolean isLeftBalanced = isBalanced(root.left);
          boolean isRightBalanced = isBalanced(root.right);
          return isLeftBalanced && isRightBalanced ;
          }
      
      public static void main(String[] args){
    	  BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
    	    boolean ans= isBalanced(root);
            System.out.println("is balanced "+ ans);
}}
