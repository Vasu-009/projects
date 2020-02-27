package com.capg.maven.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class AppTest {
	
	int x=0;
	App app=new App();
	
	@BeforeEach
	void sayHello() {
		System.out.println("HEllo");
	}
	
	@AfterEach
	void sayBye() {
		System.out.println("Bye");
	}
	
	@Test
	void testAddMethod() {
		assertEquals(10, app.add(4, 6));
	}
	
	@Test
	void test2() {
		assertNotEquals(100,app.add(25, 30));
	}
	
	@Test
	void test3() {
		assertThrows(ArithmeticException.class, ()->{int x=5/0;});
	}
	
	@Nested
	class NestedTestDemo{
		@Test
		void t1() {
			assertFalse(x>0);
		}
	}
	
}
