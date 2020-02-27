package com.capg;

public class MultiCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int []a= {7,3,0,6,2};
			Integer.parseInt("90");
			
			try {
				int res=a[0]/a[2];
				System.out.println("completed");
				}
			catch(ArithmeticException ex) {
				System.out.println("Divide by zero is not allowed");
			}
			catch(ArrayIndexOutOfBoundsException ex) {
				System.out.println("Index exceeds the limit");
			}
			catch(Exception ex) {
				System.out.println("Error "+ex);
			}
			finally {
			System.out.println("completed");
			}
			
	}
}
