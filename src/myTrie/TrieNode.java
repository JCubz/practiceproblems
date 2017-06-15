package myTrie;

public class TrieNode {
	private boolean isWord;
	char c;
	TrieNode[] children = new TrieNode[26];
	TrieNode(char c, boolean isWord){
		this.c = c;
		this.isWord = isWord;
	}
	
	public boolean isWord(){
		return isWord;
	}
	
	public TrieNode getChild(char c){
		return children['a' - c];
	}
	
	public TrieNode addChild(char c) throws Exception{
		int loc = 'a' - c;
		TrieNode tn = new TrieNode(c, false);
		if(children[loc] != null)
			throw new Exception("Child Already exists");
		children[loc] = tn;
		return tn;
	}
	
	public void changeWord(boolean isWord){
		this.isWord = isWord;
	}
	
	public boolean hasChild(char c){
		return (children['a' - c] != null);
	}
}
