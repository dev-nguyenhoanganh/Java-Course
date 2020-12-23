/**
 * @Project_Name 32_AnhNH_Smart String
 */
package com.luvina.ss;

/**
 * @author Hoang Anh
 * @since 21 thg 12, 2020
 * @version 1.0
 */
public class SmartString {


	/**
	 * 
	 */
	public SmartString() {

	}

	public String sortUpEachWord(String text) {
		String result = "\"";
		String tmp = text;
		String tmp2 = "";

//		start_loop:
		for (int i = 1; i < text.length(); i++) {
			char min = tmp.charAt(0);
			if (min == ' ') {
				continue;
			}
			for (int j = 1; j < tmp.length(); j++) {
				char ch = tmp.charAt(j);
				if (ch == ' ') {

				} else if (min > tmp.charAt(j)) {
					tmp2 += min;
					min = tmp.charAt(j);
					continue;
				}
				tmp2 += tmp.charAt(j);
			}
			tmp = tmp2;
			tmp2 = "";
			result += min;
		}
		return result + tmp + "\"";
	}

	public String convertSnakeCaseToCamelCase(String text) {
		String result = "";
		boolean flag = false;
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (ch == '_') {
				flag = true;
				continue;
			} else if (flag) {
				ch = Character.toUpperCase(ch);
				flag = false;
			}
			result += ch;
		}
		return result;
	}
}
