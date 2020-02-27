package com.capg;

public class Details {
	public static void main(String ar[]) {
	Person p1=new Person();
	p1.setName("kagd");
	p1.setAge(21);
	p1.setPhone(936593650);
//	Person p2=new Person();
//	Person p3=new Person();
	p1.printDetails();
	System.out.println("Person with "+p1.getName()+" is created.");
}
}

class Person{
	private String name;
	private int age;
	private long phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0)
			this.age = age;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Person() {
		System.out.println("Default parameters are called");
	}
	public Person(String n,int a,long b){
		System.out.println("all the parameter is called");
		name=n;
		age=a;
		phone=b;
	}
	public void printDetails() {
		System.out.println("name is "+name);
		System.out.println("age is "+age);
		System.out.println("phone is "+phone);
	}
	
}
