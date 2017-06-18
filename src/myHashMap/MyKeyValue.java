package myHashMap;

public class MyKeyValue<Key> {
	Key key;
	Object value;
	MyKeyValue(Key key, Object value) {
		this.key = key;
		this.value = value;
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
		//if(comparekey.getClass().equals(key.getClass()) && comparekey.toString() == key.toString())
		if(comparekey.equals(key))
			return true;
		return false;
	}
	
	public Object getValue() {
		return value;
	}
}
