/**
 * @Project_Name Ex1_Smart String
 */
package com.luvina.ss.smartstring;

import java.util.regex.Pattern;

/**
 * @author Hoang Anh
 * @since 19 thg 12, 2020
 * @version 1.0
 */
public class SmartString {
	private String text;
	private static final String REGEX_LENGTH 	  = "^\\w{6,8}$";
	private static final String REGEX_UPPER_LOWER = "[a-z|A-Z].*";
	private static final String REGEX_DIGIT 	  = "[\\D].*[\\d].*";
	
	
	/**
	 * 
	 */
	public SmartString() {
		
	}

	public int countCharacter(String text) {
		int count = 0;
		if(text.length() < 3) {
			return 0;
		}

		for(int i = 2; i < text.length() - 2; i++) {
			char ch = text.charAt(i);
			if(ch == 'b') {
				if(text.charAt(i-2) == 'a' || text.charAt(i+2) =='a') {
					count++;
				}
			}
		}		

		return count;
	}

	public String checkPassword(String text) {
		String result = "";
		for(int i = 0; i < text.length(); i++) {
			if(i + 6 > text.length()) {
				break;
			}

			char ch = text.charAt(i);
			if(Pattern.matches(REGEX_UPPER_LOWER, "" + ch)) {
				String temp = text.substring(i, i + 6);
				if(isRegexConditionOk(temp)) {
					result += " " + temp;
				}
			}
		}

		return result;
	}

	public boolean isRegexConditionOk(String text) {
		return Pattern.matches(REGEX_LENGTH, text) && Pattern.matches(REGEX_DIGIT, text);
	}
}
