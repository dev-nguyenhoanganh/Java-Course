/**
 * @Project_Name Ex2_Matrix Fun
 */
package com.luvina.mf.matrix;

/**
 * @author Hoang Anh
 * @since 19 thg 12, 2020
 * @version 1.0
 */
public class MatrixFun {
	private int[][] matrix;

	/**
	 * 
	 */
	public MatrixFun() {

	}

	public void init() {
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

	public String findMax() {
		int max = matrix[0][0];
		int min = matrix[0][0];
		String resultMax = max + ", ";
		String resultMin = min + ", ";
		int countMax = 0;
		int countMin = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (max < matrix[i][j]) {
					max = matrix[i][j];
					countMax = 1;
					resultMax = "" + max + ", (" + i + "; " + j + "), ";
				} else if(min > matrix[i][j]) {
					min = matrix[i][j];
					countMin  = 1;
					resultMin = "" + min + ", (" + i + "; " + j + "), ";
				} else if(max == matrix[i][j]) {
					resultMax += "(" + i + "; " + j + "), ";
					countMax++;
				} else if(min == matrix[i][j]) {
					resultMin += "(" + i + "; " + j + "), ";
					countMin++;
				}
			}
		}

		resultMax += "\nSố lần xuất hiện: " + countMax;
		resultMin += "\nSố lần xuất hiện: " + countMin;
		return resultMax + "\n\n" + resultMin;
	}
}
