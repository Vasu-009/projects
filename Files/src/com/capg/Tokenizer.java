package com.capg;

import java.time.LocalDate;

public class Tokenizer {
	
	public static void main(String[] args) {
		
		LocalDate d=LocalDate.of(1995,12,12);
		LocalDate today=LocalDate.now();
		int age=today.getYear()-d.getYear();
		System.out.println(age);
	}
}
