/**
 * @Project_Name 32_Ex3_Matrix Fun
 */
package com.luvina.matrix.fun;

import java.lang.ref.Cleaner;
import java.util.Arrays;

/**
 * @author Hoang Anh
 * @since 11 thg 12, 2020
 * @version 1.0
 */
public class MatrixFun {
	private int[][] array;

	/**
	 * Phương thức khởi tạo giá trị cho đối tượng
	 * 
	 * @param array - mảng 2 chiều truyền vào
	 */
	public MatrixFun(int array[][]) {
		this.array = new int[array.length][array[0].length];
		for(int i = 0; i < array.length; i++) {
			this.array[i] = Arrays.copyOf(array[i], array[i].length);
		}
	}

	/**
	 * Phương thức tính tổng các vùng được ngăn cách bởi 2 đường chéo của 
	 * ma trận
	 * 
	 * @return Mảng trả về tổng của 4 vùng tương ứng
	 */
	public int[] calcSumArea() {
		int[] sum = new int[4];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if((j > i) && (i + j < array.length - 1)) {
					sum[0] += array[i][j];
				} else if ((j > i) && (i + j > array.length - 1)) {
					sum[1] += array[i][j];
				} else if ((j < i) && (i + j > array.length - 1)) {
					sum[2] += array[i][j];
				} else if ((j < i) && (i + j < array.length - 1)) {
					sum[3] += array[i][j];
				}
			}
		}
		return sum;
	}
	
	public int[] calcSum() {
		int[] sum = new int[4];
		for (int i = 1; i < sum.length / 2 - 1; i++) {
			for (int j = 0; j < sum.length - i - 1; j++) {
				sum[1] += array[i][j];
				sum[2] += array[j][i];
			}
		}

		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				
			}
		}

		return sum;
	}


	/**
	 * Phương thức tìm giá trị phần tử lớn thứ hai trong mảng
	 * @return Giá trị của phần tử lớn thứ 2 trong mảng
	 */
	public int findSecondMax() {
		int secondMax = array[0][0];
		int max = array[0][0];

		for(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if(max == secondMax) {
					secondMax = array[i][j];
				}
				if(max < array[i][j]) {
					secondMax = max;
					max = array[i][j];
				} else if (array[i][j] != max && array[i][j] > secondMax) {
					secondMax = array[i][j];
				}
			}
		}

		if (max == secondMax) {
			System.out.println("Các phần tử trong mảng bằng nhau");
		}
		return secondMax;
	}
}
