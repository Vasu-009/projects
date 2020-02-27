package com.capg;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin=new FileInputStream("obj.txt");
			ObjectInputStream objIn=new ObjectInputStream(fin);
			Employee emp=(Employee)objIn.readObject();
			System.out.println(emp);
			
//			Employee emp=new Employee(583,"Karthik",108900f);
//			FileOutputStream out=new FileOutputStream("obj.txt");
//			ObjectOutputStream objOut=new ObjectOutputStream(out);
//			objOut.writeObject(emp);
		}
		catch(Exception e) {
			System.out.println(e);
		}
			

	}

}
