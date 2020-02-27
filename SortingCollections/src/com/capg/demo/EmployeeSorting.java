package com.capg.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSorting {
	public static void main(String ar[]) {
		List<Employee> emps=new ArrayList<>();
		emps.add(new Employee(101,"fhfgj",354689));
		emps.add(new Employee(102,"ryjjhdf",6965736));
		emps.add(new Employee(103,"bhkfd",43797));
		Collections.sort(emps);
		for(Employee emp:emps)
			System.out.println(emp);
	}
}
