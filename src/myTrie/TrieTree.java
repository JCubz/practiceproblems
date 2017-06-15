package myTrie;

import myTrie.TrieNode;

public class TrieTree {
	TrieNode[] roots;

	public TrieTree() {
		roots = new TrieNode[26];
	}

	/*
	 * returns true if the word is new
	 */
	public boolean addWord(String word) throws Exception {
		word = word.toLowerCase();
		TrieNode tn = null;
		for (char c : word.toCharArray()) {
			if (tn == null && roots[c - 'a'] == null) {
				tn = new TrieNode(c, false);
				roots[c - 'a'] = tn;
			} else if (tn == null) {
				tn = roots[c - 'a'];
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
	public boolean checkWord(String word) {
		word = word.toLowerCase();
		TrieNode tn = null;
		for (char c : word.toCharArray()) {
			if (tn == null && roots[c - 'a'] == null) {
				return false;
			} else if (tn == null) {
				tn = roots[c - 'a'];
			} else if (tn.hasChild(c))
				tn.getChild(c);
			else {
				System.out.println("got to letter " + c);
				break;
			}
		}
		System.out.print("Got here");
		boolean alreadyExists = tn.isWord();
		return alreadyExists;
	}
}
