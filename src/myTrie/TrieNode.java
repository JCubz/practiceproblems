package myTrie;

public class TrieNode {
	private boolean isWord;
	private char c;
	private TrieNode[] children = new TrieNode[26];

	TrieNode(char c, boolean isWord) {
		this.c = c;
		this.isWord = isWord;
	}

	public boolean isWord() {
		return isWord;
	}

	public TrieNode getChild(char c) {
		return children[c - 'a'];
	}

	public TrieNode addChild(char c) throws Exception {
		int loc = c - 'a';
		TrieNode tn = new TrieNode(c, false);
		if (children[loc] != null)
			throw new Exception("Child Already exists");
		children[loc] = tn;
		return tn;
	}

	public void changeWord(boolean isWord) {
		this.isWord = isWord;
	}

	public boolean hasChild(char c) {
		return (children[c - 'a'] != null);
	}
}
