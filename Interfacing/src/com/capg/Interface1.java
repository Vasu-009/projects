package com.capg;

public interface Interface1 {
	static void run() {
		System.out.println("She is running");
	}
	abstract void walk();
	default void draw() {
		System.out.println("She can draw");
	}
	
}
