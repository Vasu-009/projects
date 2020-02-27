package com.capg;

public class PaytmApp {
	static float balance=100;
	
	public synchronized void addMoney(float amount) {
		balance+=amount;
		System.out.println("Amount added-balance= "+balance);
		notify();
	}
	public synchronized void recharge(float amount) {
		if(amount>balance) {
			try {
				System.out.println("Insufficient balance....Balance= "+balance);
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("Recharge done");
	}
	
	public static void main(String ar[]) {
		PaytmApp app=new PaytmApp();
		Runnable r1=()->app.recharge(500);
		Runnable r2=()->app.addMoney(1000);
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
	}
}
