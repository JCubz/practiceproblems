package myTrie;

import myTrie.TrieNode;

public class TrieTree {
	TrieNode[] roots;

	TrieTree() {
		roots = new TrieNode[26];
	}

	/*
	 * returns true if the word is new
	 */
	public boolean addWord(String word) throws Exception {
		word = word.toLowerCase();
		TrieNode tn = null;
		for (char c : word.toCharArray()) {
			if (tn == null && roots['a' - c] == null) {
				tn = new TrieNode(c, false);
			} else if (tn == null) {
				tn = roots['a' - c];
			} else if (tn.hasChild(c))
				tn.getChild(c);
			else {
				tn = tn.addChild(c);
			}
		}
		
		boolean alreadyExists = tn.isWord();
		tn.changeWord(true);
		return alreadyExists;
	}

	/*
	 * returns whether the word exists
	 */
	public boolean checkWord(String word){
		word = word.toLowerCase();
		TrieNode tn = null;
		for (char c : word.toCharArray()) {
			if (tn == null && roots['a' - c] == null) {
				return false;
			} else if (tn == null) {
				tn = roots['a' - c];
			} else if (tn.hasChild(c))
				tn.getChild(c);
			else {
				return true;
			}
		}
		
		boolean alreadyExists = tn.isWord();
		return alreadyExists;
	}
}
