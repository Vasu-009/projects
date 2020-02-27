package com.capg;

public class Inheritance {
	public static void main(String ar[]) {
//		System.out.println(fun());
//	}
//	int fun() {
//		return 20;
//	}
//	}
		B b=new B();
		int x=b.showX();
		int y=b.showY();
		System.out.println(x+" " +y);
	}

}

class A{
	int x=13;
	public int showX() {
		return x;
	}
}

class B extends A{
	int y=4;
	public int showY() {
		return y;
	}
}