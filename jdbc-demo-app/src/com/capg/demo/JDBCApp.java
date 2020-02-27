package com.capg.demo;
import java.sql.*;
import java.util.Scanner;

public class JDBCApp {

	public static void main(String[] args) {
		String url="jdbc:oracle:thin:@localhost:1521/xe";
		String user="system";
		String password="password";
		try {
//			1. Create connection
			Connection con=DriverManager.getConnection(url,user,password);
			
//			2. Create Statement
			Statement smt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the age");
			int age=in.nextInt();
			System.out.println("Enter the name");
			String name=in.next()+in.nextLine();
			
//			3. Execute query
			ResultSet rs=smt.executeQuery("select * from student where age="+age+  "or name='"+name+"'");
			
//			4. Processing ResultSet
			if(!rs.next()) {
				System.out.println("No data found");
			}
			else {
//				rs.previous();
				do {
				System.out.printf("%-10s%-30s%-10s\n","Roll","Name","Age");
				System.out.printf("%-10d",rs.getInt("roll"));
				System.out.printf("%-30s",rs.getString(2));
				System.out.printf("%-10d",rs.getInt(3));
				System.out.println();
			}while(rs.next());
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
