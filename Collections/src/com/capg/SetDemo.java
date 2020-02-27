package com.capg;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String ar[])
	{
		Set set=new TreeSet();
		set.add(5);
		set.add(100);
		set.add(7);
		set.add(100);
		set.add(14);
		System.out.println(set);
	}
}

