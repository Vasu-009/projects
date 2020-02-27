package com.capg.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<Integer> nums=Arrays.asList(5,2,7,10,3,1);
			Collections.sort(nums);
			for(int n:nums) {
				System.out.println(n);  
			}
			
			List<String> names=Arrays.asList("abc","xyz","pqr","lmn");
			Collections.sort(names);
			for(String s:names) {
				System.out.println(s);
			}
			

	}

}
