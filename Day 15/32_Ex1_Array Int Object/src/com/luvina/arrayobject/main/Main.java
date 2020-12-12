/**
 * @Project_Name 32_Ex1_Array Int Object
 */
package com.luvina.arrayobject.main;

import java.util.Arrays;

import com.luvina.arrayobject.array.ArrayInt;

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
		int tempArr[] = new int[] { 1, 2, 3, 4, 5, 2, 3, 1, 5, 4, 1, 4, 5, 3, 2 };
		ArrayInt array = new ArrayInt(tempArr);

		tempArr = array.sortArray();
		System.out.print("Mảng sau khi xếp: ");
		System.out.println(Arrays.toString(tempArr));

		tempArr = array.removeDuplicateValue();
		System.out.print("Mảng sau khi xóa phần tử trùng lặp: ");
		System.out.println(Arrays.toString(tempArr));

		int[] duplicateArr = new int[] { 1, 2, 5, 3, 7 };
		int[] result = array.findUnion(duplicateArr);
		System.out.print("Kết quả tìm các phần tử giao nhau: ");
		System.out.println(Arrays.toString(result));
	}

}
