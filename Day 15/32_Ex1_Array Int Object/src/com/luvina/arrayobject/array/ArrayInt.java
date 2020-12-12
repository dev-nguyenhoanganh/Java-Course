/**
 * @Project_Name 32_Ex1_Array Int Object
 */
package com.luvina.arrayobject.array;

import java.util.Arrays;

/**
 * @author Hoang Anh
 * @since 11 thg 12, 2020
 * @version 1.0
 */
public class ArrayInt {
	private int arrInt[];

	/**
	 * Phương thức khởi tạo của đối tượng
	 * 
	 * @param arr - Mảng truyền vào
	 */
	public ArrayInt(int arr[]) {
		this.arrInt = Arrays.copyOf(arr, arr.length);
	}

	/**
	 * Phương thức sắp xếp các phần tử theo thứ tự tăng dần
	 * 
	 * @return Mảng sau khi đã xếp các phần tử theo hướng tăng dần
	 */
	public int[] sortArray() {
		int[] arrSort = Arrays.copyOf(arrInt, arrInt.length);
		Arrays.sort(arrSort);
		return arrSort;
	}

	/**
	 * Phương thức xóa các phần tử trùng lặp của mảng
	 * 
	 * @return Mảng sau khi đã xóa các phần tử lặp
	 */
	public int[] removeDuplicateValue() {
		int[] tempArr = sortArray();
		int j = 0;

		for (int i = 0; i < tempArr.length - 1; i++) {
			if (tempArr[i] != tempArr[i + 1]) {
				tempArr[j++] = tempArr[i];
			}
		}

		tempArr[j++] = tempArr[tempArr.length - 1];
		return Arrays.copyOf(tempArr, j);
	}

	/**
	 * Phương thức tìm các phần tử giao giữa 2 mảng với nhau
	 * 
	 * @param arr - mảng truyền vào
	 * @return Mảng chứa các phần tử giao nhau
	 */
	public int[] findUnion(int[] arr) {
		int[] tempArr = removeDuplicateValue();
		int count = 0;

		for (int i = 0; i < tempArr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (tempArr[i] == arr[j]) {
					tempArr[count] = arr[j];
					count++;
					break;
				}
			}
		}

		return Arrays.copyOf(tempArr, count);
	}
}
