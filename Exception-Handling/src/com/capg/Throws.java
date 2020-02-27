package com.capg;

import java.io.FileReader;
import java.util.Scanner;

public class Throws {
	public static void main(String ar[]){
		try {
			readName();
			openFile("Throws.java");
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public static void openFile(String fileName)throws Exception{
		FileReader in=new FileReader(fileName);
	}
	
	public static void readName(){
		String name;
		name=new Scanner(System.in).nextLine();
		if(name.length()<3)
		{
			throw new ArithmeticException("Name should be of 3+ chars");
		}
		else
			throw new ArithmeticException("File not found");
		
	}

}
