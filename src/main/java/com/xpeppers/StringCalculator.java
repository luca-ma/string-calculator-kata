package com.xpeppers;

import java.util.Arrays;

public class StringCalculator {

	private static final String DEFAULT_SEPARATOR = ",";
	private static final String CUSTOM_DELIMITER_PATTERN = "^\\/\\/\\D\n.+";
	private String separator = DEFAULT_SEPARATOR;
	public int calculate(String inString) {
		if(inString==null||"".equals(inString)) {
			return 0;
		}else {
			if(inString.matches(CUSTOM_DELIMITER_PATTERN)) {
				separator=inString.substring(2, 3);
				inString =inString.substring(4);
			}
			 return Arrays.stream(inString.split(separator+ "|\n"))
			 .mapToInt(Integer::valueOf)
			 .sum();
		}
		
	}

}
