package com.capg.package2;

import com.capg.package1.Parent;

public class child extends Parent {
	public child(String s1,String s2){
		super(s2);
		System.out.println("Child constructor "+s2);
	}
	
	public void show() {
		super.show();
		System.out.println("From child");
	}
}