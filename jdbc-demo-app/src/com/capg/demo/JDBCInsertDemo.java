package com.capg.demo;
import java.sql.*;
import java.util.Scanner;

public class JDBCInsertDemo {

	public static void main(String[] args) {
		String url="jdbc:oracle:thin:@localhost:1521/xe";
		String user="system";
		String password="password";
		try {
			Scanner in=new Scanner(System.in);
//			1. Create connection
			Connection con=DriverManager.getConnection(url,user,password);
			
//			2. Create Statement
			PreparedStatement psmt=con.prepareStatement("delete from student where roll=?");
			
			int roll;
//			String name;
//			int age;
			System.out.println("Enter roll,name,age");
			roll=in.nextInt();
//			name=in.next()+in.nextLine();
//			age=in.nextInt();
			
			psmt.setInt(1,roll);
//			psmt.setString(2,name);
//			psmt.setInt(3,age);
			
//			3. Execute update
			int r=psmt.executeUpdate();
			if(r>0)
				System.out.println("deleted successfully");
			else
				System.out.println("enter valid details");
			
			psmt=con.prepareStatement("select * from student");
			ResultSet rs=psmt.executeQuery();
			System.out.printf("%-10s%-30s%-10s\n","Roll","Name","Age");
			while(rs.next()) {
				
				System.out.printf("%-10d",rs.getInt("roll"));
				System.out.printf("%-30s",rs.getString(2));
				System.out.printf("%-10d",rs.getInt(3));
				System.out.println();
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
}
}
