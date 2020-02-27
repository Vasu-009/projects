package com.pubg;

import java.util.Scanner;

public class Pubg {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
			int age;
			String name;
			String gender;
			Scanner in=new Scanner(System.in);
			System.out.println("Enter your age, name and gender");
			age=in.nextInt();
			name=in.next()+in.nextLine();
			gender=in.next().toLowerCase();
//			if(gender=='M' || gender=='m')
			switch(gender){
			case "Male":
				if(age<18)
					System.out.println("Hi "+name+" You are not eligible");
				else if(age>=18 && age<=30)
					System.out.println("Hi "+name+" You are eligible to play");
				else
					System.out.println("Hi "+name+" You are too old to play the game");
			
//			else if(gender=='F' || gender=='f')
			case "Female":
				if(age<16)
					System.out.println("Hi "+name+" You are not eligible");
				else if(age>=16 && age<=25)
					System.out.println("Hi "+name+" You are eligible to play");
				else
					System.out.println("Hi "+name+" You are too old to play the game");
			
			default:
				System.out.println("INVALID");
			}

}
}
