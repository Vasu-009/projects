package com.capg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		List items=new ArrayList();
		items.add("Karthik");
		items.add(100);
		items.add(true);
		items.add(6.78);
		items.add(2,500);
		
		
		System.out.println("with iterator...");
		Iterator itr=items.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(Object item:items) {
			System.out.println("Element "+item);
		}
		items.remove((Object)100);
		System.out.println("After removing");
		for(Object item:items) {
			System.out.println(item);
		}
		
		System.out.println("size= "+items.size());
		System.out.println(items.contains(400));
		
		for(int i=0;i<items.size();i++) {
			System.out.println(items.get(i));
		}
	}

}
