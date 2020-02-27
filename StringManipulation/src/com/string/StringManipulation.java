package com.string;

import java.util.Scanner;

public class StringManipulation {
	public static void main(String ar[]) {
		Scanner in=new Scanner(System.in);
		String []s=new String[5];
		System.out.println("enter the names");
		for(int i=0;i<5;i++)
		{
			s[i]=in.next();
		}
		for(int i=0;i<5;i++) 
		{
			for(int j=i+1;j<5;j++) 
			{
				if(s[i].length()>s[j].length())
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
					

				System.out.println("After sorting");
				for(String x:s) 
				{
					System.out.println(x);
				}
			}
		
		}
}
}

