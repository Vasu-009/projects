package com.capg;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
	public static void main(String ar[]) {
		List<Employee> emps=new ArrayList<>();
		emps.add(new Employee(101,"Rahul",50000));
		emps.add(new Employee(102,"egth",60000));
		emps.add(new Employee(103,"fhyyhmyhm",70000));
		for(Employee emp:emps)
			System.out.println(emp);
	}
}
