package com.capg;

import java.util.Scanner;

public class IncreasingNumber {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=in.nextInt();
		boolean ans=checkNumber(n);
		if(ans)
			System.out.println(n+" is an increasing number");
		else
			System.out.println(n+" is not an increasing number");
		}
	
	public static boolean checkNumber(int number) {
			
		int s=0;
		while(number>0) {
			s=number%10;
			int x=number/10;
			if((x%10)<s)
				return true;
				break;
			}
			 return false;
			}
		
}
