package com.capg.demo;

public class Employee implements Comparable<Employee>{
		private int empId;
		private String name;
		private float salary;
		
		public Employee(int empId, String name, float sal) {
			super();
			this.empId = empId;
			this.name = name;
			this.salary = sal;
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

		public float getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}
		
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + empId;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + Float.floatToIntBits(salary);
			return result;
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (empId != other.empId)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (Float.floatToIntBits(salary) != Float.floatToIntBits(other.salary))
				return false;
			return true;
		}
		
		public int compareTo(Employee e) {
//			return (int) (this.salary-e.salary);
//			return this.empId-e.empId;
			return (this.name).compareTo(e.name);
			
		}
}
