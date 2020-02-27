package com.capg;

public class OOPDemo {
	public static void main(String ar[]) {
	
	Car duster=new Car(3752,"Red",4);
	Car nissan=new Car(7250,"White",4);
	duster.ShowCarInfo();
	duster.start();
	duster.accelerate();
	duster.brake();
	nissan.ShowCarInfo();
}
}
class Car{
	private int regNo;
	private int noOfWheels;
	private String color;
	public Car(int reg,String col,int n)
	{
		regNo=reg;
		color=col;
		noOfWheels=n;
	}
	public void accelerate() {
		System.out.println("Running");
	}
	public void brake() {
		System.out.println("Stopped");
	}
	public void start() {
		System.out.println("Engine Started");
	}
	public void ShowCarInfo() {
		System.out.println("Reg No="+regNo);
		
		System.out.println("Color="+color);
		System.out.println("NoOfWheels="+noOfWheels);
	}
}


