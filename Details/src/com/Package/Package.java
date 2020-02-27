package com.Package;

import java.util.Scanner;

public class Package {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner d=new Scanner(System.in);
			System.out.println("Enter your name");
			String name=d.nextLine();
			System.out.println("Enter your roll");
			String roll=d.nextLine();
			System.out.println("Enter your phone");
			long phone=d.nextLong();
			System.out.println("Enter your marks");
			float marks=d.nextFloat();
			System.out.print("Name is "+name+"\n");
			System.out.print("Roll No is "+roll+"\n");
			System.out.print("Phone is "+phone+"\n");
			System.out.print("Marks are "+marks+"\n");
			
	}

}
