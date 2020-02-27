package exerciseprograms;

import java.util.Scanner;

public class sum{
	
	public int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if((n%3==0)||(n%5==0))
				sum=sum+i;
				
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
    	sum x=new sum();
		Scanner a=new Scanner(System.in);
		System.out.println("Enter n");
		n=a.nextInt();
		int sum=x.calculateSum(n);
		System.out.println(sum);
	}

}
