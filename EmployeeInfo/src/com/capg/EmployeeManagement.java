package com.capg;

import java.util.Scanner;

public class EmployeeManagement {
	
	 public static Employee readEmployee() {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		String b=in.next()+in.nextLine();
		float c=in.nextFloat();
		Employee emp=new Employee(a,b,c);
		return emp;
	}
	
	public static void main(String ar[]) {
		int i;
		Employee []arr=new Employee[3];
		for(i=0;i<3;i++) {
				arr[i]=readEmployee();
		}
		for(Employee e:arr) {
			System.out.println(e);
		}
	}

}
