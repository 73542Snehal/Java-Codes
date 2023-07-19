package genericTrees;

import java.util.*;

public class takeInputLevelWise {
	
	 public static TreeNode<Integer> takeInput(){
	        Scanner s= new Scanner(System.in);
	        Queue<TreeNode<Integer>> queue= new LinkedList<TreeNode<Integer>>();
	        
	        System.out.println("Enter the root data ");
	        int rootData= s.nextInt();
	        if(rootData==-1)
	            return null;

	        TreeNode<Integer> root= new TreeNode<Integer>(rootData);
	        queue.add(root);

	        while(!queue.isEmpty()){
	            TreeNode<Integer> front= queue.poll();
	            System.out.println("Enter no. of children "+ front.data);
	            int numChild= s.nextInt();
	            for(int i=0;i<numChild;i++){
	                System.out.println("Enter the  "+i+" th child data"+ front.data);
	                int childData= s.nextInt();
	                TreeNode<Integer> childNode= new TreeNode<>(childData);
	                front.children.add(childNode);
	                queue.add(childNode);
	            }
	        }
	        return root;
	    }
	 
	 public static void printTree(TreeNode<Integer> root) {
			
			if(root == null) {
				return;
			}
			
			System.out.print(root.data+":");
			
			for(int i=0; i<root.children.size(); i++) {
				System.out.print(root.children.get(i).data+" ");
			}
			
			System.out.println();
			
			for(int i=0; i<root.children.size(); i++) {
				TreeNode<Integer> child = root.children.get(i);
				printTree(child);
			}
		}
	 
	 public static void main(String[] args) {
		 TreeNode<Integer> root = takeInput();
		 printTree(root);
	}
}
