package com.capg;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in=new Scanner(System.in);
		try {
		n=Integer.parseInt(in.nextLine());
		System.out.println(n);
		}
		catch(NumberFormatException ex)
		{
		System.out.println("error occured "+ex.getMessage());
		}
		System.out.println("completed");
	}

}
