/**
 * @Project_Name 32_Ex1_Text Program
 */
package com.luvina.text.text;

/**
 * @author Hoang Anh
 * @since 3 thg 12, 2020
 * @version 1.0
 */
public class Text {
	private StringBuilder text;
	
	/**
	 * Phương thức khởi tạo của đối tượng Text
	 */
	public Text(String text) {
		this.text = new StringBuilder(text);
	}

	
	
	/**
	 * @param text the text to set
	 */
	public void setText(StringBuilder text) {
		this.text = text;
	}
}
