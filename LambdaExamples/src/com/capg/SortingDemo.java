package com.capg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingDemo {
	
	public static void main(String ar[]) {

		 List<String> names=Arrays.asList("xyz","pqr","fdg","tre");
		 Collections.sort(names,(s1,s2)->s1.compareTo(s2));
		 names.forEach((s)->System.out.println(s));
		 
		 List<Integer> nums=Arrays.asList(4,7,2,1,3);
		 Collections.sort(nums,(s1,s2)->s2-s1);
		 nums.forEach((s)->System.out.println(s));
		 
		 List<String> alpha=Arrays.asList("asfghd","sd","sfd","sgsg");
		 Collections.sort(alpha,(s1,s2)->s1.length()-s2.length());
		 alpha.forEach(System.out::println);
	
	}
}
