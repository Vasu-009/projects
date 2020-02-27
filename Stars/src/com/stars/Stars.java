package com.stars;

import java.util.Scanner;

public class Stars {

	public static void main(String ar[])
	{
		for(int i=1;i<=50;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.print("abcxyz\t");
			}
			else if(i%3==0)
			{
				System.out.print("abc\t");
			}
			else if(i%5==0)
			{
				System.out.print("xyz\t");
			}
			else
				System.out.print(i+ "\t");
			
		}
	}

}
