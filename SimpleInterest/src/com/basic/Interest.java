package com.basic;

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner in=new Scanner(System.in);
			float p=in.nextFloat();
			float n=in.nextFloat();
			float r=in.nextFloat();
			float SI=(p*n*r)/100;
			System.out.println("si="+SI);
	}

}
