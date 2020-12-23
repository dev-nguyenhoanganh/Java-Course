/**
 * @Project_Name 32_AnhNH_Matrix Fun
 */
package com.luvina.main;

import com.luvina.matrix.MatrixFun;

/**
 * @author Hoang Anh
 * @since 21 thg 12, 2020
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MatrixFun matrix = new MatrixFun();

		matrix.initMatrix();
		System.out.println(matrix);

		System.out.println("Ma trận mới:");
		matrix.maxDiagonalLine();

		matrix.findMinMax();
	}

}
