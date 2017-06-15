package practiceproblems;
import myTrie.TrieTree;
import org.junit.*;
public class TrieTests {

	public static void main(String[] args) throws Exception{
		TrieTree t = new TrieTree();
		t.addWord("hello");
		Assert.assertTrue(t.checkWord("hello"));
		
	}
}
