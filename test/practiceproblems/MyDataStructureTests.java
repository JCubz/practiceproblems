package practiceproblems;
import myTrie.TrieTree;
import org.junit.*;
public class MyDataStructureTests {

	public static void main(String[] args) throws Exception{
		TrieTreeTests();
	}
	
	private static void TrieTreeTests() throws Exception{
		TrieTree t = new TrieTree();
		t.addWord("hello");
		Assert.assertTrue(t.checkWord("hello"));
		Assert.assertFalse(t.checkWord("hell"));
		t.addWord("hell");
		Assert.assertTrue(t.checkWord("hell"));
		Assert.assertTrue(t.checkWord("hello"));
		System.out.println("Completed Trie Tree Tests");
	}

}
