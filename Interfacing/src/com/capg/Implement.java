package com.capg;

public class Implement implements Interface1,Interface2  {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("This will show");
	}


	public void test() {
		// TODO Auto-generated method stub
		System.out.println("This will test");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("She can walk");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("She will draw");
	}
	
	public static void main(String ar[]) {
		Implement a=new Implement();
		a.show();
		a.test();
		a.walk();
		a.draw();
		Interface1.run();
		Interface2.print();
	}

}
