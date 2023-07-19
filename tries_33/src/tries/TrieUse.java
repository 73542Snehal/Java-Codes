package tries;

public class TrieUse {
	public static void main(String[] args) {
		Trie t = new Trie();
		
		t.add("NOTE");
		t.add("AND");
		
		System.out.println("Note= " + t.search("NOTE"));
		System.out.println("Not= " + t.search("NOT"));
		
		System.out.println("AND= " + t.search("AND"));
		t.remove("AND");
		System.out.println("AND= " + t.search("AND"));
	}
}
