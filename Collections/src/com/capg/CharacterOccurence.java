package com.capg;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterOccurence {
	public static void main(String ar[]) {
		System.out.println("Enter a string ");
		String str=new Scanner(System.in).nextLine();
		int len=str.length();
		Map occs=new HashMap();
		for(int i=0;i<len;i++) {
			char c=str.charAt(i);
			if(occs.containsKey(c)) {
				int n=(int)occs.get(c)+1;
				occs.put(c,n);
			}
			else {
				occs.put(c, 1);
			}
		}
		for(Object ch:occs.keySet()) {
			System.out.println(ch+" -> "+occs.get(ch));
		}
	}
}
