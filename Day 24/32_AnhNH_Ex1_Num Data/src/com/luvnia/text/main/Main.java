/**
 * @Project_Name 32_AnhNH_Ex1_Num Data
 */
package com.luvnia.text.main;

import com.luvnia.text.file.SmartString;

/**
 * @author Hoang Anh
 * @since 9 thg 1, 2021
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartString str = new SmartString();
		str.filter();
		str.print();
		
		str.validate();

	}

}
