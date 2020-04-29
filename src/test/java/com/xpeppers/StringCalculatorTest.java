package com.xpeppers;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
	private static int expectedStringCalcResult =0;
	private static String inString ="";

	@Before
	public void setUpBeforeClass()  {
		expectedStringCalcResult =0;
		inString ="";;
	}

	@Test
	public void emptyStringTest() {
				
		assertEquals(expectedStringCalcResult,
		new StringCalculator().calculate(inString));
	}
	
	@Test
	public void singleDigitTest() {
		inString = "3";
		expectedStringCalcResult = Integer.valueOf(inString);		
		assertEquals(expectedStringCalcResult,
		new StringCalculator().calculate(inString));
	}
	
	@Test
	public void singleNegativeDigitTest() {
		inString = "-1";
		expectedStringCalcResult = -1;		
		assertEquals(expectedStringCalcResult,
		new StringCalculator().calculate(inString));
	}
	
	@Test
	public void multipleDigitTest() {
		inString = "3,1";
		expectedStringCalcResult = 4;		
		assertEquals(expectedStringCalcResult,
		new StringCalculator().calculate(inString));
	}

	@Test
	public void multipleDigitWithNewLinesTest() {
		inString = "1\n2,3";
		expectedStringCalcResult = 6;		
		assertEquals(expectedStringCalcResult,
		new StringCalculator().calculate(inString));
	}
	
	@Test
	public void multipleDigitWithMultiDelimiter() {
		inString = "//;\n1;2";
		expectedStringCalcResult = 3;		
		assertEquals(expectedStringCalcResult,
		new StringCalculator().calculate(inString));
		
		
	}
	
	
	
}
