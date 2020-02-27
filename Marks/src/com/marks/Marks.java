package com.marks;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in=new Scanner(System.in);
			int marks=in.nextInt();
			if(marks>80 && marks<=100)
				System.out.println("Your grade is \'A'");
			else if(marks>=60 && marks<=80)
				System.out.println("Your grade is \'B'");
			else if(marks<60 && marks>0)
				System.out.println("You are FAIL");
			else
				System.out.println("INVALID");
	}

}
