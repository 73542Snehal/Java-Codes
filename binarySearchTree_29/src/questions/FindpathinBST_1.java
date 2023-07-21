package questions;

import java.util.*;

/*Find path in BST
Send Feedback
Given a BST and an integer k. 
Find and return the path from the node with data k and root (if a node with data k is present in given BST) in a list. 
Return empty list otherwise.
Note: Assume that BST contains all unique elements.
Input Format :
The first line of input contains data of the nodes of the tree in level order form. 
The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. 
Since -1 is used as an indication whether the left or right nodes exist, therefore, 
it will not be a part of the data of any node.   
The following line of input contains an integer, that denotes the value of k.
Output Format :
The first line and only line of output prints the data of the nodes in the path from node k to root. The data of the nodes is separated by single space.
Constraints:
Time Limit: 1 second   
Sample Input 1:
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
2
Sample Output 1:
2 5 8*/

import java.util.*;

public class FindpathinBST_1 {
	
    public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer> root, int x){
        if(root==null){
            return null;
        }

        if(root.data==x){
            ArrayList<Integer> output= new ArrayList<Integer>();
            output.add(root.data);
            return output;
        }
        ArrayList<Integer> leftOutput= nodeToRootPath(root.left,x);
        if(leftOutput!=null){
            leftOutput.add(root.data);
            return leftOutput;
        }

        ArrayList<Integer> rightOutput= nodeToRootPath(root.right,x);
        if(rightOutput!=null){
            rightOutput.add(root.data);
            return rightOutput;
        }
        return null;
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
    	Scanner sc  = new Scanner(System.in);
    	System.out.println("Enter x to find path: ");
    	int x = sc.nextInt();
         ArrayList<Integer> path= nodeToRootPath(root,x);
         for(int i:path){
             System.out.println(i);
	}}}

