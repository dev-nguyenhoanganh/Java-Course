/**
 * @Project_Name 32_Ex1_Check String Type
 */
package com.luvina.string.main;

import java.util.regex.Pattern;

import com.luvina.string.exception.CheckStringException;

/**
 * @author Hoang Anh
 * @since 30 thg 12, 2020
 * @version 1.0
 */
public class Main {
	private final static String REGEX_INTEGER = "^-?\\d+$";
	private final static String REGEX_REAL = "-?\\d+([\\.\\,\\+\\/]\\d+)?";

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "-123";
		String result = "";

		try {
			result = checkString(str);
		} catch (CheckStringException exception) {
			exception.printStackTrace();
		}

		System.out.println(result);
	}

	public static String checkString(String str) throws CheckStringException {
		if ("true".equals(str) || "false".equals(str)) {
			return "Kiểu Logic";
		}

		if (Pattern.matches(REGEX_INTEGER, str)) {
			return "Số nguyên";
		}

		if (Pattern.matches(REGEX_REAL, str)) {
			return "Số thực";
		}

		throw new CheckStringException("undefine");
	}
}
