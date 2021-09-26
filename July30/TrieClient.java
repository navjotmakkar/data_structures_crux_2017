package July30;

public class TrieClient {

	public static void main(String[] args) {
		TrieClass trie=new TrieClass();
		trie.addword("art");
		trie.addword("arc");
		trie.addword("and");
		trie.addword("ant");
		trie.addword("an");
		trie.addword("bug");
		trie.addword("bugs");
		trie.addword("sea");
		trie.addword("seen");
		trie.addword("see");
		
		System.out.println(trie.searchWord("buy"));
		System.out.println(trie.searchWord("seen"));
		System.out.println(trie.searchWord("an"));
		
		trie.removeWord("an");
		System.out.println(trie.searchWord("an"));
		System.out.println(trie.searchWord("and"));
		
		trie.display();
	}

}
