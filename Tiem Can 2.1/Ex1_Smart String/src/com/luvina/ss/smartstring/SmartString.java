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
	private static final String REGEX_UPPER_LOWER = "(?=.*[A-Z])(?=.*[a-z]).*";
	private static final String REGEX_DIGIT 	  = "[\\D].*[\\d].*";
	
	public SmartString() {
		this.text = "";
	}

	/**
	 * 
	 */
	public SmartString(String text) {
		this.text = text;
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

	public String checkPassword(String text){
		String result = "";
		if(isRegexConditionOk(text)) {
			for(int i = 0; i < text.length(); i++) {
				result += text.charAt(i) + " ";
			}
		} else {
			return "Không thỏa mãn định dạng";
		}
		return result;
	}

	/**
	 * 
	 * @param text
	 * @return
	 */
	public String findPassword(String text) {
		String result = "";
		for(int i = 0; i < text.length(); i++) {
			if(i + 6 > text.length()) {
				break;
			}

			char ch = text.charAt(i);
			if(Pattern.matches("[a-zA-Z]", "" + ch)) {
				String temp = text.substring(i, i + 6);
				if(isRegexConditionOk(temp)) {
					result += " " + temp;
				}
			}
		}

		if(result.isEmpty()) {
			return "Không có mật khẩu thỏa mãn";
		}
		return result;
	}

	private boolean isRegexConditionOk(String text) {
		return Pattern.matches(REGEX_UPPER_LOWER, text) && Pattern.matches(REGEX_DIGIT, text) && Pattern.matches(REGEX_LENGTH, text);
	}
}
