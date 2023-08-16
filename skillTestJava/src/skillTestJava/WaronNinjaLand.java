package skillTestJava;
/*War on NinjaLand II
War between NinjaLand and Pandora is still going on. The mayor of NinjaLand has sanctioned a retaliation against Pandora. He has ordered his soldiers to drop a single CHAIN BOMB on Pandora to destroy their Military Outposts and cripple the defense.
In Pandora, the Military Outposts are situated at nodes of a Binary Tree. Each military outpost is given a unique integer ID (represented by the value of that node). Captain Ninja of NinjaLand Airforce decides which military outpost has to be bombarded with the Chain Bomb. Once the bomb has been dropped on the target, it will spread a chain reaction into its neighbouring outposts, who will again in turn spread the reaction onto their neighbours. This way the chain reaction’s destruction will spread to all the outposts.
Your task is to print the sequence in which the outposts will be destroyed.
Keep in mind that chain reaction will spread through connected (adjacent) outposts only and once an outpost is destroyed, it cannot be bombarded again.
Input Format:
The first line of input contains an integer t, denoting the number of test cases. 
For each test case, we need to input two things- Tree nodes and a target node.
The first line of input contains data of the nodes of the tree in level order form. The order is: data for root node, data for left child to root node,  data for right child to root node and so on and so forth for each node. The data of the nodes of the tree is separated by space. Data -1 denotes that the node doesn't exist.
Second line of each test case will contain an integer T representing the ID of the target node.
Constraints:
Time Limit: 1 sec
Output Format:
For each query, you have to print the sequence in which outposts will be destroyed. Each adjacent reaction will be printed in a separate line. To avoid multiple answers, print the ID’s on each level in sorted form.
Sample Input 1:
8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
14
Sample Output 1:
14 
10 13 
8 
3 
1 6 
4 7
Explanation:
For the given input the tree formed is given below.
14 is the target node, which will be bombed initially. From there, chain reaction will go to its adjacent nodes [ 10 , 13 ] will begin. 10 will help destroy its adjacent nodes [ 8 ]. 8 will help destroy [ 3 ]. 3 will help destroy [ 1 , 6 ] . 6 will help destroy  [ 4 , 7 ] 
Alt Text

Sample Input 2:
10 20 60 -1 -1 3 50 -1 -1 -1 -1 
3
Sample Output 2:
3 
60 
10 50 
20 
Explanation:
3 is the target node, which will be bombed initially. From there, chain reaction to its adjacent nodes [ 60 ] will begin. 60 will help destroy its adjacent nodes [ 10 , 50 ]. 10 will help destroy [ 20 ]. */
public class WaronNinjaLand {
/*static void bomb(BinaryTreeNode<Integer> root, int target) {
          if (root == null) {
            return;
        }
        Map<Integer, List<Integer>> adjacencyMap = new HashMap<>();
        buildAdjacencyMap(root, adjacencyMap);

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> destroyedNodes = new HashSet<>();

        queue.add(target);
        destroyedNodes.add(target);

        while (!queue.isEmpty()) {
            List<Integer> levelNodes = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int currentNode = queue.poll();
                levelNodes.add(currentNode);

                List<Integer> neighbors = adjacencyMap.getOrDefault(currentNode, new ArrayList<>());
                for (int neighbor : neighbors) {
                    if (!destroyedNodes.contains(neighbor)) {
                        queue.add(neighbor);
                        destroyedNodes.add(neighbor);
                    }
                }
            }
            Collections.sort(levelNodes);
            for (int node : levelNodes) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }

    static void buildAdjacencyMap(BinaryTreeNode<Integer> root, Map<Integer, List<Integer>> adjacencyMap) {
        if (root == null) {
            return;
        }

        if (root.left != null) {
            adjacencyMap.putIfAbsent(root.data, new ArrayList<>());
            adjacencyMap.get(root.data).add(root.left.data);
            adjacencyMap.putIfAbsent(root.left.data, new ArrayList<>());
            adjacencyMap.get(root.left.data).add(root.data);
            buildAdjacencyMap(root.left, adjacencyMap);
        }

        if (root.right != null) {
            adjacencyMap.putIfAbsent(root.data, new ArrayList<>());
            adjacencyMap.get(root.data).add(root.right.data);
            adjacencyMap.putIfAbsent(root.right.data, new ArrayList<>());
            adjacencyMap.get(root.right.data).add(root.data);
            buildAdjacencyMap(root.right, adjacencyMap);
        }
    }*/
}
/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class QueueEmptyException extends Exception {

}

 class QueueUsingLL<T> {

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
		this.left = null;
		this.right = null;
	}
}

class Pair<T, U> {
	T minimum;
	U maximum;

	public Pair(T minimum, U maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}

}

public class Runner {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static BinaryTreeNode<Integer> takeInput() throws NumberFormatException, IOException {
		QueueUsingLL<BinaryTreeNode<Integer>>  pendingNodes = new QueueUsingLL<BinaryTreeNode<Integer>>(); 
		int start = 0;

		String[] nodeDatas = br.readLine().trim().split(" ");

		if (nodeDatas.length == 1) {
			return null;
		}

		int rootData = Integer.parseInt(nodeDatas[start]);
		start += 1;

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);

		while(!pendingNodes.isEmpty()){
			BinaryTreeNode<Integer> currentNode;
			try {
				currentNode = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				return null;
			}

			int leftChildData = Integer.parseInt(nodeDatas[start]);
			start += 1;

			if(leftChildData != -1){
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftChildData);
				currentNode.left = leftChild;
				pendingNodes.enqueue(leftChild);
			}

			int rightChildData = Integer.parseInt(nodeDatas[start]);
			start += 1;

			if(rightChildData != -1){
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightChildData);
				currentNode.right = rightChild;
				pendingNodes.enqueue(rightChild);
			}
		}

		return root;
	}


	private static void printLevelWise(BinaryTreeNode<Integer> root){
		QueueUsingLL<BinaryTreeNode<Integer>>  primary = new QueueUsingLL<>();
		QueueUsingLL<BinaryTreeNode<Integer>>  secondary = new QueueUsingLL<>();

		primary.enqueue(root);

		while(!primary.isEmpty()){
			BinaryTreeNode<Integer> current=null;
			try {
				current = primary.dequeue();
			} catch (QueueEmptyException e) {
				System.out.println("Not possible");
			}
			System.out.print(current.data + " ");
			if(current.left != null){
				secondary.enqueue(current.left);
			}
			if(current.right != null){
				secondary.enqueue(current.right);
			}
			if(primary.isEmpty()){
				QueueUsingLL<BinaryTreeNode<Integer>>  temp = secondary;
				secondary = primary;
				primary = temp;
				System.out.println();
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BinaryTreeNode<Integer> root = takeInput();
		int target = -1;
		if (root != null)
            target = Integer.parseInt(br.readLine().trim());
        Solution.bomb(root, target);
	}
}*/