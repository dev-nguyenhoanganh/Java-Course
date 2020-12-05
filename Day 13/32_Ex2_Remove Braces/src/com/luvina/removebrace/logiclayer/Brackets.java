/**
 * @Project_Name 32_Ex2_Remove Brackets
 */
package com.luvina.removebrace.logiclayer;

/**
 * @author Hoang Anh
 * @since 4 thg 12, 2020
 * @version 1.0
 */
public class Brackets {
	private String brackets;

	/**
	 * 
	 */
	public Brackets(String brackets) {
		this.brackets = brackets;
	}

	public String removeBrackest() {
		StringBuffer result = new StringBuffer(brackets);
		String indexBuffer = "";
		
		// Build buffer for excess brackets
		for (int i = 0; i < brackets.length(); i++) {
			char bracket = brackets.charAt(i);

			if (bracket == '(') {
				indexBuffer += " " + i;
			}

			if (bracket == ')') {
				if (indexBuffer.length() < 2) {
					result.deleteCharAt(i);
					i--;
				}
				indexBuffer = indexBuffer.substring(0, indexBuffer.lastIndexOf(' '));
			}
		}
		
		// Use indexBuffer to remove exess brackets
		if (indexBuffer.isEmpty()) { 
			return result.toString();
		}

		while (!indexBuffer.isEmpty()) {
			if (indexBuffer.isEmpty()) {
				break;
			}
			int lastSpace = indexBuffer.lastIndexOf(' ');
			int indexRemoveBracket = Integer.parseInt(indexBuffer.substring(lastSpace + 1)); 
			indexBuffer = indexBuffer.substring(0, lastSpace);
			result.deleteCharAt(indexRemoveBracket);
		}

		return result.toString();
	}
}
