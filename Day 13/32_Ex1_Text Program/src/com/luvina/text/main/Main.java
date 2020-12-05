/**
 * @Project_Name 32_Ex1_Text Program
 */
package com.luvina.text.main;

import com.luvina.text.text.Text;

/**
 * @author Hoang Anh
 * @since 3 thg 12, 2020
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Text text = new Text("123     321");

		String result = text.insert0Digit();
		System.out.println("Insert '0' Digit: \"" + result + "\"");

		result = text.removeRedundantSpace();
		System.out.println("Remove Redundant Space: \"" + result + "\"");

		System.out.println("Symmetry String: " + text.isSymmetryString());
	}

}
