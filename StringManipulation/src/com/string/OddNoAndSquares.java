package com.string;

import java.util.Arrays;
import java.util.List;

public class OddNoAndSquares {
	public static void main(String ar[]) {
		List<Integer> a=Arrays.asList(1,3,5,6);
//		int sum=0;
//		for(Integer s:a) {
//			if(s%2!=0) {
//				sum=sum+s*s;
//			}
//		}
//		System.out.println(sum);
		
		int sum=a.stream()
				
				.filter(i->i%2!=0)
				
				.mapToInt(i->i*i).sum();
				
		System.out.println("Sum of squares is "+sum);
	}
}
