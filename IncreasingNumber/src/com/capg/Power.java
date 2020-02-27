package com.capg;

import java.util.Scanner;

public class Power {
	public static void main(String ar[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=in.nextInt();
		boolean ans=checkPower(n);
		if(ans)
			System.out.println(n+" is power of 2");
		else
			System.out.println(n+" is not a power of 2");
	}
	
	public static boolean checkPower(int n) {
		for(int i=0;i<n;i++) {
			if(Math.pow(2,i)==n) { 
				return true;
			}
	}
		return false;
	}

}
