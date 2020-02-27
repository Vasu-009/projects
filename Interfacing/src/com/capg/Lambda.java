package com.capg;

interface I1{
	public void show();
}

public class Lambda {
//	
//	public void show() {
//		System.out.println("Hello");
//	}
	public static void main(String ar[]) {
//		Lambda a=new Lambda();
//		a.show();
		I1 a=()-> System.out.println("Hello");
	}
}


