/**
 * @Project_Name Ex1_Smart String
 */
package com.luvina.ss.main;

import com.luvina.ss.smartstring.SmartString;

/**
 * @author Hoang Anh
 * @since 19 thg 12, 2020
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartString smart = new SmartString();

		String text = "abbc acb aab aababaxbxa";
		System.out.println("Số lần xuất hiện ký tự b: ");
		System.out.println(smart.countCharacter(text));

		String result = smart.checkPassword("Abvc23567");

		System.out.print("Mật khẩu: ");
		System.out.println(result);
	}

}
