package com.sorting;

import java.util.Scanner;

public class Sorting {
	public static void main(String ar[]) {
		Scanner in=new Scanner(System.in);
		int []a=new int[5];
		System.out.println("Enter a no");
		for(int i=0;i<5;i++)
		{
			a[i]=in.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("After sorting");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
}
}
