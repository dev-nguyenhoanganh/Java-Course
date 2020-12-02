/**
 * @Project_Name 32_Ex4_External Project
 * @author Hoang Anh
 * @date 2 thg 12, 2020
 * @version 1.0
 */
package com.luvina.external.main;

import com.luvina.external.smartcount.SmartCount;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartCount str = new SmartCount("123 132 123 a 123 a 123");
		String check = "12";
		
		int repeatTime = str.countRepeat(check);
		System.out.println("Repeat Times of \"" + check + "\" is: " + repeatTime);
	}
}
