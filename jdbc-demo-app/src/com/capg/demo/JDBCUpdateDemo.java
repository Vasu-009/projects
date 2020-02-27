package com.capg.demo;
import java.sql.*;
import java.util.Scanner;

public class JDBCUpdateDemo {

	public static void main(String[] args) {
		String url="jdbc:oracle:thin:@localhost:1521/xe";
		String user="system";
		String password="password";
		try {
			Scanner in=new Scanner(System.in);
//			1. Create connection
			Connection con=DriverManager.getConnection(url,user,password);
			
//			2. Create Statement
			PreparedStatement psmt=con.prepareStatement("update student set name=? where roll=?");
			
			
			String name;
			int roll;
//			int age;
			System.out.println("Enter roll,name,age");
			
			name=in.next()+in.nextLine();
			roll=in.nextInt();
//			age=in.nextInt();
			
			
			psmt.setString(1,name);
			psmt.setInt(2,roll);
//			psmt.setInt(3,age);
			
//			3. Execute update
			int r=psmt.executeUpdate();
			if(r>0)
				System.out.println("Updated successfully");
			else
				System.out.println("enter valid details");
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
}
}
