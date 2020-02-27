package com.capg;

class ProducerConsumerApp{
	int item;
	synchronized void producer(){
		if(item==10) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		item++;
		System.out.println("List is consuming "+item);
		notify();
	}
	
	synchronized void consumer(){
		if(item==0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		item--;
		System.out.println("List is producing "+item);
		notify();
	}
}

public class ProducerConsumer {

	public static void main(String[] args) {
		ProducerConsumerApp f=new ProducerConsumerApp();
		Runnable a=()->{
			for(int i=0;i<20;i++) {
				f.consumer();
				}
			};
		Runnable b=()->{
			for(int i=0;i<20;i++) {
				f.producer();
				}
			};
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		t1.start();
		t2.start();
	}

}
