package myHashMap;

import myHashMap.MyKeyValue;

public class MyHashMap<Key> {
	private MyKeyValue[][] vals;
	private String classType;
	private static int MAX_COLLISIONS = 2;
	private static int size = 8;
	
	public MyHashMap() {
		// Only allows up to 5 collisions
		this.vals = new MyKeyValue[size][MAX_COLLISIONS];
	}

	// Returns true if its placed, or false if it can't be
	public boolean put(Key key, Object value) {
		MyKeyValue mk = new MyKeyValue(key, value);
		int hash = mk.hashCode() % vals.length;
		for (int i = 0; i < MAX_COLLISIONS; i++) {
			if (vals[hash][i] == null) {
				vals[hash][i] = mk;
				return true;
			} else if (vals[hash][i].equals(mk)) {
				System.out.println("This key has already been place");
				return false;
			}
		}
		System.out.println("Could not place because hashmap has reached max collisions: " + MAX_COLLISIONS);
		return false;
	}

	public Object get(Key key) {
		MyKeyValue mk = new MyKeyValue(key, null);
		int hash = mk.hashCode() % vals.length;
		for (int i = 0; i < MAX_COLLISIONS; i++) {
			MyKeyValue ret = vals[hash][i];
			if( ret == null )
				return null;
			else if ( ret.equals(key) )
				return ret.getValue();
		}
		return null;
	}
	
	private void increaseSize() {
		
	}
}
