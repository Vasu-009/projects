package com.capg.package1;

import com.capg.package3.GrandParent;

public class Parent extends GrandParent {
	public Parent(String s) {
		System.out.println("Parent constructor "+s);
	}
	
	public void show() {
		
		System.out.println("From parent");
	}
}
