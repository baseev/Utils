package com.baseev.coding.lang.map;

import java.util.HashMap;
import java.util.Map;

class Key {
	private String value;
	public Key(String value) {
		this.value = value;
	}
	
	@Override
	public int hashCode() {
		return value.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return value == ((Key)obj).value;
	}
}


public class Map1 {

	public static void main(String[] args) {
		Map map = new HashMap<String, Integer>();
		map.put(new Key("abc"), 1);
		map.put(new Key("def"), 2);
		map.put(new Key("abc"), 3);
		System.out.println(map);
	}

}
