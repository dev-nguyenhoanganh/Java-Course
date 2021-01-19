/**
 * @Project_Name 32_Day 26_Ex2_Sort Program
 */
package com.luvina.logic;

import java.util.Arrays;

/**
 * @author Hoang Anh
 * @since 18 thg 1, 2021
 * @version 1.0
 */
public class Sort {
	private int listInt[];

	/**
	 * 
	 */
	public Sort() {

	}

	/**
	 * 
	 */
	public void setItemSort(String strNumber) {
		if (strNumber.matches("-?\\d+(,-?\\d+)+")) {
			String arrStr[] = strNumber.split(",");
			listInt = new int[arrStr.length];
			for (int i = 0; i < arrStr.length; i++) {
				listInt[i] = Integer.parseInt(arrStr[i]);
			}
		}
	}

	public String sort() {
		String result = "Dữ liệu nhập vào không hợp lệ";
		if (listInt != null) {
			Arrays.sort(listInt);
			result = Arrays.toString(listInt);
			result = result.substring(1, result.length() - 1);
			System.out.println(result);
			result = result.replaceAll(", ", " ");
			return result;
		}

		return result;
	}
}
