package tries;
/*Auto complete
Send Feedback
Given n number of words and an incomplete word w. You need to auto-complete that word w.
That means, find and print all the possible words which can be formed using the incomplete word w.
Note : Order of words does not matter.
Input Format :
The first line of input contains an integer, that denotes the value of n.
The following line contains n space separated words.
The following line contains the word w, that has to be auto-completed.
Output Format :
Print all possible words in separate lines.
Constraints:
Time Limit: 1 sec
Sample Input 1 :
7
do dont no not note notes den
no
Sample Output 1 :
no
not
note
notes
Sample Input 2 :
7
do dont no not note notes den
de
Sample Output 2 :
den
Sample Input 3 :
7
do dont no not note notes den
nom
Sample Output 3 :
(Empty) There is no word which starts with "nom"*/
public class Autocomplete {
/*import java.util.ArrayList;

class TrieNode{
	char data;
	boolean isTerminating;
	TrieNode children[];
	int childCount;

	public TrieNode(char data) {
		this.data = data;
		isTerminating = false;
		children = new TrieNode[26];
		childCount = 0;
	}
}

public class Trie {
	private TrieNode root;
	public int count;
	public Trie() {
		root = new TrieNode('\0');
	}

	private void add(TrieNode root, String word){
		if(word.length() == 0){
			root.isTerminating = true;
			return;
		}		
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		add(child, word.substring(1));
	}

	public void add(String word){
		add(root, word);
	}

	public void insert(String word) {
        insert(root, word);
    }

    private void insert(TrieNode root, String word) {
        if (word.length() == 0) {
            root.isTerminating = true;
            return;
        }

        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];

        if (child == null) {
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }

        insert(child, word.substring(1));
    }

	
	
	public void autoComplete(ArrayList<String> input, String word) {
 for (String w : input) {
            insert(w);
        }

        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            int childIndex = word.charAt(i) - 'a';
            TrieNode child = current.children[childIndex];
            if (child == null) {
                return;
            }
            current = child;
        }

        printAllWords(current, word);
    }

    private void printAllWords(TrieNode node, String prefix) {
        if (node.isTerminating) {
            System.out.println(prefix);
        }

        for (int i = 0; i < 26; i++) {
            TrieNode child = node.children[i];
            if (child != null) {
                char ch = (char) ('a' + i);
                printAllWords(child, prefix + ch);
            }
        }
    }
}*/
}

/*import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Runner{
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException{	
        Trie t = new Trie();
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> input = new ArrayList<String>();
        String[] words = sc.nextLine().split("\\s");
        for(int i = 0; i < n; i++) {
			input.add(words[i]);
		}
		String pattern = sc.nextLine();
		t.autoComplete(input, pattern);
	}
}*/
