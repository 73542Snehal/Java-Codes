package tries;

public class Trie {

	private TrieNode root;
	
	public Trie() {
		root = new TrieNode('\0');
	}
	
	public void addHelper(TrieNode root, String word) {
		if(word.length() == 0) {
			root.isTerminal = true;
			return;
		}
		int childIndex = word.charAt(0) - 'A';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		addHelper(child,word.substring(1));
	}

	public void add(String word) {
		addHelper(root,word);
	}
	
	private boolean searchHepler(TrieNode root, String word) {
		if(word.length() == 0) {
			return root.isTerminal;
		}
		
		int childIndex = word.charAt(0) - 'A';
		//int childIndex = Character.toUpperCase(word.charAt(0)) - 'A';
		//int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			return false;
		}
		return searchHepler(child,word.substring(1));
	}

	public boolean search(String word) {
		return searchHepler(root,word);
	}
	
	public void removeHelper(TrieNode root, String word) {
		if(word.length() == 0) {
			root.isTerminal = false;
			return;
		}
		int childIndex = word.charAt(0) - 'A';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			return;
		}
		removeHelper(child,word.substring(1));
		if(!child.isTerminal && child.childCount == 0) {
			root.children[childIndex] = null;
			root.childCount--;
		}
	}
	

	public void remove(String word) {
		removeHelper(root,word);
	}
}
