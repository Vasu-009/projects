package com.capg;

import java.io.Serializable;

public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int empId;
	private String name;
	private float sal;
	
	public Employee(int empId, String name, float sal) {
		super();
		this.empId = empId;
		this.name = name;
		this.sal = sal;
	}
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
	
}
