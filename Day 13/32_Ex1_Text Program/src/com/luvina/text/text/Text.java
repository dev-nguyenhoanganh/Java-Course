/**
 * @Project_Name 32_Ex1_Text Program
 */
package com.luvina.text.text;

import java.lang.StringBuffer;

/**
 * @author Hoang Anh
 * @since 3 thg 12, 2020
 * @version 1.0
 */
public class Text {
	private String text;

	/**
	 * Phương thức khởi tạo của đối tượng Text
	 */
	public Text(String text) {
		this.text = text;
	}

	/**
	 * 
	 * @return
	 */
	public String insert0Digit() {
		String result = "";
		StringBuffer str = new StringBuffer(text);
		int lastIndex = 0;

		for (int i = 0; i < str.length(); i++) {
			char charOfIndex = str.charAt(i);
			if (Character.isDigit(charOfIndex)) {
				if (i == str.length() - 1) {
					str.insert(i + 1, "0");
					break;
				}
				lastIndex = i;
				continue;
			}
			if (lastIndex + 1 == i) {
				str.insert(i, "0");
			}
		}

		result = str.toString();
		return result;
	}

	/**
	 * 
	 * @return
	 */
	public String removeRedundantSpace() {
		String result = text.trim();
		while (result.contains("  ")) {
			result = result.replaceAll("  ", " ");
		}
		return result;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isSymmetryString() {
		StringBuffer str = new StringBuffer(text);
		str.reverse();
		
		String reverseString = str.toString();
		return text.equals(reverseString);
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
}
