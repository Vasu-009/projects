package com.methods;

import java.util.Scanner;

public class Methods {

	float add(float a,float b) {
		return a+b;
	}
	float subtract(float a,float b) {
		return a-b;
	}
	float multiply(float a,float b) {
		return a*b;
	}
	float divide(float a,float b) {
		return a/b;
	}
	float average(float a,float b) {
		return (a+b)/2;
	}
	
	
	public static void main(String ar[])
	{
		float result=0;
		Methods m=new Methods();
		Scanner s=new Scanner(System.in);
		
		float a=s.nextFloat();
		float b=s.nextFloat();
		int op=s.nextInt();
		switch(op)
		{
		case 1: result=m.add(a, b);
//			    System.out.println("addition is "+sum);
			    break;
		case 2: result=m.subtract(a, b);
//				System.out.println("subtraction is "+sub);
				break;
		case 3: result=m.multiply(a, b);
//		   		System.out.println("multiplication is "+mul);
		   		break;
		case 4:result=m.divide(a, b);
//		   		System.out.println("division is "+div);
		   		break;
		case 5:result=m.average(a, b);
//				System.out.println("avg is "+avg);
				break;
		}
		System.out.println("Result is "+result);
		
	}

}
