package co.udea.convertertest;

import static org.junit.Assert.*;

import org.junit.Test;

import co.udea.converter.Converter;

public class ConverterTest {
	Converter c = new Converter();
	
	@Test
	public void test_roman_I(){
		int result = c.fromRomanToDecimal("I");
		assertEquals(1, result);			
	}
	
	@Test
	public void test_roman_V(){
		int result = c.fromRomanToDecimal("V");
		assertEquals(5, result);			
	}
	
	@Test
	public void test_roman_X(){
		int result = c.fromRomanToDecimal("X");
		assertEquals(10, result);			
	}
	
	@Test
	public void test_roman_L(){
		int result = c.fromRomanToDecimal("L");
		assertEquals(50, result);			
	}
	
	@Test
	public void test_roman_C(){
		int result = c.fromRomanToDecimal("C");
		assertEquals(100, result);			
	}
	
	@Test
	public void test_roman_D(){
		int result = c.fromRomanToDecimal("D");
		assertEquals(500, result);			
	}
	
	@Test
	public void test_roman_M(){
		int result = c.fromRomanToDecimal("M");
		assertEquals(1000, result);			
	}
	
	@Test
	public void test_roman_III(){
		int result = c.fromRomanToDecimal("III");
		assertEquals(3, result);
	}
	
	@Test
	public void test_roman_VIII(){
		int result = c.fromRomanToDecimal("VIII");
		assertEquals(8, result);
	}
	
	@Test
	public void test_roman_XCIV(){
		int result = c.fromRomanToDecimal("XCIV");
		assertEquals(94, result);
	}
	
}
