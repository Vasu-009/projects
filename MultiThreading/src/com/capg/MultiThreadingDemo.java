package com.capg;

class A extends Thread{
	
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("From A:i "+i);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException ex) {
				
			}
			
		}
	}
}

class B extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("From B:i "+i);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException ex) {
				
			}
		}
	}
}

public class MultiThreadingDemo {
	public static void main(String[] args) {
	A thread1=new A();
	B thread2=new B();
	thread1.start();
	thread2.start();
	}
	
}
