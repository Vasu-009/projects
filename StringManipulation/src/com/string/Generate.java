package com.string;

import java.util.Arrays;
import java.util.List;

public class Generate {
	
	public static void main(String ar[]) {
		
//		String[] s= {"jkdfgh","ghjshjk","dfgh"};
//		for(int i=0;i<3;i++) {
//			if(s[i].length()>5) {
//				System.out.println(s[i].toUpperCase());
//			}
//		}
		
		List<String> s1=Arrays.asList("jkdfgh","ghjshjk","dfgh");
//		for(String a:s1) {
//			if(a.length()>5) {
//				System.out.println(a.toUpperCase());
//			}
//		}
		s1.stream()
					.filter(s->s.length()>5)
					.map(String::toUpperCase)
					.forEach(
							System.out::println);
		
	}
}
