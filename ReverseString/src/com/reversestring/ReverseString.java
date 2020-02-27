package com.reversestring;

import java.util.Scanner;

public class ReverseString
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
			String s;
			System.out.println("Enter a string");
			Scanner in=new Scanner(System.in);
			s=in.nextLine();
			StringBuffer s2=new StringBuffer(s);
			for(int i=0;i<s.length();i++)
			{
				s2.setCharAt(i,s.charAt(s.length()-i-1));
			}
			System.out.println("Reverse is "+s);
	}
}
