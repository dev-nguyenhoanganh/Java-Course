/**
 * @Project_Name 32_AnhNH_Matrix Fun
 */
package com.luvina.matrix;

import java.util.Arrays;

/**
 * @author Hoang Anh
 * @since 21 thg 12, 2020
 * @version 1.0
 */
public class MatrixFun {
	private int[][] matrix;

	/**
	 * 
	 */
	public MatrixFun() {
		// TODO Auto-generated constructor stub
	}

	public void initMatrix() {
		matrix = new int[][] {
			{1, 2, 1, 4, 9, 6, 5, 8},
			{5, 3, 9, 5, 6, 1, 8, 9},
			{3, 4, 9, 6, 3, 8, 9, 1},
			{1, 5, 3, 1, 9, 5, 7, 7},
			{9, 9, 5, 3, 2, 1, 5, 6},
			{5, 7, 9, 6, 3, 9, 9, 1},
			{1, 5, 5, 1, 9, 5, 7, 7},
			{9, 9, 7, 3, 2, 9, 5, 6},
		};
	}

	@Override
	public String toString() {
		String result = "";
		for (int i = 0; i < matrix.length; i++) {
			result += Arrays.toString(matrix[i]) + "\n";
		}
		return result;
	}

	public String matrixToString(int[][] matrix) {
		String result = "";
		for (int i = 0; i < matrix.length; i++) {
			result += Arrays.toString(matrix[i]) + "\n";
		}
		return result;
	}

	public void maxDiagonalLine() {
		int[][] newMatrix = cloneMatrix(matrix);
		for (int i = 0; i < matrix.length; i++) {
			int[] max = findMax(matrix[i]);
			newMatrix[i][i] 	 = max[0];
			newMatrix[i][max[1]] = matrix[i][i];

			int[] min = findMin(matrix[i]);
			newMatrix[i][matrix.length - i - 1] = min[0];
			newMatrix[i][min[1]] 				= matrix[i][matrix.length - i - 1];
		}
		System.out.println(matrixToString(newMatrix));
	}

	public void findMinMax() {
		int index = 1;
		int max1 = matrix[0][0];
		int max2 = matrix[0][0];
		int max3 = matrix[0][0];
		int countMax1 = 0;
		int countMax2 = 0;
		int countMax3 = 0;
		String resultMax1 = max1 + ", ";
		String resultMax2 = "";
		String resultMax3 = "";

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if(max1 == max3) {
					max3 = matrix[i][j];
				}
				
				if (max1 < matrix[i][j]) {
					max3 = max2;
					max2 = max1;
					max1 = matrix[i][j];
					if(++index >= 3) {
						countMax3 = 1;
					}
					countMax3 = countMax2;
					countMax2 = countMax1;
					countMax1 = 1;
					resultMax3 = resultMax2;
					resultMax2 = resultMax1;
					resultMax1 = max1 + ", (" + i + "; " + j + "), ";
				} else if (max1 == matrix[i][j]) {
					resultMax1 += "(" + i + "; " + j + "), ";
					countMax1++;
				} else if (matrix[i][j] != max1 && matrix[i][j] > max2) {
					max2 = matrix[i][j];
					countMax2 = 1;
					resultMax2 = max2 + ", (" + i + "; " + j + "), ";
				} else if (matrix[i][j] != max1 && matrix[i][j] != max2 && matrix[i][j] > max3) {
					max3 = matrix[i][j];
					resultMax3 = max3 + ", (" + i + "; " + j + "), ";
					countMax3  = 1;
				} else if (max3 == matrix[i][j]) {
					resultMax3 += "(" + i + "; " + j + "), ";
					countMax3++;
				} else if (max2 == matrix[i][j]) {
					resultMax2 += "(" + i + "; " + j + "), ";
					countMax2++;
				}
			}
		}
		resultMax1 += "\nSố lần xuất hiện: " + countMax1;
		resultMax3 += "\nSố lần xuất hiện: " + countMax3;
		System.out.println(resultMax1 + "\n\n" + resultMax3);
	}

//	public void find() {
//		int max1 = findMax();
//		int max3 = findMax(max1);
//		max3 = findMax(max3);
//		String result = max1 + ", ";
//
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[0].length; j++) {
//				if (max1 == matrix[i][j]) {
//
//				}
//
//				if (max3 == matrix[i][j]) {
//
//				}
//			}
//		}
//
//	}

	public int findMax() {
		int max1 = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] > max1) {
					max1 = matrix[i][j];
				}
			}
		}
		return max1;
	}

	public int findMax(int max) {
		int max1 = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if(max1 == max) {
					max1 = matrix[i][j];
				}
				if (matrix[i][j] == max) {
					continue;
				}
				if (matrix[i][j] > max1) {
					max1 = matrix[i][j];
				}
			}
		}
		return max1;
	}

	private int[] findMax(int[] arr) {
		int max   = arr[0];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		return new int[] {max, index};
	}

	private int[] findMin(int[] arr) {
		int min   = arr[0];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				index = i;
			}
		}
		return new int[] {min, index};
	}

	private int[][] cloneMatrix(int[][] matrix) {
		int[][] newMatrix = new int[matrix.length][matrix[0].length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				newMatrix[i][j] = matrix[i][j];
			}
		}
		return newMatrix;
	}
}
