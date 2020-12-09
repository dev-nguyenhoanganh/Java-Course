/**
 * @Project_Name 32_Ex2_Array Util
 */
package com.luvina.arrayutil.main;

import java.util.Arrays;

import com.luvina.arrayutil.arrayutil.ArrayUtil;

/**
 * @author Hoang Anh
 * @since 8 thg 12, 2020
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayUtil arr = new ArrayUtil(10);

		String result = arr.findTriangle();

		System.out.print("Giá trị của mảng: ");
		System.out.println(Arrays.toString(arr.getArr()));
		System.out.println("\nBộ 3 giá trị có thể tạo thành tam giác:\n" + result);
	}
}
