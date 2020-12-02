/**
 * @Project_Name 32_Ex3_SmartText Program
 * @author Hoang Anh
 * @date 1 thg 12, 2020
 * @version 1.0
 */
package com.luvina.smarttext.main;

import com.luvina.smarttext.smarttext.SmartText;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartText txt = new SmartText("   aaaâa  ab  3  wêwwc  aíravg aơagax ");
		
		String result = txt.storeByCharacter();
		System.out.println("Store by character: " + result);
		
		result = txt.orderByCharacter(result);
		System.out.println("Oder by character: " + result);
		
		result = txt.letterFrequency();
		System.out.println("Frequency: \n" + result);
		
		result = txt.trimExtra(' ');
		System.out.println("Trim: " + result);
		
		result = txt.removeLatinChar();
		System.out.println("Remove Latin Characters: " + result);
	}
}
