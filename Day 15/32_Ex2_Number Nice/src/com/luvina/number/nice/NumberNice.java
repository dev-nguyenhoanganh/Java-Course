/**
 * @Project_Name 32_Ex2_Number Nice
 */
package com.luvina.number.nice;

import java.util.Arrays;

/**
 * @author Hoang Anh
 * @since 11 thg 12, 2020
 * @version 1.0
 */
public class NumberNice {
	private int[] array;
	final static int MAX_VALUE = 50000;

	/**
	 * Phương thức khởi tạo
	 * 
	 * @param arr - mảng truyền vào
	 */
	public NumberNice(int[] arr) {
		array = Arrays.copyOf(arr, 10);
	}

	/**
	 * Phương thức sắp xếp các phần tử trong mảng theo giá trị tăng dần
	 * 
	 * @return Mảng đã sắp xếp
	 */
	public int[] sortArray() {
		int[] tempArr = Arrays.copyOf(array, array.length);
		Arrays.sort(tempArr);
		return tempArr;
	}

	/**
	 * Phương thức tìm phần tử có số lượng các chữ số là số lẻ lớn nhất
	 * 
	 * @return Mảng gồm các phần tử hợp thành bởi nhiều số lẻ nhất
	 */
	public int[] findMostOddNumber() {
		int result[] = new int[10];
		int index = 0;
		int max = countOddNumber(array[0]);
		for (int i = 0; i < array.length; i++) {
			int countOdd = countOddNumber(array[i]);
			if (max < countOdd) {
				max = countOdd;
				index = 0;
				result[index++] = array[i];
			} else if (max == countOdd) {
				result[index++] = array[i];
			}
		}
		return Arrays.copyOf(result, index);
	}

	/**
	 * Phương thức tìm 3 phần tử có tổng lớn nhất trong mảng sao cho tổng của 3 phần
	 * tử nhỏ hơn 50000
	 * 
	 * @return Mảng gồm 3 phần tử có tổng lớn nhất nhỏ hơn 50000
	 */
	public int[] findLargestSum() {
		int[] tempArr = Arrays.copyOf(array, array.length);
		Arrays.sort(tempArr);

		// Loại bỏ các phần tử của mảng lớn hơn 50000
		tempArr = cutArray(tempArr, MAX_VALUE);
		for (int i = tempArr.length - 1; i > 1; i--) {
			for (int j = i - 1; j > 0; j--) {
				for (int k = j - 1; k >= 0; k--) {
					if (tempArr[i] + tempArr[j] + tempArr[k] <= MAX_VALUE) {
						tempArr[0] = tempArr[k];
						tempArr[1] = tempArr[j];
						tempArr[2] = tempArr[i];
						break;
					}
				}
			}
		}

		return Arrays.copyOf(tempArr, 3);
	}

	// -------------------- PRIVATE LAYER --------------------

	/**
	 * Phương thức đếm các số lẻ có trong số *number*
	 * 
	 * @param number - giá trị cần đếm
	 * @return Số lượng các số lẻ hợp thành số *number*
	 */
	private int countOddNumber(int number) {
		int count = 0;
		while (number > 0) {
			if (number % 2 == 1) {
				count++;
			}
			number /= 10;
		}

		return count;
	}

	/**
	 * Phương thức cắt bỏ mảng từ giá trị nhỏ hơn maxValue
	 * 
	 * @param arr      - mảng cần cắt
	 * @param maxValue - giá trị giới hạn
	 * @return Mảng đã cắt
	 */
	private int[] cutArray(int[] arr, int maxValue) {
		int index = 0;
		while (arr[index] < maxValue) {
			index++;
		}
		return Arrays.copyOf(arr, index);
	}
}
