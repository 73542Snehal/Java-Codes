package binaryTree_1;
import java.util.*;

//here we take input level by level using the concept of queues 
public class takeinputLevelWise_3 {
	
	public static Node<Integer> takeinputLevelWise(){
		
        Scanner s= new Scanner(System.in);
        System.out.println("Enter root Data: ");
        int rootData= s.nextInt();

        if(rootData==-1) { 
        	return null;
        }

        Node<Integer> root= new Node<Integer>(rootData);
        Queue<Node<Integer>> queue= new LinkedList<Node<Integer>>();
        queue.add(root);

        while(!queue.isEmpty()){
           Node<Integer> front= queue.poll();
            System.out.println("Enter left child of "+ front.data);
            int left= s.nextInt();
            if(left!=-1){
                    Node<Integer> leftChild= new Node<Integer>(left);
                    front.left= leftChild;
                    queue.add(leftChild);
            }

            System.out.println("Enter right child of "+ front.data);
            int right= s.nextInt();
            if(right!=-1){
                    Node<Integer> rightChild= new Node<Integer>(right);
                    front.right= rightChild;
                    queue.add(rightChild);
            }
        }
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

  public static void main(String[] args){

      //BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
     Node<Integer> root= takeinputLevelWise();
     printTree(root);
     
  }
}
