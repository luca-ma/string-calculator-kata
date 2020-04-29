package com.xpeppers;

import java.util.Arrays;

public class StringCalculator {

	public int calculate(String inString) {
		if(inString==null||"".equals(inString)) {
			return 0;
		}else {
			 return Arrays.stream(inString.split(",|\n"))
			 .mapToInt(Integer::valueOf)
			 .sum();
		}
		
	}

}
