/**
 * @Project_Name 32_Ex2_ReverseInt Program
 * @author Hoang Anh
 * @date 1 thg 12, 2020
 * @version 1.0
 */
package com.luvina.reverseint.main;

import com.luvina.reverseint.reverseint.ReverseInt;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReverseInt number = new ReverseInt(46);
		
		int result = number.reverseInt();
		System.out.println("Số nguyên đảo: " + result);
	}

}
