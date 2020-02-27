package com.capg;

class NamePrinter{
	static synchronized void PrintName(String name) {
		System.out.println(name);
	}
}

class C extends Thread implements Runnable{
	
	
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("From "+Thread.currentThread().getName()+" "+i);
			NamePrinter.PrintName("dfhdfh");
//			if(i==2)
//			yield();
//			try {
//				Thread.sleep(500);
//			}
//			catch(InterruptedException ex) {
//				
//			}
			
		}
	}
}

class D implements Runnable{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("From "+Thread.currentThread().getName()+" " +i);
			NamePrinter.PrintName("KKR");
//			try {
//				Thread.sleep(500);
//			}
//			catch(InterruptedException ex) {
//				
//			}
		}
	}
}

public class RunnableThreading {
	public static void main(String[] args) {
	C a=new C();
	D b=new D();
	Thread t1=new Thread(a);
	Thread t2=new Thread(b);
	t1.setName("T1");
	t2.setName("T2");
	t1.start();
	t2.start();
	}
	
}
