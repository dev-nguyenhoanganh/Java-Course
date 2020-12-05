/**
 * @Project_Name 32_Ex2_Remove Braces
 */
package com.luvina.removebrace.main;

import com.luvina.removebrace.logiclayer.Brackets;

/**
 * @author Hoang Anh
 * @since 4 thg 12, 2020
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Brackets brackets = new Brackets("(())()(()(");
		System.out.println(brackets.removeBrackest());
		
//		System.out.println(Integer.parseInt("10 "));
	}

}
