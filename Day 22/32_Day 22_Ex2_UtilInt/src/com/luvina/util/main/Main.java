/**
 * @Project_Name 32_Day 22_Ex2_UtilInt
 */
package com.luvina.util.main;

import com.luvina.util.utilint.UtilInt;

/**
 * @author Hoang Anh
 * @since 6 thg 1, 2021
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UtilInt object = new UtilInt();

		object.init();
		object.display();

//		Cách 1
		object.displayMultiples();

//		Cách 2:
//		System.out.print("Danh sách bội chung : ");
//		String arr[] = object.countMultiples();
//		System.out.println(Arrays.toString(arr));
//		System.out.println(object.displayMultiples());
	}

}

// 3,2,3,4,5,6,8,9,10,15