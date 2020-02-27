package com.capg;

import java.util.Scanner;

public class FactorialThrows {
	public static void main(String ar[]) {
		int n;
		n=new Scanner(System.in).nextInt();
		try {
			System.out.println(Factorial(n));
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public static int Factorial(int n){
		int f=1;
		if(n<0) 
		{
			throw new ArithmeticException("Enter a positive value");
		}
		else {
		for(int i=1;i<=n;i++){
			f=f*i;
		}
		return f;
		}
	}
}