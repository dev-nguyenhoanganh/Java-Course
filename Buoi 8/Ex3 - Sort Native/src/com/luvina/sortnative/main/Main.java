/**
 * @Project_Name Ex3 - Sort Native
 * @author Hoang Anh
 * @date 17 thg 11, 2020
 * @version 1.0
 */
package com.luvina.sortnative.main;

import com.luvina.sortnative.sortnative.SortNative;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SortNative list = new SortNative(1,9,3,2);
		System.out.println(list.sort());
	}

}
