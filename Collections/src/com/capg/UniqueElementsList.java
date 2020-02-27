package com.capg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UniqueElementsList {

	public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			List items=new ArrayList();
			char c;
			while(true) {
				System.out.println("Enter an element");
				int a=in.nextInt();
				items.add(a);
				System.out.println("do you want to add an element y/n");
				c=in.next().charAt(0);
				if(c=='n' || c=='N')
					break;
			}
			System.out.println("Array elements are");
			for(Object b:items) {
				System.out.println(b);
			}
			
			List uniqueItems=new ArrayList();
			for(Object item:items) {
				if(!uniqueItems.contains(item)) {
					uniqueItems.add(item);
				}
			}
			System.out.println("Unique elements are");
			for(Object b:uniqueItems) {
				System.out.println(b);
		}
			
	}

}
