package com.capg;

import java.util.Stack;


public class Stack_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack list=new Stack();
		list.push("abc");
		list.push("xyz");
		list.push("pqr");
		
		while(!list.isEmpty()) {
			System.out.println(list.pop());
		}
	}
}
