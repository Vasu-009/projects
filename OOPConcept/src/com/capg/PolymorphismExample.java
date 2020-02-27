package com.capg;

public class PolymorphismExample {
	public static void main(String ar[]) {
		Adder f=new Adder();
		int sum=f.add(45, 55);
		float sum1=f.add(45.95f, 54.45f);
		int sum2=f.add(34, 26, 40);
		float sum3=f.add(45.45f, 28.45f, 34.56f);
		double sum4=f.add(4850, 7493);
		String sum5=f.add("Yo", "bro");
		String sum6=f.add(5, 6, "Hello");
		String sum7=f.add("Hello", 5, 6);
		System.out.println("Results are "+sum+ "\t"+(int)sum1+"\t"+sum2+"\t"+sum3+"\t"+sum4+"\t"+sum5+"\t"+sum6+"\t"+sum7);
	}
}

class Adder{
	public int add(int a,int b) {
		return a+b;
	}
	
	public float add(float a,float b) {
		return a+b;
	}
	
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	
	public float add(float a,float b,float c) {
		return a+b+c;
	}
	
	public double add(double a,double b) {
		return a+b;
	}
	public String add(String a,String b) {
		return a+b;
	}
	public String add(int a,int b,String c) {
		return a+b+c;
	}
	public String add(String a,int b,int c) {
		return a+b+c;
	}
	
}