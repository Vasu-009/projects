package com.capg;

import java.util.*;

public class Map_1 {
	public static void main(String ar[]) {
		Map map=new HashMap();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		for(Object key:map.keySet()) {
			System.out.println("Key "+key+"\t Value "+map.get(key));
		}
	}
}
