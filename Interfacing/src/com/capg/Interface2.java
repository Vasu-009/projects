package com.capg;

public interface Interface2{
	
	static void print() {
		System.out.println("Printing");
	}
	abstract void show();
	default void test() {
		System.out.println("She can test");
	}
	
}


