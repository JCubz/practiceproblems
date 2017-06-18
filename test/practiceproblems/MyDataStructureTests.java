package practiceproblems;
import myTrie.TrieTree;
import myHashMap.MyHashMap;
import org.junit.*;
public class MyDataStructureTests {

	public static void main(String[] args) throws Exception{
		TrieTreeTests();
		HashMapTests();
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
	
	private static void HashMapTests() {
		MyHashMap<String> hm1 = new MyHashMap<>();
		Assert.assertTrue(hm1.put("1", 1));
		Assert.assertTrue(hm1.put("2", "2"));
		Assert.assertTrue(hm1.get("1").equals(1));
		Assert.assertTrue(hm1.get("2").equals("2"));
		Assert.assertFalse(hm1.put("1",11));
	}

}
