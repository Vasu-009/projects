package exerciseprograms;

import java.util.Scanner;

public class exercise2 {
	public int calculateDifference(int n){
		return sumOfSquares(n)-squaresOfSum(n);
	}
	
	public int sumOfSquares(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i*i;
		}
		return sum;
	}
	public int squaresOfSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		return sum*sum;
	}
	public static void main(String ar[])
	{
		exercise2 e=new exercise2();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int difference=e.calculateDifference(n);
		System.out.println(difference);
	}
	
}
