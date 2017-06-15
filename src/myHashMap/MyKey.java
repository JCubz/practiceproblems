package myHashMap;

public class MyKey<Key> {
	Key key;
	Object o;
	MyKey(Key key) {
		this.key = key;
		key.getClass();
	}
	
	@Override
	public int hashCode() {
		String str = key.toString();
		int result = 0;
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			result = ((result << 5) - result) + (int)c;
			result |= 0;
		}
		
		return result;
	}	
	
	@Override 
	public boolean equals(Object comparekey) {
		if(comparekey.getClass().equals(key.getClass()) && comparekey.toString() == key.toString())
			return true;
		return false;
	}
}
