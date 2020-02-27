package com.arrays;

import java.util.Scanner;

public class Arrays {
	public static void main(String ar[]) {
		Scanner in=new Scanner(System.in);
		
		int []a=new int[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("enter a no");
			a[i]=in.nextInt();
		}
			int max=a[0];
			int min=a[0];
			for(int i=0;i<a.length;i++) {
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
			
			System.out.println("max is "+max);
			System.out.println("min is "+min);
	}
}
