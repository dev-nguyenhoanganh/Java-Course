/**
 * @Project_Name 32_Ex2_Number Nice
 */
package com.luvina.number.main;

import java.util.Arrays;

import com.luvina.number.nice.NumberNice;

/**
 * @author Hoang Anh
 * @since 11 thg 12, 2020
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] tempArr = new int[] { 11000, 30001, 21210, 51010, 15251, 73571, 11111, 12345, 10154, 11310 };
		NumberNice array = new NumberNice(tempArr);
		System.out.println("Mảng ban đầu: ");
		System.out.println(Arrays.toString(tempArr));

		int[] result = array.findMostOddNumber();
		System.out.print("\nPhần tử có số lượng các chữ số là số lẻ lớn nhất:");
		System.out.println(Arrays.toString(result));

		result = array.findLargestSum();
		System.out.print("\n3 số có tổng lớn nhất nhỏ hơn 50000:");
		System.out.println(Arrays.toString(result));
	}

}
