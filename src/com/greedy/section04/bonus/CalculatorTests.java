package com.greedy.section04.bonus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTests {
	
	private Calculator calc;
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("beforeAll ������...");
	}
	
	@BeforeEach
	public void setUp() {
		calc = new Calculator();
		System.out.println("beforeEach ������...");
	}
	
	@Test
	@DisplayName("sumTwoNumber�� 10�� 20�� �����Ͽ� �� ���������� Ȯ��")
	public void testSumTwoNumber() {
		
//		int result = calc.sumTwoNumber(10, 20);
//		
//		System.out.println("�׽�Ʈ1");
//		
//		assertEquals(30, result);
		
		//given
		int num1 = 10;
		int num2 = 20;
		int expected = 30;
		
		//when
		int result = calc.sumTwoNumber(num1, num2);
		
		//then
		assertEquals(expected, result);
	}
	
	@Test
	@Disabled
	public void testSumTwoNumber2() {	
		
		int result = calc.sumTwoNumber(30, 50);
		
		System.out.println("�׽�Ʈ2");
		
		assertEquals(80, result);
//		assertTrue
//		assertNotNull
//		assertNull
		
	}
	
	@AfterEach
	public void close() {
		System.out.println("afterEach ������...");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("afterAll ������...");
	}
}
