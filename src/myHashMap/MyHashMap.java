package myHashMap;
import myHashMap.MyKey;

public class MyHashMap<Key, Value> {
	private MyKey[][] vals;
	private String classType;
	
	public MyHashMap(int size) {
		this.vals = new MyKey[size][5];
	}
	
	public void put(Key key, Value value){
		MyKey mk = new MyKey(key);
		
	}
	

}
