package BalancedTree_3;
import java.util.*;
public class balancedTreeBetter {
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

      //Better time complexity O(n).
      public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root){
          if(root==null){
            int height= 0;
            boolean isBal= true;
            BalancedTreeReturn ans= new BalancedTreeReturn();
            ans.height= height;
            ans.isBalanced= isBal;
            return ans;
          }
          BalancedTreeReturn leftOutput= isBalancedBetter(root.left);
          BalancedTreeReturn rightOutput= isBalancedBetter(root.right);
          boolean isBal= true;
          int height= 1+Math.max(leftOutput.height, rightOutput.height);

          if(Math.abs(leftOutput.height-rightOutput.height)>1){
            isBal= false;
          }
          if(!leftOutput.isBalanced || !rightOutput.isBalanced){
            isBal=false;
          }
          BalancedTreeReturn ans= new BalancedTreeReturn();
          ans.height= height;
          ans.isBalanced= isBal;
          return ans;
      }




    public static void main(String[] args){

        BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);

        BalancedTreeReturn ans= isBalancedBetter(root);
        System.out.println("is balanced "+ isBalancedBetter(root).isBalanced);


    }
}
