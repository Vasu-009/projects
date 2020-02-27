package com.capg;

interface Operation{
	public int operate(int a,int b);
}

class Calculator{
	public int calculate(int a,int b,Operation op) {
		return op.operate(a, b);
	}
}
public class Example1 {
	public static void main(String ar[]) {
		Operation add=new Operation() {
			public int operate(int a,int b) {
				return a+b;
			}
		};
		Calculator c=new Calculator();
		Operation op=(a,b)->a*b;
		int result=c.calculate(10,15,op);
		System.out.println(result);
//		int result=c.calculate(10, 15, (a,b)->a+b);
//		System.out.println(result);
//		result=c.calculate(10, 15, (a,b)->a-b);
//		System.out.println(result);
		}
}
